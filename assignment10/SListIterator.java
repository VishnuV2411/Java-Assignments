package assignment.assignment10;

public class SListIterator {

    SList sList;
    Node head;
    public SListIterator(SList sList){
        this.sList = sList;
    }

    //inserting into list

    public void insert(int value){
        if(head == null){
            head = new Node(value);
        }
        else{
            Node newNode = new Node(value);
            newNode.next = head;
            head = newNode;
        }
    }

    //deleting from LinkedList

    public void delete(int value){
        Node temp = head;
        Node prev = null;

        if(temp != null && temp.data == value){
            head = temp.next;
            return;
        }
        while(temp != null && temp.data != value){
            prev = temp;
            temp = temp.next;
        }

        if(temp == null){
            return;
        }
        prev.next = temp.next;
    }
}
