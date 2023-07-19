public class Hero {
    private String name;
    private  int hp;
    private  int demage;

    private  int heal;

    public Hero(String name, int hp, int demage, int heal) {
        this.name = name;
        this.hp = hp;
        this.demage = demage;
        this.heal = heal;
    }



    public  void attack(Hero hero){
        //this disini zilong
        //heronya nana
        //hero.hp = hero.hp-this.demage;
        //hero.hp -= demage
        hero.getHit(this.demage);
    }

    public void attack(Monster monster){
        monster.getHit(this.demage);
    }

    public void attack(Tower tower){
        tower.getHit(this);
    }

    public  void getHit(Integer demage){
        //this disini nana
        this.hp = this.hp - demage;
        //this.hp -= demage;
    }

    public void  getHeal(Hero hero){
        if(this.hp<= 3 * heal){
            System.out.println("darah kurang");
        }
        if(hero.hp==0){
            System.out.println("maaf tidak tertolong");
        }
        else {
            hero.hp += heal;
            this.hp -= heal;
        }
    }

    public int getDemage(){return demage;}
    //public void attack(Hitable hitable){hitable.receivedDemage(this)}
    public void  receivedDemage(Hero hero){this.hp -= hero.hp;}

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", demage=" + demage +
                '}';
    }
}





