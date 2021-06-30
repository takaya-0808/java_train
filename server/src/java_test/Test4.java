
public class Test4 {
    public static void main(String[] args) {
        Latifa latifa = new Latifa("midori");
        latifa.print();
    }
}

class Latifa {
    String color;
    String name = "ニャア子";

    Latifa(String clr) {
        color = clr;
    }

    void print() {
        System.out.println("私は"+ color + "の羅ティファ");
        System.out.println("私は"+ this.name + "の羅ティファ");
    }
}
