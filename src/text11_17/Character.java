package text11_17;

public abstract class Character {
    String name;
    int hp;
    public void run(){
        System.out.println(name+"は逃げ出した！");
    }
    public abstract void attack(Matango m);
}
