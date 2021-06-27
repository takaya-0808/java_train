
public class Test10 {
    public static void main(String[] args) {
        int hp = 100;
        Chara ch = new Chara() {
            int hp;
            int mp;
            
            public void view() {
                System.out.println("hp = " + hp + "mp=" + mp);
            }

            public Chara init(int hp) {
                this.hp = hp;
                System.out.println("匿名クラスメソッドで初期化処理");
                return this;
            }
            {
                System.out.println("インスタンスイニシャライザで初期化処理");
                mp = 200;
            }
        }.init(hp);
        ch.view();
    }
}

abstract class Chara {
    abstract void view();
}
