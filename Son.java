import java.util.Random;

public class Son extends Enemy {
    Son(String name, int hp, int power, int lv, int exp, int money, int maxHp) {
        this.setName(name);
        this.setHp(hp);
        this.setPower(power);
        this.setLevel(lv);
        this.setExp(exp);
        this.setMoney(money);
        this.setMaxHp(maxHp);
    }

    public Son() {

    }

    //공격하기 메소드
    public int 에너지파() {
        int attack = this.getPower() * 3;
        System.out.println("에너지 파!");
        return attack;
    }

    public void 회복() {
        this.setHp(this.getHp()+100);
        System.out.println("흐앗!");
        System.out.println(this.getName() + "의 체력이 " +100+ "증가했습니다.");
    }

    public void 공격하기(Hero hero) {
        Random rd = new Random();
        int num = rd.nextInt(2) + 1;
        if (num == 1) {
            hero.setHp(hero.getHp() - this.에너지파());
        } else if (num == 2) {
            this.회복();
        }

    }



}
