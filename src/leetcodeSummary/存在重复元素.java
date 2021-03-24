package leetcodeSummary;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class 存在重复元素 {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,5};
        System.out.println(duplicate1(a));
    }

    /*
    给定一个整数数组, 如果有重复元素,返回true, 没有返回false
    */
    public static boolean duplicate(int[] arr){
        Map<Integer,Integer> m = new LinkedHashMap<>();
        for (int i=0;i<arr.length;i++)
            m.put(arr[i],i);
        if (m.size()!=arr.length) return true;
        else return false;
    }
    public static boolean duplicate1(int[] arr){
        return Arrays.stream(arr).distinct().count()!= arr.length;
    }

}
