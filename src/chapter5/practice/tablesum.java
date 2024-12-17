package chapter5.practice;

public class tablesum {
    public static void main(String[] args) {
        int n = 8;
        int i = 1;
        int sum = 0;
        do {
            System.out.format("%d * %d = %d \n", n ,i, n*i );
            sum+=n*i;
            i++;
        }while (i<=10);
        System.out.println(sum);
    }
}
