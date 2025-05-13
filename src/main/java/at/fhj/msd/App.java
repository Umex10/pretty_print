package at.fhj.msd;

/**
 * @author Umejr Dzinovic
 */
public class App {
    public static void main(String[] args) {
        
        StringBox s = new StringBox("MSD");
        s.print();

        IntegerBox number = new IntegerBox(42);
        number.print();

        Box<String> box = new Box<String>("MSD");
        Box<Integer> box2 = new Box<Integer>(42);

        box.print();
        box2.print();

    }
}
