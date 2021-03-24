package LeetCode3;

public class 斐波那契数列 {
    public static void main(String[] args) {
        System.out.println(f(0));
    }
    public static int f(int n){
        if (n==0||n==1) return n;
        int i=0,j=1;
        int c=0;
        while (n-->1){
            c = i+j;
            i = j;
            j = c;
        }
        return c;
    }
}
