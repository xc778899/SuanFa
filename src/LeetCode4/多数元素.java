package LeetCode4;

/*给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于⌊ n/2 ⌋的元素。

你可以假设数组是非空的，并且给定的数组总是存在多数元素。



示例1：

输入：[3,2,3]
输出：3
示例2：

输入：[2,2,1,1,1,2,2]
输出：2
*/

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class 多数元素 {
    public static void main(String[] args) {
        int[] a = {3,3,4};
        System.out.println(f1(a));
    }

    public static int f(int[] nums){
        Map<Integer,Integer> m = new TreeMap<>();
        int count=0;
        if (nums.length%2==0) count=nums.length/2;
        else count= nums.length/2+1;
        for (int i=0;i< nums.length;i++){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        Set<Map.Entry<Integer, Integer>> entries = m.entrySet();
        for (Map.Entry<Integer, Integer> entry:entries){
            Integer value = entry.getValue();
            if (value >= count)
                return entry.getKey();
        }
        return 0;
    }
    public static int f1(int[] nums){
        return Multitude(nums,0, nums.length-1);
    }

    /*分治法*/
    public static int Multitude(int[] num, int l, int r){
        if (l==r) return num[r]; // 递归出口 : 当分治的左指针和右指针相等时,返回这个数,说明已经分到不能再分了,那么这个数就是这个小数组的众数

        int mid = (l+r)/2; // 分成左右两个部分
        int lm = Multitude(num, l, mid); // 分别求左边部分和右边部分的众数
        int rm = Multitude(num,mid+1,r);
        if (lm==rm) return lm; // 如果左右两边的众数都相等, 那么这个数就是大数组的众数,返回即可找到当前长度数组的众数
        else { // 如果左右两边的众数不相等
            int lmcount=0,rmcount=0; // 计算两个数组和并后左边众数出现的次数和右边众数出现的次数
            for (int i=l;i<=r;i++){
                if (num[i]==lm) lmcount++;
                else rmcount++;
            }
            if (lmcount>rmcount) return lm; // 如果左边众数出现次数多,返回左边众数
            else return rm; // 否则返回右众数
        }
    }

}
