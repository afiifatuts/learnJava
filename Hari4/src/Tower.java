public class Tower {
    private int hp;

    public Tower(int hp) {
        this.hp = hp;
    }

    public  void getHit(Hero hero)
    {
        this.hp -= hero.getDemage();
    }

    @Override
    public String toString() {
        return "Tower{" +
                "hp=" + hp +
                '}';
    }
}
