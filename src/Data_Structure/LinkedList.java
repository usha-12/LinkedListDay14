package Data_Structure;

public class LinkedList {
    Node head;
    Node tail;
    static  class Node{
        int data;
        Node nextNode;
        public Node(int data){
            this.data = data;
            nextNode = null;
        }
    }
public void addData(int element){
        Node new_node = new Node(element);
        if (head == null){
            head = new_node;
            tail = new_node;
        }
        else {
            tail.nextNode = new_node;
            tail = new_node;

        }
}
public void search(int searchElement){
        Node thisNode = head;
        while (thisNode != null){
            if (thisNode.data == searchElement){
                System.out.println("found element"+searchElement+"in this element");
            }
            thisNode = thisNode.nextNode;
        }
}
public void insert(int element){
        Node new_node = new Node(element);
        Node thisNode = head;
        while (thisNode.data != 56)
            thisNode = thisNode.nextNode;
        new_node.nextNode = thisNode.nextNode;
        thisNode.nextNode = new_node;
}
public void pop(int dataDelete){
        Node thisNode = head;
        if (dataDelete == head.data){
            thisNode = head.nextNode;
            head = thisNode;
        }
        else {
            Node previous = null;
            while (thisNode.data != dataDelete){
                previous = thisNode;
                thisNode = thisNode.nextNode;
            }
            previous.nextNode = thisNode.nextNode;
        }
}
public void printLinkedList(LinkedList list){
        Node thisNode = head;
        if (thisNode == null)
            System.out.println("the list is empty: ");
        else {
            System.out.println("displaying the Linked List: ");
            while (thisNode != null){
                System.out.println(thisNode.data);
                thisNode = thisNode.nextNode;
            }
        }
}

    public static void main(String[] args) {
        System.out.println("LinkedList:");
        System.out.println("Lets create a simple Linked List of:\n 56, 30, 70");
        LinkedList list = new LinkedList();
        list.addData(56);
        list.addData(30);
        list.insert(70);
        list.printLinkedList(list);
        System.out.println("Searching for element 30 in the Linked List:  ");
        list.search(30);
        list.printLinkedList(list);
    }
    }


/*Ability to search
LinkedList to find Node
with value 30

- Write Junit Test Case as
demonstrated in class
- Loop through LinkedList to
find node with key 30*/