package chapter5.practice;

public class repeater {
    public static void main(String[] args) {
        int i = 5;
        int fact = 1;
        while (i!=0){
            fact *=i;
            i--;
        }
        System.out.println(fact);
    }
}
