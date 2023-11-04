package org.example;

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList{
    private Node head;
    public LinkedList(){
        head = null;
    }

    public void add(int data){
        Node nodeToBeAdded =  new Node(data);

        if(head == null){
            head=nodeToBeAdded;
        } else {
            Node current = head;
            while(current.next!=null){
                current = current.next;
            }
            current.next = nodeToBeAdded;
        }
    }
    public void delete(int data){
        if (head == null){
            return;
        }

        if (head.data == data){
            head = head.next;
        }

        Node current = head;
        while(current.next !=null){
            if(current.next.data == data){
                current.next = current.next.next;
            }
            current = current.next;
        }
    }

    public void FindMiddle(){
        Node current = head;
        int lenght = 0;
        while(current!=null){
            lenght++;
            current=current.next;
        }
        current=head;
        int middle;
        middle = lenght /2 + 1;
        while(middle!=1){
            current = current.next;
            middle--;
        }

        while(current!=null){
            System.out.print(current.data + " - > ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void display(){
        Node current = head;
        while(current!=null){
            System.out.print(current.data + " - > ");
            current = current.next;
        }
        System.out.println("null");
    }
}
public class W05LinkedList {
    public static void main(String[] args){
        LinkedList numbers = new LinkedList();
        numbers.add(3);
        numbers.add(4);

        numbers.display();
        numbers.add(6);
        numbers.add(8);

        numbers.display();

        //numbers.delete(6);
        //numbers.display();
        numbers.FindMiddle();
    }
}
