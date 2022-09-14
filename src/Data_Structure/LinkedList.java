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
        list.addData(70);
        list.printLinkedList(list);
    }
    }


/*Ability to create Linked
List by adding 30 and 56
to 70
- Node with data 70 is First Created
- Next 30 is added to 70
- Finally 56 is added to 30
- LinkedList Sequence: 56->30->70*/
