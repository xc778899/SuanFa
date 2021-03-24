package Test;

import java.util.*;

public class t1 {
    public static void main(String[] args) {
        long s = System.currentTimeMillis();

        int fib = fib1(48);

        long e = System.currentTimeMillis();
        System.out.println(fib);
        System.out.println("用时: "+(e-s)+"ms");
    }

    public static int fib(int n){
        if (n<2) return n;
        return fib(n-1)+fib(n-2);
    }
    public static int fib1(int n) {
        int pre = 0, cur = 1;
        int next;
        for (int i = 1; i < n; i++) {
            next = pre + cur;
            pre = cur;
            cur = next;
        }
        return cur;
    }
}
