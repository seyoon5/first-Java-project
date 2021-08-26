public class SuperSonThread extends Thread {
    private SuperSon superSon;
    private Hero hero;

    public SuperSonThread(SuperSon superSon, Hero hero) {
        this.superSon = superSon;
        this.hero = hero;
    }

    @Override
    public void run() {

        System.out.println("손오공이 주변 공기를 제어하여 지속적인 피해를 줍니다.\n시간의 흐름에 따라 피해량 증가합니다.");
        for (int i = 1; i < hero.getMaxHp() * 2; i++) {
            hero.setHp(hero.getHp() - i);
            if (hero.getHp() <= 0) {
                System.out.println(hero.getName() + "이 죽었습니다.\n게임을 종료합니다.");
                System.exit(0);
            } else if (hero.getHp() > 0) {
                System.out.println(hero.getName() + "의 남은 체력 : " + hero.getHp() + "\n");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }if(superSon.getHp()<0){break;}
        }
    }
}

