package DSA_java;

public class Ll {
    Node head;
    private  int size;
    Ll(){
    this.size =0 ;
    }
    //node class
    class Node{
        String data;
        Node next;
        Node(String d){
            this.data = d;
            this.next = null;
            size++;
        }
    }



    //adding first
    public void addFirst(String data){
        Node newNode =  new Node(data);
        if(head == null){
            head = newNode;
        }else {
            newNode.next = head;
            head = newNode;
        }
    }

    //adding last
    public void addLAst(String data){
        Node newNode =  new Node(data);
        if(head == null){
            head = newNode;
        }
        Node currentNode = head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    //printing
    public  void printList(){
        if(head == null){
            System.out.println("empty list");
        }
        Node currentNode = head;
        while(currentNode!=null){
            System.out.print(currentNode.data+ " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("NULL");
    }


    //deleting first
    public void deleteFirst(){
        if(head == null){
            System.out.println("empty list");
            return;
        }
        size--;
      head = head.next;
    }

    //deelting last
    public void deleteLast(){
        if(head == null){
            System.out.println("empty list");
            return;
        }
        size--;
        if(head.next == null){
            head =null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;

        while(lastNode.next!=null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;

    }

    public int getSize() {
        return size;
    }
}
