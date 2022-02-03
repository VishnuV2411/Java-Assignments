package assignment.assignment7.question3;

interface One{
    public void getOne();
    public void dispOne();
}

interface Two{
    public void getTwo();
    public void dispTwo();
}

interface Three{
    public void getThree();
    public void dispThree();
}

interface Four extends One,Two,Three{
    public void getFour();
}

class ConcreteClass {
    public  void concreteMethod(){
        System.out.println("Concrete Class Method");
    }
}

public class MainClass extends ConcreteClass implements Four{
    @Override
    public void getOne() {
        System.out.println("Interface 1");
    }

    @Override
    public void dispOne() {
        System.out.println("Disp from Interface 1");
    }

    @Override
    public void getTwo() {
        System.out.println("Interface 2");
    }

    @Override
    public void dispTwo() {
        System.out.println("Disp from Interface 2");
    }

    @Override
    public void getThree() {
        System.out.println("Interface 3");
    }

    @Override
    public void dispThree() {
        System.out.println("Disp from Interface 3");
    }

    @Override
    public void getFour() {
        System.out.println("Interface 4 extending Interfaces 1, 2, and 3");
    }

    public void first(One interfaceOne){
        interfaceOne.getOne();
        interfaceOne.dispOne();
    }

    public void second(Two interfaceTwo){
        interfaceTwo.getTwo();
        interfaceTwo.dispTwo();
    }

    public void third(Three interfaceThree){
        interfaceThree.getThree();
        interfaceThree.dispThree();
    }

    public void fourth(Four interfaceFour){
        interfaceFour.getFour();
    }

    public static void main(String[] args) {
        MainClass mainObj = new MainClass();
        mainObj.first(mainObj);
        mainObj.second(mainObj);
        mainObj.third(mainObj);
        mainObj.fourth(mainObj);
    }
}

/*Output
    Interface 1
    Disp from Interface 1
    Interface 2
    Disp from Interface 2
    Interface 3
    Disp from Interface 3
    Interface 4 extending Interfaces 1, 2, and 3

 */