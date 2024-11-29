package Maths;

public class FastPower {

    public static void main(String[] args) {
        int a = 9;
        int b = 20;
        int m = 100000000;
        long ans = 1;
        a = a%m;
        //brute force
        for(int i = 0; i<b ; i++){
            ans = (ans * a)%m;
        }
        System.out.println(ans);

        //fast approach(logn time)

        System.out.println(fastPow(a, b, m));
    }

    public static long fastPow(int a, int b, int m){
        if(b == 0) return 1;
        long x = fastPow(a, b/2, m);
        if(b%2 == 0) return (x * x) % m;
        return (((a * x)%m)*x)%m;
    }
}
