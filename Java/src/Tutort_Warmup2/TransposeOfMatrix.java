package Tutort_Warmup2;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int[][] res = transpose(matrix);
    }
        public static int[][] transpose(int[][] matrix) {
            int r = matrix.length;
            int c = matrix[0].length;
            int[][] res = new int[c][r];

            for(int i=0; i<r; ++i){
                for(int j=0; j<c; ++j){
                    res[j][i] = matrix[i][j];
                }
            }
            return res;
        }
}
