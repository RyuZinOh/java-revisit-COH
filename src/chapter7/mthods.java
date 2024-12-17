package chapter7;

import javax.security.auth.login.LoginContext;

public class mthods {
    int logic (int x, int y){
        int z;
        if(x>y){
            z= x+y;
        }else{
            z=(x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) {
        mthods  mocks = new mthods();

        int a= 5;
        int b= 7;
        int c;
        c = mocks.logic(a,b);
        System.out.println(c);



    }

}
