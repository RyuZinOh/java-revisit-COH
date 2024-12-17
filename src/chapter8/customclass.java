package chapter8;
class  employee{
    int id;
    String name;
    public void pd(){
        System.out.println(id);
        System.out.println(name);
    }

}
public class customclass {

    public static void main(String[] args) {
        employee safal = new employee();
        safal.id = 2;
        safal.name = "anisa";
        safal.pd();
    }
}
