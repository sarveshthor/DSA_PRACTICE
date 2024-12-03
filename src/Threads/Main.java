package Threads;

import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        PrintNumbers printNumbers = new PrintNumbers();

        Thread t1 = new Thread(() -> printNumbers.printOddNumbers());

        Thread t2 = new Thread(() -> printNumbers.printEvenNumbers());

        t1.start();
        t2.start();

        Comparator<double[]> comp = new Comparator<>(){
            public int compare(double[] arr1, double[] arr2){
                return Double.compare(arr2[2], arr1[2]);
            }
        };
    }
}
