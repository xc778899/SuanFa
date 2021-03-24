package LeetCode3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 定长子串中元音的最大数目 {

    public static void main(String[] args) {
        String s = "leetcode";
        int k = 3;
        System.out.println(maxVowels(s, k));
    }

    public static int maxVowels(String s, int k) {
        int r=0,cur_count=0;
        for (r=0;r<k;r++){
            if (r>=s.length()) return cur_count;
            if (isyy(s.charAt(r))) cur_count++;
        }
        int l=0,max = cur_count;
        while (r<s.length()){
            if (isyy(s.charAt(l++))) cur_count--;
            if (isyy(s.charAt(r++))) cur_count++;
            max = Math.max(max,cur_count);
        }
        return max;
    }

    public static boolean isyy(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
}
