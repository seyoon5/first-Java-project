public class ReaperThread extends Thread {
    private Reaper reaper;
    private  Hero hero;
    public ReaperThread(Reaper reaper, Hero hero){
        this.reaper = reaper;
        this. hero = hero;
    }
    @Override
    public void run() {
        while (reaper.getHp()>0) {
            System.out.println("\n" + reaper.getName() + "의 공격");
            reaper.공격하기(hero);
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
