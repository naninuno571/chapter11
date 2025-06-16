package kadai2;

public class Hero extends Character {
    int ad= 10;
    public void attack(Matango m){
        System.out.println(name+"の攻撃！");
        System.out.println("敵に"+ad+"のダメージを与えた");
        m.hp-=ad-ad;
    }
}
