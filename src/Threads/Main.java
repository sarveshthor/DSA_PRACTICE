package Threads;

public class Main {

    public static void main(String[] args) {

        PrintNumbers printNumbers = new PrintNumbers();

        Thread t1 = new Thread(() -> printNumbers.printOddNumbers());

        Thread t2 = new Thread(() -> printNumbers.printEvenNumbers());

        t1.start();
        t2.start();
    }
}
