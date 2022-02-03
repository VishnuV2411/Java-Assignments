package assignment.assignment10;

public class SList {
    Node head = null;

    public SListIterator iterator(){
        return new SListIterator(this);
    }

    //printing the List

    public String toString(SListIterator sll){
        Node temp = sll.head;
        StringBuilder sb = new StringBuilder();
        while(temp.next != null){
            sb.append(temp.data);
            sb.append("->");
            temp = temp.next;
        }
        sb.append(temp.data);
        return sb.toString();
    }
}
