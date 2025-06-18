package text11_17;

import java.io.Serializable;

public class Fool extends Character implements Human {
    String name;
    int hp;
    public Fool(String name,int hp){
        this.name = name;
    }
    public void attack(Matango m){
        System.out.println(this.name+"は戦わず遊んでいる");
    }

    public void talk(){
        System.out.println(this.name+"は意味のないことを話した");
    }
    @Override
    public void watch() {
        System.out.println(this.name+"は虚空を見つめている");
    }
    public void hear(){
        System.out.println(this.name+"は誰かの声を聞いた気がした");
    }
    public void run(){
        System.out.println(this.name+"大笑いしながら逃げ出した");
    }
}
