package thread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread thread = new MyThread(counter);
        Runnable runnable = new MyRunnable(counter);

        thread.start();
        new Thread(runnable).start();
    }
}
