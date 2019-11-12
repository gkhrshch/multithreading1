package threads;

public class ThreadR implements Runnable {
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println(i);
            i++;
        }
    }
}
