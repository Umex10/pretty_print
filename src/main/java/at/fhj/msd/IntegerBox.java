package at.fhj.msd;

public class IntegerBox {

    int number;

    public IntegerBox(int number) {
        this.number = number;
    }

    public void print() {
        System.out.println(String.format("+---+\n|%d|\n+---+", this.number));
    }
    
}
