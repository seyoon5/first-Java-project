import java.util.Random;

public class Reaper extends Enemy {

    Reaper(String name, int hp, int power, int lv, int exp, int money, int maxHp) {
        this.setName(name);
        this.setHp(hp);
        this.setPower(power);
        this.setLevel(lv);
        this.setExp(exp);
        this.setMoney(money);
        this.setMaxHp(maxHp);
    }


    //공격하기 메소드
    public int 저격() {
        int attack = this.getPower() * 2;
        System.out.println("죽어라! 죽어라!");
        return attack;
    }

    public int 난사() {
        int attack = 0;
        Random rd = new Random();
        int rand = rd.nextInt(5);
        if (rand == 5) {
            attack = (int) ((this.getPower() + this.getLevel()) * 2.5);
            System.out.println("펑 ㅍ퍼엉펑");
        }
        else{
            System.out.println(this.getName()+"의 공격이 빗나갔습니다.");
        }
        return attack;
    }

    public void 공격하기(Hero hero) {
        Random rd = new Random();
        int num = rd.nextInt(2) + 1;
        if (num == 1) {
            hero.setHp(hero.getHp() - this.난사());
        } else if (num == 2) {
            hero.setHp(hero.getHp() - this.저격());
        }

    }
}
