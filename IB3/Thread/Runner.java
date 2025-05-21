package IB3.Thread;

public class Runner implements Runnable {
    private String message;

    public Runner(String message) {
        this.message = message;
    }

    public void run() {
        for (int i = 0; i < 100000; i++) {
            System.out.println("Thread: " + message);
        }
    }
}
