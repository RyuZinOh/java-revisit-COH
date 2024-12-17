package chapter7.project;

import java.util.Scanner;
import java.util.function.IntToDoubleFunction;

public class printingpatterns {

    static void pattens(int row){
        for(int i=0 ;i<row;i++){
            for (int j = 0;j<i+1;j++){
                System.out.print("0 ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        Scanner mag = new Scanner(System.in);
        System.out.println("how may rows u wanna print for that patttern");
        int magyo = mag.nextInt();
        pattens(magyo);

    }
}
