package day11.task2;

public class Warrior extends Hero implements PhysAttack{
    private double physAtt = 30;

    public Warrior() {
        super(0.8, 0);
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.setHitPoints(hero.getHealth() - physAtt * (1 - hero.getPhysDef()));
        System.out.println(hero);
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + getHealth() +
                '}';
    }
}
