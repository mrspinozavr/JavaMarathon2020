package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack{
    private double physAtt = 5;
    private double magicAtt = 20;

    public Magician() {
        super(0, 0.8);
    }

    @Override
    public void magicalAttack(Hero hero) {
        hero.setHitPoints(hero.getHealth() - magicAtt * (1 - hero.getMagicDef()));
        System.out.println(hero);
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.setHitPoints(hero.getHealth() - physAtt * (1 - hero.getPhysDef()));
        System.out.println(hero);
    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + getHealth() +
                '}';
    }
}
