package chapter3.practice;

public class detect {
    public static void main(String[] args) {
        String probs = "this is contains double and triple spaces";
        System.out.println(probs.indexOf("  "));
        System.out.println(probs.indexOf("   "));
//-1 to know ths hasnt any thing entioned
    }
}
