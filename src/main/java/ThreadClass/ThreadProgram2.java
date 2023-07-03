package main.java.ThreadClass;
class Thread2 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadProgram2 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Thread2());
        thread.start();
    }
}