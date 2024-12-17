package chapter6;

public class multidmiensional {
    public static void main(String[] args) {
        int [] marks; //1d array
        int [][] flats; //2d array
        flats = new int [2][3];
        flats [0][0] = 110;
        flats [0][1] = 10;
        flats [0][2] = 11;
        flats [1][0] = 12;
        flats [1][1] = 100;
        flats [1][2] = 103;

        for (int i=0; i <flats.length;i++){
            for (int j = 0 ; j<flats[i].length ;j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }

    }
}
