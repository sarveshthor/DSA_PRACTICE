package Threads;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {
    private final Queue<Integer> queue = new LinkedList<>();
    private final int capacity = 5;

    public synchronized void  produce() throws InterruptedException{
        int value = 0;
        while(true){
            while(queue.size() == capacity){
                wait();
            }
            queue.add(value++);
            System.out.println("Produced: " + value);
            notify();
            Thread.sleep(500);
        }
    }

    public synchronized void consume() throws InterruptedException{
        while(true){
            while(queue.isEmpty()){
                wait();
            }
            int x = queue.poll();
            System.out.println("Consumed: " + x);
            notify();
            Thread.sleep(500);

        }
    }
}
