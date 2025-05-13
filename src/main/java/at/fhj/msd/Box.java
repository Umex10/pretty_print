package at.fhj.msd;

public class Box <T> {

    T thing;

    public Box(T thing) {
        this.thing = thing;
    }

    public void print() {
        System.out.println(String.format("+---+\n|%s|\n+---+", this.thing));
    }
    
}
