package assignment.assignment7.question1;

//Main Class

abstract class Rodent{
    Rodent(){
        System.out.println("Constructor of Class Rodent");
    }
    public abstract void sound();
    public abstract void disp();
}

class Mouse extends Rodent{
    Mouse(){
        System.out.println("Mouse started running...");
    }

    @Override
    public void sound() {
        System.out.println("Mouse is Squeaking");
    }

    @Override
    public void disp() {
        System.out.println("Disp inside Mouse");
    }
}

class Gerbil extends Rodent{
    Gerbil(){
        System.out.println("Gerbil Started Running...");
    }

    @Override
    public void sound() {
        System.out.println("Gerbil is Squeaking and Thumping");
    }

    @Override
    public void disp() {
        System.out.println("Disp inside Gerbil");
    }

}

class Hamster extends Rodent{
    Hamster(){
        System.out.println("Hamster Started Running...");
    }

    @Override
    public void sound() {
        System.out.println("Hamster is Squeaking");
    }

    @Override
    public void disp() {
        System.out.println("Disp inside Hamster Classs");
    }

}

public class Assignment7 {
    public static void main(String[] args) {
        Rodent[] rodent = new Rodent[3];
        rodent[0] = new Mouse();
        rodent[0].disp();
        rodent[0].sound();
        rodent[1] = new Gerbil();
        rodent[1].disp();
        rodent[1].sound();
        rodent[2] = new Hamster();
        rodent[2].disp();
        rodent[2].sound();
    }
}

/*Output
    Constructor of Class Rodent
    Mouse started running...
    Disp inside Mouse
    Mouse is Squeaking
    Constructor of Class Rodent
    Gerbil Started Running...
    Disp inside Gerbil
    Gerbil is Squeaking and Thumping
    Constructor of Class Rodent
    Hamster Started Running...
    Disp inside Hamster Classs
    Hamster is Squeaking

 */