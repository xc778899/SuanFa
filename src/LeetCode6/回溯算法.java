package LeetCode6;

import java.util.*;

public class 回溯算法 {
    public static LinkedList<List<Integer>> res = new LinkedList<>();
    public static void main(String[] args) {
        int[] a ={1,2,3};
        System.out.println(Permutation(a));
    }
/*
    res = [];
    void backtrack(selections, route){
    if (没有选择了){
        res.add(route);
        return;
    }
    for (selection : selections){
        selection.addto route
        remove selection from selections;
        backtrack(selections, route)

        remove the last item in route
        add the item to the selections;
    }
 */

    public static LinkedList<List<Integer>> Permutation(int[] n){
        backtrack(n,new LinkedList<>());
        return res;
    }
    public static void backtrack(int[] n,LinkedList<Integer> route){
        if (n.length==route.size())
        {
            res.add(List.copyOf(route));
            // route 一直在改变, 如果将route的引用放进res, 引用改变, res里的route一样改变
            // 可以List.copy(route) 也可以创建一个新的List : new LinkedList(route)
            return;
        }

        for (int i=0;i<n.length;i++){
            if (route.contains(n[i])) continue;
            route.add(n[i]);
            backtrack(n,route);
            route.removeLast(); // 会出现引用传递, route的所有引用对象都会removeLast, 包括已经加入到res中的route
        }
    }

    public static void backtrack1(LinkedList<Integer> selections,LinkedList<Integer> route){
        if (selections.size()==0){
            res.add(new LinkedList<>(route));
            return;
        }
        List<Integer> copysele = List.copyOf(selections);
        for (Integer selection: copysele){
            selections.remove(selection);
            route.add(selection);
            backtrack1(selections,route);
            route.removeLast();
            selections.add(selection);
        }
    }

}
