package chapter4.practice;
import java.util.Scanner;

public class typefind {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        String domain;
        System.out.println("enter the website");
        domain = get.nextLine();
        if(domain.endsWith(".org")){
            System.out.println("organizational web");
        } else if (domain.endsWith(".com")) {
            System.out.println("commercial web");
        } else if (domain.endsWith(".np")) {
            System.out.println("this is from nepal web");

        }else {
            System.out.println("nay website");
        }
    }
}
