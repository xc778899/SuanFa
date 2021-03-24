package leetcodeSummary;

/*在未排序的数组中找到第 k 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。

示例 1:

输入: [3,2,1,5,6,4] 和 k = 2
输出: 5
示例 2:

输入: [3,2,3,1,2,4,5,5,6] 和 k = 4
输出: 4
*/

import java.util.Collections;
import java.util.PriorityQueue;

public class 数组中第k个最大元素 {

    public static void main(String[] args) {

        int[] arr = {3,2,3,1,2,4,5,5,6};
        int k = 4;
//        System.out.println(f(arr,k));
        System.out.println(f1(arr,k));


    }

    // 正常排序算法
    public static int f(int[] arr, int k){
        int t;
        for (int i=0;i< arr.length-1;i++){
            for (int j=0;j< arr.length-1-i;j++){
                if (arr[j]<arr[j+1]){
                    t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
        return arr[k-1];
    }

    // 使用最大堆
    public static int f1(int[] arr, int k){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i=0;i< arr.length;i++){
            maxHeap.add(arr[i]);
        }
        for (int i=0;i<k-1;i++)
        {
            maxHeap.poll();
        }
        return maxHeap.peek();
    }
}
