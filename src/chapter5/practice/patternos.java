package chapter5.practice;

public class patternos {
    public static void main(String[] args) {
        int row = 4;
        int i = row;

        // Outer loop for rows
        while (i > 0) {
            int col = i;

            // Inner loop for columns
            while (col > 0) {
                System.out.print("*");
                col--;
            }

            // Move to the next line after printing all columns in the current row
            System.out.print("\n");
            i--;
        }
    }
}
