package day11.task2;

public class Hero {
    private double health;
    private double physDef;
    private double magicDef;

    public Hero(double physDef, double magicDef) {
        this.physDef = physDef;
        this.magicDef = magicDef;
        this.health = 100;
    }

    public double getHealth() {
        return health;
    }

    public double getPhysDef() {
        return physDef;
    }

    public double getMagicDef() {
        return magicDef;
    }

    public void setHitPoints(double health) {
        if (health > 100) {
            this.health = 100;
        } else if (health < 0) {
            this.health = 0;
        } else {
            this.health = health;
        }
    }

    @Override
    public String toString() {
        return "Hero{" +
                "health=" + health +
                '}';
    }
}
