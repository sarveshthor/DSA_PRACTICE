package DP;

public class Fibonacci {

    public static void main(String[] args) {

        nfib(10);
        System.out.println(rfib(1));
        int[] F = new int[10];
        System.out.println(rdfib(9, F));

    }

    //normal without recursion and dp
    public static void nfib(int n){
        int a = 1;
        int b = 1;

        for(int i = 1 ; i<=n ; i++){
            if(i == 1) System.out.println(a);
            else if(i == 2) System.out.println(b);
            else{
                System.out.println(a+b);
                int x = b;
                b = a + b;
                a = x;

            }
        }
    }

    //recursion and no dp
    public static int rfib(int n){
        if(n<0) return 0;
        if(n<=2){
            return 1;
        }

        return rfib(n-1) + rfib(n-2);
    }

    //recursion and dp
    public static int rdfib(int n, int[] F){
        if(n<=1) return 1;
        if(F[n] >0) return F[n];
        F[n] = rdfib(n-1, F) + rdfib(n-2, F);
        return F[n];
    }
}
