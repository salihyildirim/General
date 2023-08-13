package Thread;

public class Main{
    public static int amount = 0;

    public static void main(String[] args) {
//        Main thread = new Main();
//        thread.start();
//        // Wait for the thread to finish
//        while(thread.isAlive()) {
//            System.out.println("Waiting...");
//        }
//        // Update amount and print its value
//        System.out.println("Main: " + amount);
//        amount++;
//        System.out.println("Main: " + amount);
//
//    }
//    public void run() {
//        amount++;
        ThreadKronometre thread1= new ThreadKronometre("thread1");
        ThreadKronometre thread2= new ThreadKronometre("thread2");
        ThreadKronometre thread3= new ThreadKronometre("thread3");
        thread1.start();
        thread2.start();
        thread3.start();
    }

}
