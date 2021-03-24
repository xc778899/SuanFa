package LeetCode1;

/*第 i 个人的体重为 people[i]，每艘船可以承载的最大重量为 limit。
每艘船最多可同时载两人，但条件是这些人的重量之和最多为 limit。
返回载到每一个人所需的最小船数。(保证每个人都能被船载)。
 

示例 1：
输入：people = [1,2], limit = 3
输出：1
解释：1 艘船载 (1, 2)
示例 2：
输入：people = [3,2,2,1], limit = 3
输出：3
解释：3 艘船分别载 (1, 2), (2) 和 (3)
示例 3：
输入：people = [3,5,3,4], limit = 5
输出：4
解释：4 艘船分别载 (3), (3), (4), (5)
提示：

1 <= people.length <= 50000
1 <= people[i] <= limit <= 30000
*/

import java.util.Arrays;

public class 救生艇 {
    public static void main(String[] args) {
        int[] p = {3,5,3,4,1,2};
        int l = 5;
        System.out.println(numRescueBoats(p, l));
    }

    // 思想 : 要使使用的船最少,则要保证每一个胖子尽量带一个瘦子,如何让胖子和瘦子一起而不超重? 将最胖的人和最瘦的人放一组, 如果也超重,那没办法了,只能让胖子一个人一组,
    // 怎样保证不浪费呢(很轻的两个人坐同一艘船)? 瘦子的体重慢慢增加,直到超重
    public static int numRescueBoats(int[] people, int limit) {
        int count=0;
        int i=0,j= people.length-1;
        int[] sp = Arrays.stream(people).sorted().toArray();
        while (i<=j){
            if (i<j && sp[i]+sp[j]<=limit){
                i++;
            }
            j--; // j指向最重的那个人,最重的每次都可以走,无论超不超重,要么一个人,要么带一个轻的,所以j--的时候就要count++,
            count++;
        }
        return count;
    }
}
