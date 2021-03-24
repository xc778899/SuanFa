package leetcodeSummary;

import java.util.Stack;

public class 判断括号是否有效 {
    public static void main(String[] args) {

        char[] s = {'(','(','[',']',')',')','{','}'};
        System.out.println(affective(s));
    }

    public static boolean affective(char[] chars){
        if (chars.length==0) return false;
        Stack<Character> stack = new Stack<>();
        for (int i=0;i<chars.length;i++){
            if (chars[i]=='('||chars[i]=='['||chars[i]=='{'){
                stack.push(chars[i]);
            }else{
                if (stack.isEmpty()) return false;
                Character pop = stack.pop();
                if (chars[i]==')'){
                    if (pop!='(') return false;
                }else if (chars[i]==']'){
                    if (pop!='[') return false;
                }else if (chars[i]=='}'){
                    if (pop!='{') return false;
                }
            }
        }
        if (stack.isEmpty()) return true;
        else return false;
    }
}
