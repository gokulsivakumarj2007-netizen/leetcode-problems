import java.util.concurrent.Semaphore;

class Foo {
    
    private final Semaphore firstSem  = new Semaphore(1);   // Starts available
    private final Semaphore secondSem = new Semaphore(0);   // Starts blocked
    private final Semaphore thirdSem  = new Semaphore(0);   // Starts blocked

    public Foo() {
    }

    public void first(Runnable printFirst) throws InterruptedException {
        firstSem.acquire();                    // Acquire permission
        printFirst.run();                      // print "first"
        secondSem.release();                   // Allow second() to run
    }

    public void second(Runnable printSecond) throws InterruptedException {
        secondSem.acquire();                   // Wait for first() to finish
        printSecond.run();                     // print "second"
        thirdSem.release();                    // Allow third() to run
    }

    public void third(Runnable printThird) throws InterruptedException {
        thirdSem.acquire();                    // Wait for second() to finish
        printThird.run();                      // print "third"
    }
}
