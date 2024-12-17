package chapter6.practice;

public class reversearray {
    public static void main(String[] args) {
        int [] arrax = {0,1,3,2,4,5,6};
        int l = arrax.length;
        int temp;
        int n = Math.floorDiv(arrax.length,2);
        for(int i=0;i<n;i++){
            //swapping
            temp = arrax[i];
            arrax[i] = arrax[l-i-1];
            arrax[l-i-1] = temp;
        }
        for (int i=0;i<arrax.length-1;i++) {
            System.out.println(arrax[i]);
        }
    }
}
