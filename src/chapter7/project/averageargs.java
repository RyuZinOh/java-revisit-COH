package chapter7.project;

public class averageargs {
    static int sumavg(int... args) {
        int sum = 0;
        for (int i = 0; i <= args.length - 1; i++){
            sum += args[i];
        }
        return  sum/args.length;
    }
    public static void main(String[] args) {
        int summer = sumavg(2,2,2,2,3,1);
        System.out.println(summer);
    }
}
