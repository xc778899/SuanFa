package LeetCode6;

import java.util.LinkedList;
import java.util.Scanner;

public class NQueens {

    private static int SIZE = 0;//皇后的个数
    private static int count = 0;//记录摆放的方式数
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.println("请输入你要解决几个皇后的问题");
        SIZE = input.nextInt();
        input.close();
        LinkedList<Location> route = new LinkedList<Location>();
        NQueen(route,  0);  //从棋盘的第0行开始
        System.out.println(SIZE + "皇后共有 " + count + "种摆放方式");

    }

    private static void NQueen(LinkedList<Location> route, int row) {
        if (route.size()==SIZE){
            count++;
            System.out.println(route);
            return;
        }

        for (int i=0;i<SIZE;i++){
            Location loc = new Location(row, i);
            if (isInValid(loc,route))
                continue;
            route.add(loc);
            NQueen(route,row+1);
            route.removeLast();
        }

    }

    private static boolean isInValid(Location loc, LinkedList<Location> route) {
        for (Location l : route){
            if (l.x==loc.x||l.y==loc.y) return true;
            if (Math.abs(l.x-loc.x)==Math.abs(l.y-loc.y)) return true;
        }
        return false;

    }

    static class Location{
        public int x; // 行
        public int y; // 列

        public Location(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public Location() {
        }

        @Override
        public String toString() {
            return "("+ x +","+
                    + y +
                    ')';
        }
    }


}
