package LeetCode4;

public class 反转字符串 {
    public static void main(String[] args) {
        char[] c = {'1','2','3','4','5'};
        reverseRecursion(c);
        System.out.println(c);
    }

    public static void reverseString(char[] s) {
        int i=0,j=s.length-1;
        char t;
        while (i<j){
            t = s[i];
            s[i] = s[j];
            s[j] = t;

            i++;
            j--;
        }
    }

    // 位运算
    public void reverseString1(char[] s) {
        int n = s.length;
        for (int i = 0; i < n / 2; ++i) {
            int j = n - 1 - i;
            s[i] ^= s[j];
            s[j] ^= s[i];
            s[i] ^= s[j];
        }
    }

    // 递归
    public static void reverseRecursion(char[] s){
        if (s.length==0) return;
        Recursion(s,0,s.length-1);

    }
    public static void Recursion(char[] s,int l,int r){
        if (l>=r) return;
        Recursion(s,l+1,r-1);
        char t;
        t = s[l];
        s[l] = s[r];
        s[r] = t;
     }
}
