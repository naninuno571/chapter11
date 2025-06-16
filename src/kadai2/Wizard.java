package kadai2;

public class Wizard extends Character{
    int ap=7;
    public void attack(Matango m){
        System.out.println(name+"の攻撃");
        System.out.println("魔法使いは火の玉を放った！");
        System.out.println("敵に"+ap+"のダメージを与えた");
        m.hp-=ap;
    }
}
