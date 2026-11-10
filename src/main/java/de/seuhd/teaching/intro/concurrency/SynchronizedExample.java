package de.seuhd.teaching.intro.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SynchronizedExample {
    private static int staticSum = 0;
    private int sum = 0;
    private int count = 0;

    public int getSum() { return sum; }

    public void setSum(int sum) { this.sum = sum; }

    public int getCount() { return count; }

    public void setCount(int count) { this.count = count; }

    // a synchronized method locks the object (this)
    public synchronized void synchronisedCalculate() {
        setSum(getSum() + 1);
    }

    // a synchronized static method locks the class object SynchronizedExample.class
    public static synchronized void syncStaticCalculate() {
        staticSum = staticSum + 1;
    }

    // a synchronized block locks the object in parentheses (this) only while its statements run
    public void syncBlockCalculate() {
        synchronized (this) {
            setCount(getCount()+1);
        }
    }

    void main() {
        try (ExecutorService service = Executors.newFixedThreadPool(3)) {
            for (int i = 0; i < 1000; i++) {
                service.submit(this::synchronisedCalculate);
                service.submit(SynchronizedExample::syncStaticCalculate);
                service.submit(this::syncBlockCalculate);
            }
        } // try-with-resources calls close(), which waits until all submitted tasks have finished
        IO.println(sum + ", " + staticSum + ", " + count); // 1000, 1000, 1000
    }
}
