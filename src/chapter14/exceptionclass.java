package chapter14;

import java.util.Scanner;

class MeroException extends  Exception{
    @Override
    public String toString() {
        return  "i am safal lama";
    }

    @Override
    public String getMessage() {
        return  "i am ronaldo";
    }
}

public class exceptionclass {
    public static void main(String[] args)  throws MeroException{
        int a = 8;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        if(a<99){
            try {
                throw new MeroException();
            }catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
                System.out.println("completede");
            }
            System.out.println("amazingly completed");
        }

    }
}
