package chapter3.practice;

import javax.lang.model.element.Name;

public class fillin {
    public static void main(String[] args) {
        String letter = "Dear name, thanks a lot!";
        letter = letter.replace("name", "safal");
        System.out.println(letter);
    }
}
