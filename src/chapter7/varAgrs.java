package chapter7;

public class varAgrs {
static int sum (int ...arr){
    int result = 0;
    for(int a: arr){

        result+=a;

    }
    return result;
}

    public static void main(String[] args) {

        System.out.println(sum(1, 2));
        System.out.println(sum(1, 2,3,4,5,6));
        System.out.println(sum(1, 2,3));
        System.out.println(sum(1, 2,3,4));


    }
}
