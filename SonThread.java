public class SonThread extends Thread {
    private Son son;
    private Hero hero;

    public SonThread(Son son, Hero hero) {
        this.son = son;
        this.hero = hero;
    }

    public void run() {

        while (son.getHp() > 0) {
            System.out.println("\n" + son.getName() + "의 공격");
            son.공격하기(hero);
            if (hero.getHp() > 0) {
                System.out.println(hero.getName() + "의 남은 체력 : " + hero.getHp() + "\n");
            } else {
                System.out.println(hero.getName() + "이(가) 쓰러졌습니다.\n" + son.getHp());
                System.out.println("게임을 종료합니다.");
                System.exit(0);
            }
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
            }
        }


    }
}
