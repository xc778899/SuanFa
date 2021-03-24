package leetcodeSummary;

public class 找不同 {

    public static void main(String[] args) {

        String s1="abcd";
        String s2="abcde";
        System.out.println(different(s1,s2));
    }

    /*在给定的一个字符串中随机重排,获得一个新串,然后随机加一个字母,找出加的哪个字母*/

    public static final char different(String s1,String s2){
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        int sum1=0;
        int sum2=0;
        for (int i=0;i<c1.length;i++){
            sum1+=c1[i];
        }
        for (int i=0;i<c2.length;i++){
            sum2+=c2[i];
        }

//        return (char)(sum2-sum1);
        return (char)(s2.chars().sum()-s1.chars().sum());
    }
}
