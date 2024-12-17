package chapter7;

public class methodarrays {
    static  void change(int a){
        a= 98;
    }
    static  void c2(int []arr){
        arr[0]= 98;
    }


    public static void main(String[] args) {
    int [] marks = {1,2,3,4,5,4,5,4,7,5,4};
    c2(marks);
        System.out.println(marks[0]);
    //int x = 45;
//    change(x);
//     System.out.println(x);




    }
}
