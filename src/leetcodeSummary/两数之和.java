package leetcodeSummary;

import java.util.Map;
import java.util.TreeMap;

public class 两数之和 {
    public static void main(String[] args) {
        int[] a = {1,4,5,6,6,7,9};
        int sum = 12;
        System.out.println(f(a, sum));
    }

    public static Map<Integer,Integer> f(int[] a, int sum){
        int i=0,j=a.length-1;
        Map<Integer,Integer> m = new TreeMap<>();
        while (i<j){
            while (i<j && a[i]+a[j]<12){
                i++;
            }
            while (i<j && a[i]+a[j]>12){
                j--;
            }
            if (a[i]+a[j]==12){
                m.put(i,j);
                i++;
            }
        }
        return m;
    }
}
