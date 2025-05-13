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

    }
}
