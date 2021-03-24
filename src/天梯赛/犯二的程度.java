package 天梯赛;

import java.util.Scanner;

/*一个整数“犯二的程度”定义为该数字中包含2的个数与其位数的比值。如果这个数是负数，则程度增加0.5倍；
如果还是个偶数，则再增加1倍。例如数字“-13142223336”是个11位数，其中有3个2，并且是负数，也是偶数，
则它的犯二程度计算为：3/11*1.5*2*100%，约为81.82%。本题就请你计算一个给定整数到底有多二。

输入格式：

输入第一行给出一个不超过50位的整数N。

输出格式：

在一行中输出N犯二的程度，保留小数点后两位。

输入样例：
-13142223336
输出样例：
81.82%
*/
public class 犯二的程度 {

    /*总结 : 输入50位数只能通过输入字符串来实现,比较字符和int需要将字符-'0', */
    public static void main(String[] args) {
        double fan2 = 0;
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] chars = s.toCharArray();
        int count2=0;
        for (int i=0;i<chars.length;i++){
            if (chars[i]-'0'==2){
                count2++;
            }
        }
        fan2 = ((double) (count2)/(double) (s.length()-1));
        if (s.charAt(0)=='-')
        {
            fan2*=1.5;
            if ((int)s.charAt(chars.length-1)%2==0){
                fan2 *= 2;
            }
        }
        else if ((int)s.charAt(chars.length-1)%2==0){
            fan2 *= 2;
        }
        System.out.printf("%.2f",fan2*100);
        System.out.println("%");
    }

}
