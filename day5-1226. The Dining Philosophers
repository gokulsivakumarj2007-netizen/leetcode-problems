import java.util.concurrent.Semaphore;

class DiningPhilosophers {
    
    // Limits the number of philosophers dining simultaneously to 4.
    // This strictly prevents a deadlock condition where all 5 grab one fork.
    private final Semaphore grabForks;
    // Mutex locks for each of the 5 individual forks
    private final Semaphore[] forks;

    public DiningPhilosophers() {
        grabForks = new Semaphore(4);
        forks = new Semaphore[5];
        for (int i = 0; i < 5; i++) {
            forks[i] = new Semaphore(1);
        }
    }

    // call the run() method of any runnable to execute its code
    public void wantsToEat(int philosopher,
                           Runnable pickLeftFork,
                           Runnable pickRightFork,
                           Runnable eat,
                           Runnable putLeftFork,
                           Runnable putRightFork) throws InterruptedException {
        
        int leftFork = philosopher;
        int rightFork = (philosopher + 1) % 5;
        
        // 1. Acquire permission to try and eat (max 4 philosophers at a time)
        grabForks.acquire();
        
        // 2. Lock both forks
        forks[leftFork].acquire();
        forks[rightFork].acquire();
        
        // 3. Execute actions
        pickLeftFork.run();
        pickRightFork.run();
        eat.run();
        putLeftFork.run();
        putRightFork.run();
        
        // 4. Release locks and permission
        forks[leftFork].release();
        forks[rightFork].release();
        grabForks.release();
    }
}
