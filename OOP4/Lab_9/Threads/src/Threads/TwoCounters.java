package Threads;


public class TwoCounters {

    public static void main(String args[]) {
        
        SharedNumber count = new SharedNumber();
        
        Counter counter1 = new Counter(count);
        Counter counter2 = new Counter(count);
        
        Thread t1 = new Thread(counter1);
        Thread t2 = new Thread(counter2);
        
        t1.start();   
        t2.start();
       
    }
} 

class Counter implements Runnable {
    private SharedNumber count;

    public Counter(SharedNumber count) {
        this.count = count;
    }

    public void run() {
        for (int i = 1; i <= 1000000; i++)
            count.increment();
    }
}


class SharedNumber {

    private int n = 0;

    public SharedNumber () {
    }

    public void increment() {
        n = n + 1;
        
        System.out.println(n);
    }
}


