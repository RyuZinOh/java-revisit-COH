package chapter2.practice;

import java.awt.*;

public class encryptderypt {
    public static void main(String[] args) {
     char grade = 'B';

     //encrypt
     grade =(char)(grade +8);
        System.out.println(grade);

        //decrypt
        grade = (char) (grade-8);
        System.out.println(grade);
    }
}
