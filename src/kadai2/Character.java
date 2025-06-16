package kadai2;

import kadai2.Matango;

public abstract class Character {

    public String name;

    public void name(){

    }
    public void run(){
        System.out.println(name+"は逃げ出した！");
    }

    public abstract void attack(Matango m2);
}