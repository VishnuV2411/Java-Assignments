package assignment.assignment7.question4;

//Main Class

public class MainClass {
    public static void main(String[] args) {
        CycleFactory cycleFactory = new CycleFactory();

        Cycle uniCycle = cycleFactory.getCycle("UniCycle");
        uniCycle.show();

        Cycle biCycle = cycleFactory.getCycle("BiCycle");
        biCycle.show();

        Cycle triCycle = cycleFactory.getCycle("TriCycle");
        triCycle.show();
    }
}

/*Output
    This is UniCycle
    This is a BiCycle
    This is Tricycle

 */