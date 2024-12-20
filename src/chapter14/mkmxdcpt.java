package chapter14;

import java.util.Scanner;

public class mkmxdcpt {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks [2]= 6;
        Scanner scanner  = new Scanner(System.in);
        System.out.println("enter some");
        int ind = scanner.nextInt();

        System.out.println("enter the number u wanted todivide with");
        int div = scanner.nextInt();

        try {
            System.out.println("array indexed is "+ marks[ind]);
            System.out.println("the value of arra after division would be "+ marks[ind]/div);
        } catch (ArithmeticException e){
            System.out.println("arthemetic excetption occured");
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("array out of bound occured");
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println("some exception occured");
            System.out.println(e);
        }
    }
}
