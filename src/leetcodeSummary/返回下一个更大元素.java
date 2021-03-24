package leetcodeSummary;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;

public class 返回下一个更大元素 {
    public static void main(String[] args) {
        int[] a ={4,1,2};
        int[] b = {1,3,4,2};
        ArrayList<Integer> f = f1(a, b);
        Map<Integer, Integer> map = f2(b);
//        System.out.println(f);
        for (int i=0;i<a.length;i++) {
            System.out.println(map.get(a[i]));
        }
    }

    public static ArrayList<Integer> f(int[] a,int[] b){
        ArrayList<Integer> arr = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        Stack<Integer> s1 = new Stack<>();
        for (int i=0;i<b.length;i++){
            s.push(b[i]);
        }
        Stack<Integer> sb = (Stack<Integer>) s.clone();
        for (int i=0;i<a.length;i++){
            while(s.peek()!=a[i]){
                if (s.peek()>a[i]) {
                    s1.push(s.peek());
                    s.pop();
                }else{
                    s.pop();
                }

            }
            if (s1.isEmpty()) arr.add(-1);
            else arr.add(s1.peek());
            s = (Stack<Integer>)sb.clone();
            s1.clear();
        }
        return arr;
    }

    public static ArrayList<Integer> f1(int[] a,int[] b){
        ArrayList<Integer> arr = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        Stack<Integer> s1 = new Stack<>();
        for (int i=0;i<b.length;i++){
            s.push(b[i]);
        }
        int top;
        for (int i=0;i<a.length;i++){
            while((top=s.peek())!=a[i]&&top>a[i]){
                s1.push(top);
                s.pop();
            }
            if (s1.isEmpty()) arr.add(-1);
            else arr.add(s1.peek());
            while(!s1.isEmpty())
                s.push(s1.pop());
        }
        return arr;
    }

    public static Map<Integer,Integer> f2(int[] b){
        /*栈 + map */
//        ArrayList<Integer> arr = new ArrayList<>();
        // 2,1,0,8,7,6,5,9
        Map<Integer,Integer> m = new LinkedHashMap<>();
        Stack<Integer> s = new Stack<>();
        for (int i=0;i< b.length;i++){
            if (s.isEmpty()||b[i]<s.peek()) s.push(b[i]);
            else{
                while (!s.isEmpty()&&b[i]>s.peek())
                    m.put(s.pop(),b[i]);
                s.push(b[i]);
            }
        }
        while (!s.isEmpty())
            m.put(s.pop(),-1);
        return m;
    }
}
