public class InnerClass {
    public static void main(String[] args) {
        Ext ext = new Ext();
        Ext.Inner inner = ext.new Inner();
    }
}

class Ext {
    private int num = 100;
    class Inner {
        int num = 50;
        Inner() {
            System.out.println(this.num);
            System.out.println("inner class");
            System.out.println(Ext.this.num);
        }
    }
}