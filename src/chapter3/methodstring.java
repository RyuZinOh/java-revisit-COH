package chapter3;

public class methodstring {
    public static void main(String[] args) {
        String a = new String("safal1");
        String s2 = new String(a.toUpperCase());
        String a2 = "Tomome";
        String nonT = new String(" i love momo chan ");
        System.out.println(a.length());
        System.out.println(a2.toLowerCase());
        System.out.println(a.toUpperCase());
        System.out.println(nonT.trim()); //removes age and phie ki spaces
        System.out.println(a.substring(2));
        System.out.println(a2.substring(2,4));
        System.out.println(a2.replace('m', 'k'));
        System.out.println(a.replace("1", "+samsung"));
        System.out.println(a.startsWith("s"));
        System.out.println(a.endsWith("x"));
        System.out.println(a.charAt(2));
        System.out.println(a.indexOf("a")); //returns firt smatch
        System.out.println(a.indexOf("a", 2));
        System.out.println(a.lastIndexOf("a"));
        System.out.println(a.lastIndexOf("a", 2));
        System.out.println(a.equals(s2));
        System.out.println(a.equalsIgnoreCase(s2));
        System.out.println("i am bery good \\"+"hi");


    }
}
