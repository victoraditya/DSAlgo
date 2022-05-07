package multithread;

public class WaitNotify {

    public void consumer() throws InterruptedException {
        synchronized (this) {

            System.out.println("From consumeer");
            wait();
            System.out.println("Back to consumer");
        }
    }

    public void producer() {
        synchronized (this) {
            System.out.println("From Producer");
            notify();
        }
    }

    public static void main(String[] args) {

        WaitNotify waitNotify = new WaitNotify();

        new Thread(() -> {
            try {
                waitNotify.consumer();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> waitNotify.producer()).start();

    }
}
