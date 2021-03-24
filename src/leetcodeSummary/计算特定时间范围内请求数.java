package leetcodeSummary;

import java.util.LinkedList;
import java.util.Queue;

public class 计算特定时间范围内请求数 {
    public static void main(String[] args) {
        RecentCount rc = new RecentCount();
        int ping = rc.ping(1);
        int ping1 = rc.ping(100);
        int ping2 = rc.ping(3001);
        int ping3 = rc.ping(10000);
        System.out.println(ping);
        System.out.println(ping1);
        System.out.println(ping2);
        System.out.println(ping3);

    }


}

class RecentCount{
    Queue<Integer> q = new LinkedList<>();

    public RecentCount() {
    }// 3001 2000 1000 100 10 1
    public int ping(int t){
        q.add(t);
        while(t-3000>q.peek()){
            q.poll();
        }

        return q.size();
    }

    public int ping1(int t){
        q.add(t);
        while(!q.isEmpty() && t- q.peek()>3000){
            q.poll();
        }
        return q.size();
    }
}
