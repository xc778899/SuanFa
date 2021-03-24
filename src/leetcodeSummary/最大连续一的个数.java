package leetcodeSummary;

import java.util.*;

public class 最大连续一的个数 {
    public static void main(String[] args) {
        // 0,1,0,1,1,0,1,1,1,0
        Scanner sc = new Scanner(System.in);
        int maxLength = 10;
        int[] a = new int[10];
        for (int i=0;i<10;i++)
        {
            a[i] = sc.nextInt();
        }
        int j=0;
        int result=0;
        // 如何表示连续?
        for (int i=0;i<10;i++){
            if (a[i]==1){
                j+=1;
            }else{
                if (j>result) {
                    result = j;
                    j = 0;
                }
            }
        }
        System.out.println(result);
    }
}
