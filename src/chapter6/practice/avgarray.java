package chapter6.practice;

public class avgarray {
    public static void main(String[] args) {
     int [] marks = {100,120,110,115,200};
     int sum = 0;
     for (int i=0;i<=marks.length-1 ;i++){
         sum +=marks[i];
     }
        System.out.println(sum/marks.length);
    }
}
