import java.util.Random;
import java.util.Scanner;

public class Grappler extends Hero {

    Grappler(String name, int level, int exp, int levelUpExp, int hp, int maxHp, int power, int money) {
        this.setName(name);
        this.setLevel(level);
        this.setExp(exp);
        this.setLevelUpExp(levelUpExp);
        this.setHp(hp);
        this.setMaxHp(maxHp);
        this.setPower(power);
        this.setMoney(money);
    }

    public int 태클() {
        int attack = this.getPower();
        return attack;
    }

    public int 조르기() {
        Random rd = new Random();
        int rand = rd.nextInt(4) + 1;
        int attack = 0;
        if (rand == 1) {
            System.out.println("초크 성공");
            attack = this.getPower() * 5;
        } else {
            System.out.println("빗나갔습니다.");
        }
        return attack;
    }

    public void 공격하기(Enemy enemy) {
        System.out.println(this.getName() + "의 공격!");
        System.out.println("1.태클 2.조르기");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num == 1) {
            System.out.println("쿵!!");
            enemy.setHp(enemy.getHp() - this.태클());
        } else if (num == 2) {
            System.out.println("!!");
            enemy.setHp(enemy.getHp() - this.조르기());
        }

    }

    /*public void vsHp() {
        if (this.getHp() > 0) {
            System.out.println(this.getName() + "의 체력 : " + this.getHp());

        }
    }*/
}














//    @Override
//    public int attack() {
//        int attack = 0;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("어느 기술을 사용하시겠습니까?");
//        System.out.println("1.태클 2.길로틴 초크 3.침뱉기");
//        int num = sc.nextInt();
//        if (num == 1) {
//            attack = ( this.getPower() * 2 ) + this.getLevel() * 2;
//            System.out.println("슉!");
//            System.out.println(this.getName()+"이(가) "+attack+"의 피해를 입혔습니다.");
//
//        } else if (num == 2) {
//            Random rand = new Random();
//            int choke = rand.nextInt(this.getLevel())+1;
//            attack = (this.getPower() * choke);
//            System.out.println("!!");
//            System.out.println(this.getName()+"이(가) "+attack+"의 피해를 입혔습니다.");
//        }
//        else if(num==3){
//            attack = super.attack();
//        }
//        return attack;
//    }


