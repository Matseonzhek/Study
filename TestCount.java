package Threads.JCIP.listing511;

public class TestCount implements Runnable {
    int i=0;

    @Override
    public void run() {
        for (int j = 1; j < 5; j++) {
            System.out.println(Thread.currentThread().getName() + " " + i++);

        }


    }
}
