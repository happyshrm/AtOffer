package search_in_two_dimensional_array;

/**
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，
 * 判断数组中是否含有该整数。
 * created by hongrm on 2018/3/30 21:26
 */
public class Solution {
    public static void main(String[] args) {
        int[][] a = new int[][]{{1,2},{3,4}};
        System.out.println(Find(1,a));
    }

    public static boolean Find(int target, int[][] array) {
        if (array == null)
            return false;
        int col = array[0].length -1;
        int row = 0;
        int row_length = array.length;

        while (row<row_length && col >= 0){
            if (array[row][col] == target)
                return true;
            // 在array[row][col]的左边
            if (array[row][col] > target){
                col -- ;
                //在下边
            }else {
                row ++;
            }
        }
        return false;
    }
}
