package assignment.assignment10;

import  java.util.Scanner;

public class SLLMain {
    public static void main(String[] args) {
        SList sll = new SList();
        SListIterator sListIterator = sll.iterator();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of list");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int data = sc.nextInt();
            sListIterator.insert(data);

        }
        System.out.println("Contents of the list are : ");
        System.out.println(sll.toString(sListIterator));
        System.out.println("Enter a values to be deleted");
        int delValue = sc.nextInt();
        sListIterator.delete(delValue);

        System.out.println("Contents of the list after deleting "+delValue+" are:");
        System.out.println(sll.toString(sListIterator));
    }
}

/*Input and Output
Enter length of list
5
10
20
30
40
50
Contents of the list are :
50->40->30->20->10
Enter a values to be deleted
40
 */