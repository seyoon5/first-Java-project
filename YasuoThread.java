public class YasuoThread extends Thread {
    private Yasuo yasuo;
    private Hero hero;
    public YasuoThread(Yasuo yasuo, Hero hero){
        this.yasuo = yasuo;
        this.hero = hero;
    }


    @Override
    public void run() {
        while (yasuo.getHp() > 0) {
            System.out.println("\n" + yasuo.getName() + "의 공격");
            yasuo.공격하기(hero);
            if (hero.getHp() > 0) {
                System.out.println(hero.getName() + "의 남은 체력 : " + hero.getHp() + "\n");
            } else {
                System.out.println(hero.getName() + "이(가) 쓰러졌습니다.\n");
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
