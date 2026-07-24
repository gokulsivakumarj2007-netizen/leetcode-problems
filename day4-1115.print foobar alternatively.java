mport java.util.concurrent.Semaphore;

class FooBar {
    private int n;
    private final Semaphore fooSem = new Semaphore(1);    // foo starts first
    private final Semaphore barSem = new Semaphore(0);    // bar waits initially

    public FooBar(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            fooSem.acquire();           // Wait for permission
            printFoo.run();             // print "foo"
            barSem.release();           // Allow bar to print
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            barSem.acquire();           // Wait for foo to finish
            printBar.run();             // print "bar"
            fooSem.release();           // Allow next foo
        }
    }
}
