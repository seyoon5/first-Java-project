public abstract class Enemy extends Character {


    //적 피해
    //적피해 코드
//        int hp = this.getHp();
//        hp = this.getHp() - damage;
//        this.setHp(this.getHp()-damage);
//        if (hp > 0) {
//            System.out.println(this.getName()+"의 체력이 "+ hp + "남았습니다.\n");
//        }
//        if (hp <= 0) {
//            System.out.println(this.getName() + "이(가) 쓰러졌습니다.");
//
//        }
    Enemy() {

    }

    public void 공격하기(Hero hero) {

    }

//    public void vsHp() {
//        if (this.getHp() > 0) {
//            System.out.println(this.getName() + "의 체력 : " + this.getHp());
//
//        }

//    public int 밀치기(){
//        int attack = this.getPower();
//        System.out.println("기본공격!");
//        return attack;
//
//    }
}
