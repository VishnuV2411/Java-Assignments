package assignment.assignment6;

//Main CLass

class ConstructorTest {
    ConstructorTest(String str){
        System.out.println("Starting Constructor");
        System.out.println(str);
    }
}

public class Assignment6Q3{
    public static void main(String[] args) {
        ConstructorTest[] ct = new ConstructorTest[2];
    }
}

//The Constructor Initialization message is not printed