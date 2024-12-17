package chapter6.practice;

public class matrix {
    public static void main(String[] args) {
        int [][] matrix =
                {{1,1,3}, {4,5,6}};

        int [][]  matrix1 =
                {{4,4,4}, {6,5,4}};
        int[][] result =
                {{0,0,0},{0,0,0}};
        int sum  =0;
        for (int i = 0;i<=matrix.length-1;i++){
            for (int j = 0 ;j<=matrix1[i].length-1 ;j++){
                System.out.format("i =%d and j=%d\n", i,j);
                result[i][j] = matrix[i][j]+ matrix1[i][j];
            }
        }
        for (int i = 0;i<=matrix.length-1;i++){
            for (int j = 0 ;j<=matrix1[i].length-1 ;j++){
                System.out.format(result[i][j] + " ");
                result[i][j] = matrix[i][j]+ matrix1[i][j];
            }
            System.out.print("\n");
        }
    }
}
