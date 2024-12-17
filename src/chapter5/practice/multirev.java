package chapter5.practice;

public class multirev {
    public static void main(String[] args) {
        int n = 5;
        int i = 10;
        do {
            System.out.format("%d * %d = %d \n", n ,i, n*i );
            i--;
        }while (i!=0);
    }
}
