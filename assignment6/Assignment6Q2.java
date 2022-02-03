package assignment.assignment6;

public class Assignment6Q2 {

    Assignment6Q2() {
        System.out.println("Non parameterized Constructor running...");
    }

    Assignment6Q2(int number){
        this();
        System.out.println(number);
    }

    public static void main(String[] args) {
        Assignment6Q2 obj2 = new Assignment6Q2(5);
    }
}
