package LeetCode2;

import com.sun.source.tree.Tree;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class 搜素二维矩阵 {
    public static void main(String[] args) {
        int[][] a = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(searchMatrix1(a, 4));
    }

//    public static boolean f(int[][] matrix, int target){
//        int[] indexArr = new int[matrix.length*matrix[0].length];
//        for (int i=0,index=0;i<matrix.length;i++){
//            indexArr[index] = matrix[i][0];
//            index += matrix[i].length;
//        }
//        int l=0,r= indexArr.length-1;
//    }

    public static boolean f1(int[][] matrix,int target){
        int[] indexArr = new int[matrix.length*matrix[0].length];
        for (int i=0;i< matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                int k = i* matrix[0].length+j;
                indexArr[k] = matrix[i][j];
            }
        }
        int l=0,r= indexArr.length-1,mid;
        while (l<=r){
            mid = (l+r)/2;
            if (indexArr[mid]<target)
                l = mid+1;
            else if(indexArr[mid]>target) r = mid-1;
            else return true;
        }
        return false;
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0)
            return false;
        int row = 0, col = matrix[0].length-1;
        while(row < matrix.length && col >= 0){
            if(matrix[row][col] < target) // 从第一行的最后一个元素开始找,如果比它大,则去下一行找
                row++;
            else if(matrix[row][col] > target) // 从每一行的最后一个元素开始找,如果比它小,则去上一列找
                col--;
            else
                return true;
        }
        return false;
    }
    // 一维坐标转为二维
    public static boolean searchMatrix1(int[][] matrix, int target) {
        if (matrix.length==0) return false;
        int begin,end,mid;
        begin=end=mid=0;
        int len1= matrix.length,len2=matrix[0].length;
        end = len1*len2-1;
        while (begin<=end){
            mid = (begin+end)/2;
            if (matrix[mid/len2][mid%len2]>target){
                end = mid -1;
            }
            else if (matrix[mid/len2][mid%len2]<target)
                begin = mid +1;
            else return true;
        }
        return false;
    }
}
