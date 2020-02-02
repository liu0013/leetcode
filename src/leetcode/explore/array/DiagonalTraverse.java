package leetcode.explore.array;

public class DiagonalTraverse {
    /**
     * case1: [][]
     * case2: [ 1,  2,  3]
     *        [ 4,  5,  6]
     *        [ 7,  8,  9]
     *        [10, 11, 12]
     *        
     * @param matrix
     * @return
     */
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0) {
            return new int[0];
        }
        int row = matrix.length;
        int col = matrix[0].length;
        int len = row * col;
        int[] result = new int[len];
        boolean up = true;
        int t = 0;
        int c = 0;
        int r = 0;
        do {
            result[t] = matrix[r][c];
            if (up) {
                if (r-1 >= 0 && c+1 < col ) {
                    c++;
                    r--;
                } else {
                    if (c+1 < col) {
                        c++;
                    } else {
                        r++;
                    }
                    up = false;
                }
            } else {
                if (c-1 >= 0 && r+1 < row) {
                    r++;
                    c--;
                } else {
                    if (r+1 < row) {
                        r++;
                    } else{
                        c++;
                    }
                    up = true;
                }
            }
        } while(++t < len);
        return result;
    }
}
