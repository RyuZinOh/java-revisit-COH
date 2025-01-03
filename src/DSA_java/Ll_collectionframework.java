package DSA_java;
import  java.util.*;
public class Ll_collectionframework {
    public static void main(String[] args) {
        LinkedList<String>  list =  new LinkedList<String>();

        //add =  bydefault its added in last

        list.addFirst("safal");
        list.addFirst("is");
        System.out.println(list);
        list.addLast("good?");
        System.out.println(list);

        //printing
        for(int i = 0; i<list.size();i++){
            System.out.print(list.get(i) + "->");
        }
        System.out.println("nULL");
        for(String element : list){
            System.out.print(element + "->");
        }
        System.out.println("null");



        //deleting is bydefault removing frist
        list.removeLast();
        for(String element : list){
            System.out.print(element + "->");
        }
        System.out.println("null");

        list.remove();
        for(String element : list){
            System.out.print(element + "->");
        }
        System.out.println("null");
        list.remove(0);
        System.out.println(list);
        System.out.println(list.size());


    }
}
