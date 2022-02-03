package assignment.assignment7.question2;

class Cycle{
    public void balance(){
        System.out.println("balance method of Cycle");
    }
}

class Unicycle extends Cycle{

    @Override
    public void balance() {
        System.out.println("balance method of Unicycle");
    }
}

class Bicycle extends Cycle{
    @Override
    public void balance() {
        System.out.println("balance method of Bicycle");
    }
}

class Tricycle extends Cycle{

}


public class MainClass {
    public static void main(String[] args) {
        Cycle[] cycles = new Cycle[3];
        cycles[0] = new Unicycle();
        cycles[0].balance();
        cycles[1] = new Bicycle();
        cycles[1].balance();
        cycles[2] = new Tricycle();
        cycles[2].balance();
    }
}


/* Output
    balance method of Unicycle
    balance method of Bicycle
    balance method of Cycle
 */

//The Tricycle class does not override the balance method from its superclass hence the same method is called