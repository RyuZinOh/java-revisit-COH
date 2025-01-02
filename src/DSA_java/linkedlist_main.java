package DSA_java;

public class linkedlist_main {
    public static void main(String[] args) {
        Ll list  = new Ll();
        list.addFirst("safal");
        list.addFirst("is");
        list.addLAst("good?");
        list.printList();
        System.out.println(list.getSize());
        list.deleteFirst();
        list.printList();
        System.out.println(list.getSize());
        list.deleteLast();
        list.printList();
        System.out.println(list.getSize());
    }
}
