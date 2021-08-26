import java.util.Random;

public class Yasuo extends Enemy {

    Yasuo(String name, int hp, int power, int lv, int exp, int money, int maxHp) {
        this.setName(name);
        this.setHp(hp);
        this.setPower(power);
        this.setLevel(lv);
        this.setExp(exp);
        this.setMoney(money);
        this.setMaxHp(maxHp);
    }


    public int 질풍검() {
        int attack = this.getPower() * this.getLevel();
        System.out.println("질풍검!");
        return attack;
    }

    public int 강철폭풍() {
        System.out.println("강철폭풍!");
        int attack = 0;
        Random rd = new Random();
        int rand = rd.nextInt(10) + 1;
        if (rand < 3) {
            attack = this.getPower() * 2;
        } else {
            attack = this.getPower();
        }
        return attack;
    }

    public void 공격하기(Hero hero) {
        Random rd = new Random();
        int num = rd.nextInt(2) + 1;
        if (num == 1) {
            hero.setHp(hero.getHp() - this.질풍검());
        } else if (num == 2) {
            hero.setHp(hero.getHp() - this.강철폭풍());
        }
    }


}

