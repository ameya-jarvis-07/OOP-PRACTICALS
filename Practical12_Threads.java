class SharedResource {
    private boolean available = false;

    public synchronized void waitForSignal() {
        try {
            while (!available) {
                System.out.println(Thread.currentThread().getName() + " is waiting...");
                wait();
            }
            System.out.println(Thread.currentThread().getName() + " got the signal!");
            available = false; // Reset for possible reuse, if required
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore interrupted status
            e.printStackTrace();
        }
    }

    public synchronized void sendSignal() {
        available = true;
        System.out.println(Thread.currentThread().getName() + " sends signal (notify)");
        notify();
    }

    public synchronized void sendSignalToAll() {
        available = true;
        System.out.println(Thread.currentThread().getName() + " sends signal to all (notifyAll)");
        notifyAll();
    }
}

public class Practical12_Threads {
    public static void main(String[] args) throws InterruptedException {
        SharedResource resource = new SharedResource();

        Thread t1 = new Thread(resource::waitForSignal, "Thread-1");
        Thread t2 = new Thread(resource::waitForSignal, "Thread-2");
        t1.start();
        t2.start();

        Thread.sleep(1000);
        new Thread(resource::sendSignal, "Notifier").start();

        Thread.sleep(1000);
        new Thread(resource::sendSignalToAll, "NotifierAll").start();
    }
}
