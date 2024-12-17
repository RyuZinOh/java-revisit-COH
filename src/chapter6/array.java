package chapter6;


public class array {
    public static void main(String[] args) {
        int[] marks = {210, 250, 111, 140, 240};
        int[] results = {0, 1, 2, 4, 6};
        float[] heros = {0.1f, 0.2f, 0.3f, 0.4f};
        String[] students = {"safal", "hunter", "manmade", "power"};

        System.out.println(marks[4]);
        System.out.println(results[3]);
        System.out.println(marks.length - 1);
        System.out.println(students[3].toUpperCase());

//        for (int i = marks.length - 1; i >= 0; i--) {
//            System.out.println(marks[i]);
//        }

        //new version
        for(float element: heros){
            System.out.println(element);
        }
    }
}
