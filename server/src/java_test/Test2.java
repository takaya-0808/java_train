public class Test2 {
    public static void main(String[] args) {
        // view("hoge", 1);
        // view("fuga", 2);
        // view("monstar", 3);
        process("hoge", "fuga");
        process("hoge", "fuga", "wada");
    }

    static void view(String name, int num) {
        System.out.println("------------------");
        for (int i=0; i<num; i++) {
            System.out.println(name);
        }
        System.out.println("^^^^^^^^^^^^^^^^^^^^^");
    }

    static void process(String... names) {
        for (String n : names) {
            System.out.println(n);
        }
    }
}