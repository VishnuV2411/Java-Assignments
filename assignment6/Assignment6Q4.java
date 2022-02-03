package assignment.assignment6;

//Main Class

class ConstructorTest1 {
    ConstructorTest1(String str){
        System.out.println("Starting Constructor");
        System.out.println(str);
    }
}

public class Assignment6Q4 {
    public static void main(String[] args) {
        ConstructorTest1[] ct1 = new ConstructorTest1[2];
        ct1[0] =  new ConstructorTest1("First Message");
        ct1[1] = new ConstructorTest1("Second Message");
    }
}


/* Output
    Starting Constructor
    First Message
    Starting Constructor
    Second Message
 */