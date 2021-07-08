package thread;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread thread = new MyThread(counter);
        Runnable runnable = new MyRunnable(counter);

        thread.start();
        new Thread(runnable).start();
    }
}
