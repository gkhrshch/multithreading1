package threads;

public class ThreadT extends Thread {

    @Override
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println(i);
            i++;
        }
    }
}
