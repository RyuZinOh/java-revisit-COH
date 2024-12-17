package chapter5.practice;

public class tablemulti {
    public static void main(String[] args) {
        int n = 5;
        int i = 1;
        do {
            System.out.format("%d * %d = %d \n", n ,i, n*i );
            i++;
        }while (i<=10);
    }
}
