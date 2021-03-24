package leetcodeSummary;

import java.util.Arrays;

public class 顺序将0移动到数组末尾 {
    public static void main(String[] args) {
        int[] f = f(new int[]{0, 1, 0, 3, 12});
        System.out.println(Arrays.toString(f));

    }

    public static int[] f(int[] arr){
        int index=0;
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]!=0) {
                arr[index] = arr[i];
                index++;
            }
        }
        for (int i= index;i< arr.length;i++)
        {
            arr[i]=0;
        }
        return arr;
    }
}
