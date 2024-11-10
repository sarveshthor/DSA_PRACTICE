package Threads;

public class PrintNumbers{
    private int counter = 1;

    public synchronized void printOddNumbers(){
        while(counter <= 10){
            while(counter %2 == 0){
                try{
                    wait();
                }
                catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                }

            }
            if(counter < 11)
             System.out.println(Thread.currentThread().getName() + " : " + counter);
            counter++;
            notify();

        }
    }

    public synchronized void printEvenNumbers(){
        while(counter <= 10){
            while(counter %2 != 0){
                try{
                    wait();
                }
                catch(InterruptedException e){
                    Thread.currentThread().interrupt();
                }


            }

            if(counter < 11)
             System.out.println(Thread.currentThread().getName() + " : " + counter);
            counter++;
            notify();

        }


    }

}
