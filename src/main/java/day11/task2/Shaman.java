package day11.task2;

public class Shaman extends Hero implements PhysAttack, MagicAttack, Healer{
    private double physAtt = 10;
    private double magicAtt = 15;
    private double healHimself = 50;
    private double healTeammate = 30;

    public Shaman() {
        super(0.2, 0.2);
    }

    @Override
    public void healHimself() {
        this.setHitPoints(this.getHealth() + healHimself);
        System.out.println(this);
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHitPoints(hero.getHealth() + healTeammate);
        System.out.println(hero);
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
        return "Shaman{" +
                "health=" + getHealth() +
                '}';
    }
}
