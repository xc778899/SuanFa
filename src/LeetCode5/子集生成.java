package LeetCode5;

import java.util.ArrayList;
import java.util.List;

public class 子集生成 {
    public static void main(String[] args) {
        int[] n = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        System.out.println(generateSubArray(n));
    }

    public static int generateSubArray(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        getSubArray(res,nums);
        return res.size();
    }

    public static void getSubArray(List<List<Integer>> res,int[] n) {
        if (res.size()==0) res.add(new ArrayList<>());

        List<Integer> l = new ArrayList<>();
        for (Integer i:n){

            List<List<Integer>> temp = new ArrayList<>();
            for (List<Integer> r : res){
                List<Integer> copy = new ArrayList<>(r);
                copy.add(i);
                temp.add(copy);
            }
            res.addAll(temp);
        }
    }
}
