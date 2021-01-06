package day11.task2;

public class Paladin extends Hero implements PhysAttack, Healer{
    private double physAtt = 15;
    private double healHimself = 25;
    private double healTeammate = 10;

    public Paladin() {
        super(0.5, 0.2);
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
    public void physicalAttack(Hero hero) {
        hero.setHitPoints(hero.getHealth() - physAtt * (1 - hero.getPhysDef()));
        System.out.println(hero);
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + getHealth() +
                '}';
    }
}
