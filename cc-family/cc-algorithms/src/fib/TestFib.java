package fib;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/27.
 */
public class TestFib {

    public static void main(String[] args) {
        long time1 = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int i = fib1(n);
       long time = System.currentTimeMillis();
        long i1 = fib2(n);
        long time3 = System.currentTimeMillis();
        System.out.println(i1);
       // System.out.println("fib1花费 : "+(time-time1));
        System.out.println("fib2花费 : "+(time3-time));

    }
    public static int fib1(int n){
        if (n<2)
            return n;
        else
            return fib1(n-1)+fib1(n-2);
    }
    public static Long fib2(int n){
        Long fib2[]  = new Long[n+1];
        fib2[0] = 0L;
        if (n>0) {
            fib2[1] = 1L;
            for (int i=2;i<=n;i++){
                fib2[i] = fib2[i-1]+fib2[i-2];
            }
        }
        return fib2[n];
    }
}
