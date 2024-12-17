package chapter9;

class MyMainEmployee{
    private int id;
    private  String name;

    public String getName(){
        return name;
    }
    public void setName(String x){
        name = x;
    }
    public int getId() {
        return id;
    }
    public  void setId(int g){
        id = g;
    }
    public MyMainEmployee(){
        id = 45;
        name = "chihiro";
    }


public MyMainEmployee(String myname){
        name = myname;
    }
}
class salary{
    int salar;
    public salary(){
         salar = 6900;
    }
    public salary(int x){
        salar  = x;
    }
}

public class constoctrs {
    public static void main(String[] args) {
        MyMainEmployee xd = new MyMainEmployee("safal");
        MyMainEmployee mock = new MyMainEmployee();
        salary mocked = new salary();
        salary mockede = new salary(10000);
//        xd.setName("safal");
//        System.out.println(xd.getName());
//        System.out.println(xd.getId());
        System.out.println(xd.getName());
        System.out.println(mock.getName());
        System.out.println(mocked.salar);
        System.out.println(mockede.salar);
    }
}
