package kadai2;

import kadai1.Matango;

public abstract class Character {

    public String name;

    public void name(){

    }
    public void run(){
        System.out.println(name+"は逃げ出した！");
    }

    public void attack(Matango m2) {
        System.out.println(name+"の攻撃！");
        System.out.println("敵に"+m2+"のダメージを与えた");
    }
}