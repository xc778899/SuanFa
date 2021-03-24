package leetcodeSummary;

import java.util.Arrays;

public class t1 {
    public static void main(String[] args) {
        int[] a = new int[6];
        for (int i=0;i<5;i++){
            a[i] = i;
        }
        // 0, 1, 2,3 ,4
        for (int i=4;i>=0;i--){
            a[i+1] = a[i];
        }
        a[0] = 10;
        System.out.println(Arrays.toString(a));
    }
}
