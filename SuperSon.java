import java.util.Random;

public class SuperSon extends Son {
    SuperSon(String name, int hp, int power, int lv, int exp, int money, int maxHp) {
        super();
        this.setName(name);
        this.setHp(hp);
        this.setPower(power);
        this.setLevel(lv);
        this.setMaxHp(maxHp);
    }

    public int 원기옥() {
        int attack = this.getPower() * this.getLevel();
        System.out.println("원기옥!");
        return attack;
    }

    public void 분노() {
        System.out.println("공격력 상승!");
        this.setPower(this.getPower() + 30);
    }

    public void 공격하기(Hero hero) {
        Random rd = new Random();
        int num = rd.nextInt(4) + 1;
        if (num == 1) {
            hero.setHp(hero.getHp() - this.원기옥());
        } else if (num == 2) {
            System.out.println("");
            this.분노();
        }
        else if(num==3){
            hero.setHp(hero.getHp()-this.에너지파());
        }
        else if(num==4){
            this.회복();
        }

    }
}
