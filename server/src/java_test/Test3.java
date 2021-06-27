
public class Test3 {
    public static void main(String[] args) {
        CharaStatus st1 = new CharaStatus();
        st1.name = "魔女";
        st1.hp = 100;
        st1.mp = 50;

        CharaStatus st2 = new CharaStatus();
        st2.name = "白夜の魔女";
        st2.hp = 200;
        st2.mp = 150;

        System.out.println(st1.name+"はhp="+st1.hp+":mp="+st1.mp+"です。");
        System.out.println(st2.name+"はhp="+st2.hp+":mp="+st2.mp+"です。");
    }
}

class CharaStatus {
    String name;
    int hp;
    int mp;
}