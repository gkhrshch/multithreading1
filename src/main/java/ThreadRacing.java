import threads.ThreadR;
import threads.ThreadT;

public class ThreadRacing {
    public static void main(String[] args) {

        ThreadR demo1 = new ThreadR();
        long start = System.currentTimeMillis();
        demo1.run();
        long end = System.currentTimeMillis();
        float time = end - start;
        System.out.println("Thread implements Runnable execution time: " + time + "milliseconds");
        ThreadT demo2 = new ThreadT();
        start = System.currentTimeMillis();
        demo2.run();
        end = System.currentTimeMillis();
        System.out.println("Thread extends Thread execution time: " + time + "milliseconds");
    }
}
