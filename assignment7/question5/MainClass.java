package assignment.assignment7.question5;

class FirstOut{
    FirstOut(){
        System.out.println("FirstOut class constructor running");
    }

    class FirstIn{
        FirstIn(int a, int b){
            System.out.println("a = "+a+"  ,b = "+b);
            System.out.println("FirstIn class constructor running");
        }
    }
}

class SecondOut extends FirstOut{
    SecondOut(){
        System.out.println("SecondOut class constructor running");
    }

    class SecondIn{
        SecondIn(int a){
            System.out.println("a = "+a);
            System.out.println("SecondIn class constructor running");
        }

    }
}

public class MainClass {
    public static void main(String[] args) {
        SecondOut.SecondIn secondIn = new SecondOut().new SecondIn(10);
    }

}

/* Output
FirstOut class constructor running
SecondOut class constructor running
a = 10
SecondIn class constructor running
 */