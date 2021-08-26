import java.util.Scanner;

public class Striker extends Hero {

    Striker(String name, int level, int exp, int levelUpExp, int hp, int maxHp, int power, int money) {
        this.setName(name);
        this.setLevel(level);
        this.setExp(exp);
        this.setLevelUpExp(levelUpExp);
        this.setHp(hp);
        this.setMaxHp(maxHp);
        this.setPower(power);
        this.setMoney(money);
    }

    public int 어퍼컷() {
        int attack = this.getPower() * this.getLevel();
        return attack;
    }

    public int 로우킥() {
        int attack = this.getPower() * 2;
        return attack;
    }

    public void 공격하기(Enemy enemy){
        System.out.println(this.getName()+"의 공격!");
        System.out.println("1.어퍼컷 2.로우킥");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num==1){
            System.out.println("슈슉!");
            enemy.setHp(enemy.getHp()-this.어퍼컷());
        }
        else if(num==2){
            System.out.println("휘익!");
            enemy.setHp(enemy.getHp()-this.로우킥());
        }

    }
}



















//
//    //공격하는 메소드 ㅡ> 1,2 선택에 따른 damage 값을 리턴해줌
//     @Override
//     public int attack() {
//        int attack = 0;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("어느 기술을 사용하시겠습니까?");
//        System.out.println("1.어퍼컷 2.내려찍기 3.침뱉기");
//        int num = sc.nextInt();
//        if (num == 1) {
//            attack = (this.getPower()*2) + (this.getLevel()*2);
//            System.out.println("퍽!");
//            System.out.println(this.getName()+"이(가) "+attack+"의 피해를 입혔습니다.");
//        } else if (num == 2) {
//            attack = (this.getPower()*2) + (this.getLevel()*2);
//            System.out.println("쾅!");
//            System.out.println(this.getName()+"이(가) "+attack+"의 피해를 입혔습니다.");
//        }
//        else if (num==3){
//            attack = super.attack();
//        }
//        return attack;
//    }
//
//    }
