package chapter9.practice;

class cylin{
int h;
int r;

public cylin(){
    h = 10;
    r =12;
}

}
public class usingconstructor {
    public static void main(String[] args) {
        cylin cy = new cylin();
        System.out.println(cy.h);
        System.out.println(cy.r);
    }
}
