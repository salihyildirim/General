package Thread;

public class ThreadKronometre implements Runnable {

    Thread thread;
    String threadName;

    public ThreadKronometre(String threadName) {
        this.threadName = threadName;
        System.out.println("Thread oluşturuluyor.. " + threadName);

    }

    @Override
    public void run() {
        System.out.println("Thread calisiyor " + threadName);
        try {
            for (int i = 0; i <= 10; i++) {
                System.out.println(i + "inci saniye" + threadName);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e.toString());
        }
    }

    public void start() {
        System.out.println("thread start " + threadName);
        System.out.println();
        if (thread == null) {
            thread = new Thread(this, threadName);
        }
        thread.start();
    }
}
