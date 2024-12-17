package chapter4.practice;
import jdk.jshell.spi.ExecutionControl;

import java.beans.VetoableChangeListener;
import java.util.Scanner;
public class passorfil {
    public static void main(String[] args) {
        int math, engligh, sciene;
        Scanner getm = new Scanner(System.in);
        System.out.println("enteer marks of math, english and science");
        math = getm.nextInt();
        engligh = getm.nextInt();
        sciene = getm.nextInt();

        int total = (math+engligh+sciene)/300*100;

        if(total >=40 && sciene >33 && engligh >33 && sciene >33){
            System.out.println("pass");
        }else {
            System.out.println("u failed");
        }
    }
}
