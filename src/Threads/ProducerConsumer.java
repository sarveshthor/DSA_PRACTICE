package Threads;

public class ProducerConsumer {

    public static void main(String[] args) {

        SharedResource sharedResource = new SharedResource();

    Thread t1 = new Thread(() -> {
        try {
            sharedResource.produce();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    });

    Thread t2 = new Thread(() -> {
         try {
             sharedResource.consume();
    } catch(InterruptedException e){
             throw new RuntimeException(e);
    }
    });

    t1.start();
    t2.start();

}

}
