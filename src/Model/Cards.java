package Model;

public abstract class Cards {
    private int health;
    private int magicShield;
    private int attack;
    private int magicDamage;

    public Cards(){}

    public int getHealth(){
        return health;
    }

    public int getAttack() {
        return attack;
    }

    public int getMagicDamage() {
        return magicDamage;
    }

    public int getMagicShield() {
        return magicShield;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setMagicDamage(int magicDamage) {
        this.magicDamage = magicDamage;
    }

    public void setMagicShield(int magicShield) {
        this.magicShield = magicShield;
    }

    public abstract void Attack();

    public abstract void Attacked();
}
