package 其他算法;

import java.util.Collections;

public class 并查集 {
    public static void main(String[] args) {

        union u = new union();
        u.merge(3,1);
        u.merge(1,4);
        u.merge(6,4);
        System.out.println("5的团伙代表人是 : "+u.getFather(5));
        System.out.println("6和4是不是同一团伙 : "+u.query(6,4));
    }
}


class union{
    private int length =100;
    private int[] f = new int[length];

    public union() {
        for (int i=0;i<length;i++){
            f[i] = i;
        }
    }

    // 查询团伙代表人
    public int getFather(int a)
    {
        return f[a] == a ? a : getFather(f[a]);
    }

    // 合并操作 (b是a的团伙代表人)
    public void merge(int a,int b){
        f[getFather(a)] = getFather(b);
    }


    // 查询是否为同一团伙
    public boolean query(int a, int b){
        return getFather(a) == getFather(b);
    }




}
