package leetcodeSummary;

public class 移除指定元素并返回数组长度剩下的元素以任意顺序 {
    public static void main(String[] args) {
        System.out.println(f(new int[]{0, 1, 2, 2, 2,3,4 ,4, 0, 2, 3}, 2));
    }
    public static int f(int[] arr, int val){

        int l=0,r=arr.length-1,t;
        while(l<r){
            while(l<r && arr[l]!=val)
                l++;
            while(l<r && arr[r]==val)
                r--;
            t = arr[l];
            arr[l] = arr[r];
            arr[r] = t;
        }
        return l;
    }
}
