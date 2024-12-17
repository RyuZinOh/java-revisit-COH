package chapter9;

class  myemp{
   private  int id;
   private String name;
    public String getname(){
        return name;
    }
   public void setName(String n){
       name = n;
   }
   public int getId(){
        return id;
   }
   public void setId(int ne){
        id = ne;
   }
}

public class modifyers {
    public static void main (String[] args) {
        myemp mas = new myemp();
        mas.setName("safallama");
        System.out.println(mas.getname());
        mas.setId(10);
        System.out.println(mas.getId());

    }
}
