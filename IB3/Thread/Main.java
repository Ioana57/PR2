package IB3.Thread;

public class Main {
    public static void main(String[] args) throws Exception {
        Thread runner1 = new Thread(new Runner("Hello Threads 1111111!"));
        runner1.setPriority(10);
        runner1.start();

        Thread runner2 = new Thread(new Runner("Hello Threads 2222222"));
        runner2.setPriority(1);
        runner2.start();

        for (int i = 0; i < 100000; i++) {
            System.out.println("Hello from Main!");
        }
    }
}
