package multithreading;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {
    
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        Thread t1 = new Thread(new Task(lock));
        Thread t2 = new Thread(new Task(lock));

        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        t2.start();
    }
}

class Task implements Runnable {
    private ReentrantLock lock;

    Task(ReentrantLock lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        while (true) {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " trying to acquire the lock.");
            lock.lock();
            System.out.println(threadName + " acquired a lock");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            lock.unlock();
            System.out.println(threadName + " released a lock");
        }
    }
}
