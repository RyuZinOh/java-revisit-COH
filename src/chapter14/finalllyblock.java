package chapter14;

class sigmamale extends  Exception{
    @Override
    public String toString() {
        return "its some error";
    }
}
public class finalllyblock{

    public static void main(String[] args) throws  sigmamale{
        try {
            System.out.println("hello i am running");
            throw new sigmamale();
        } catch (RuntimeException e) {
            System.out.println(e);
            System.out.println(e.toString());
        }finally {
            System.out.println("i am running anyways");
        }
    }
}
