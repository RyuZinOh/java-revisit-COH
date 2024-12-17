package chapter7.project;

import java.util.Scanner;

public class recusironpatthern {
    static void pattens(int row){

        if(row >0){
            pattens(row -1);
            for (int i =0 ;i<row;i++){
                System.out.print("X ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner mag = new Scanner(System.in);
        System.out.println("how may rows u wanna print for that patttern");
        int magyo = mag.nextInt();
        pattens(magyo);

    }
}
