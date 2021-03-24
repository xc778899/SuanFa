package LeetCode5;

import java.util.ArrayList;
import java.util.List;

public class 括号生成 {

    public static void main(String[] args) {
        int n=3;
        System.out.println(generateParenthesis(n));
    }

    public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        getString(res,n,0,0,"");
        return res;
    }

    // 回溯法 backtracking
    public static void getString(List<String > res, int n, int l, int r, String str){
        if (l<r) return;
        if (l==r&&r==n) {
            res.add(str);
            return;
        }

        if (l<n)
        getString(res,n,l+1,r,str+"(");
        if (r<l)
        getString(res,n,l,r+1,str+")");

    }

}
