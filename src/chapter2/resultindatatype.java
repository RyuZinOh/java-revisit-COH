package chapter2;

import java.io.FileOutputStream;

public class resultindatatype {
    public static void main(String[] args) {
//        int a  = 64+4;
//        float y = 6.4f;
//        byte x = 4;
//        long b = 40;
//        short z = 8;
//        float ams = y+x;
//        System.out.println(ams);

//        int  i = 56;
//        System.out.println(++i);



        int a =10 ;
        System.out.println(a++);//10
        System.out.println(++a);//11+1
        System.out.println(a--);//12-1
        System.out.println(--a);//12-1-1

        char x= 'a';
        System.out.println(++x);// b ; a
        System.out.println(x--); // a;a
        System.out.println(x++); //b; a;
        System.out.println(++x); //c


    }
}
