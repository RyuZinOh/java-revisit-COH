package chapter8.practice;

class employee{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setname(String n){
        name  = n;
    }
}
public class getset {
    public static void main(String[] args) {
        employee rax  = new employee();
        rax.name  = "rizzmaxer";
        System.out.println(rax.getName());
        rax.salary = 10000;
        System.out.println(rax.getSalary());
        rax.setname("safallama");
        System.out.println(rax.getName());

    }
}
