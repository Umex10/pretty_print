package at.fhj.msd;

public class StringBox {

    String s;

    public StringBox(String s) {
        this.s = s;
    }

    public void print() {
        System.out.println(String.format("+---+\n|%s|\n+---+", this.s));
    }
    
}
