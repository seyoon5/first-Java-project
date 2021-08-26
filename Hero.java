public class Hero extends Character{
    private int levelUpExp;


    int[] belt = new int[3];


    //최대체력



    public void setLevelUpExp(int levelUpExp) {
        this.levelUpExp = levelUpExp;
    }

    public int getLevelUpExp() {
        return levelUpExp;
    }


    public Hero(){
    }

    public int 어퍼컷(){
        return 0;
    }
    public int 로우킥(){
        return 0;
    }
    public int 태클(){
        return 0;
    }public int 조르기(){
        return 0;
    }
    public void 공격하기(Enemy enemy){

    }




    //피해메소드 코드
//     System.out.println(this.getName() + "이 " + attack + "의 피해를 입었습니다.");
//        if (this.getHp() > 0) {
//        System.out.println(this.getName() + "의 체력이 " + hp + "남았습니다.");
//    } else if (this.getHp() <= 0) {
//        System.out.println(this.getName() + "이(가) 쓰러졌습니다\n게임을 종료합니다.");
//        System.exit(0);



//    //기본공격 메소드
//    public int 휘두르기() {
//        int damage = this.getPower();
//        return damage;
//    }

    //레벨 업 메소드
    public void levelUp() {
        if (getExp() >= getLevelUpExp()) {
            int level;
            level = getLevel();
            level++;
            setLevel(level);
            System.out.println("\n레벨 업!\n" + getName() + "의 레벨이 " + level + "입니다.");
            setExp(0);
            setLevelUpExp(getLevelUpExp() * getLevel());

        }
    }

//    public void gamble() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("1.홀짝(x2) 2.뽑기(x8) ");
//        int num = sc.nextInt();
//        if (num == 1) {
//            System.out.println("금액을 입력하세요"); //소지금을 입력
//            int inPut = sc.nextInt();
//            if (inPut <= getMoney()) {  //투입금액이 소지금액을 넘지 않으면 도박을 시작.
//                Random rdNum = new Random();//랜덤으로 하나를 뽑아야함.
//                int luckyNum = rdNum.nextInt(10) + 1;
//                System.out.println("홀! 짝!");
//                System.out.println("숫자선택!\n1.홀수 2.짝수");
//                int select = sc.nextInt();
//                if (select == 1) {
//                    if (luckyNum % 2 != 0) {
//                        System.out.println("홀수입니다.");
//                        System.out.println("\n축하드립니다!\n" + inPut * 2 + "획득!");
//                        setMoney((inPut * 2) + getMoney());
//                    } else {
//                        System.out.println("짝수입니다.");
//                        System.out.println("다음 기회에..");
//                        setMoney(getMoney() - inPut);
//                    }
//
//                }
//                if (select == 2) {
//                    if (luckyNum % 2 == 0) {
//                        System.out.println("짝수입니다.");
//                        System.out.println("\n축하드립니다!\n" + inPut * 2 + "획득!");
//                        setMoney((inPut * 2) + getMoney());
//                    } else {
//                        System.out.println("홀수입니다.");
//                        System.out.println("다음 기회에..");
//                        setMoney(getMoney() - inPut);
//                    }
//                }
//            } else {
//                System.out.println("소지금이 부족합니다.");
//            }
//        } else if (num == 2) { //뽑기
//            System.out.println("금액을 입력하세요"); //소지금을 입력
//            int inPut = sc.nextInt();
//            if (inPut <= getMoney()) {  //투입금액이 소지금액을 넘지 않으면 도박을 시작.
//                System.out.println("숫자선택!\n(1 ~ 10 중 하나 입력)");
//                int select = sc.nextInt();
//                Random rdNum = new Random();
//                int luckyNum = rdNum.nextInt(10) + 1;
//                System.out.println("행운의 숫자는 : " + luckyNum);
//                if (select == luckyNum) {
//                    System.out.println("\n축하드립니다!\n" + inPut * 8 + "획득!");
//                    setMoney((inPut * 8) + getMoney());
//                } else if (select != luckyNum) {
//                    System.out.println("다음기회에");
//                    setMoney(getMoney() - inPut);
//                }
//
//            } else {
//                System.out.println("소지금이 부족합니다.");
//            }
//        }
//    }
//
//    public void training() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("\n체육관 이용료는 1000원 입니다.");
//        System.out.println("1.이용하기 2.나가기");
//        int menuSelect = sc.nextInt();
//        if (menuSelect == 1) {
//            //이용하기 1번
//            if (getMoney() < 1000) {
//                System.out.println("소지금이 부족합니다.");
//            }
//            //if( 현재 소지금이 100원보다 적으면 이용 불가능)
//            else {
//                setMoney(getMoney() - 1000);
//                System.out.println("\n어느 훈련을 하시겠습니까?\n1.유산소 2.근력");
//                int select = sc.nextInt();
//                if (select == 1) {
//                    System.out.println("\n체력이 100 증가합니다");
//                    setMaxHp(getMaxHp() + 100);
//                } else if (select == 2) {
//                    System.out.println("\n힘이 50 증가합니다.");
//                    setPower(getPower() + 50);
//                }
//            }
//        } else if (menuSelect == 2) {
//            System.out.println("\n(끼익..철컥)");
//        }
//    }
//
//    public void rest() {
//        System.out.println("\n1.찜질방(모든 체력이 회복됩니다.) \n2.국밥(체력이 100만큼 회복됩니다.)");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        if (num == 1) {
//            System.out.println("이용료는 10,000원 입니다.");
//            System.out.println("1.이용하기 2.나가기");
//            int select = sc.nextInt();
//            if (select == 1) {
//                if (getMoney() < 10000) {
//                    System.out.println("소지금이 부족합니다.");
//                } else if (getHp() == getMaxHp()) {
//                    System.out.println("회복할 체력이 없습니다. 그래도 이용하시겠습니까?\n1.이용하기 2.나가기");
//
//                    int select2 = sc.nextInt();
//                    if (select2 == 1) {
//                        System.out.println("\n찜질을 통해 온몸의 피로가 풀립니다");
//                        setMoney(getMoney() - 10000);
//                    } else if (select2 == 2) {
//                        System.out.println("\n(수고하세요..)");
//                    }
//                } else {
//                    System.out.println("\n찜질을 통해 온몸의 피로가 풀립니다\n체력이 모두 회복됩니다.");
//                    setHp(getMaxHp());
//                    setMoney(getMoney() - 10000);
//                }
//            } else if (select == 2) {
//                System.out.println("\n(수고하세요..)");
//            }
//
//        } else if (num == 2) {
//            System.out.println("가격은 500원 입니다.");
//            System.out.println("1.주문하기 2.나가기");
//            int select = sc.nextInt();
//            if (select == 1) {
//                if (getMoney() < 500) {
//                    System.out.println("소지금이 부족합니다.");
//                } else if (getHp() == getMaxHp()) {
//                    System.out.println("회복할 체력이 없습니다. 그래도 이용하시겠습니까?\n1.이용하기 2.나가기");
//                    int select2 = sc.nextInt();
//                    if (select2 == 1) {
//                        System.out.println("\n(후루룩..)");
//                        setMoney(getMoney() - 500);
//                    } else if (select2 == 2) {
//                        System.out.println("\n(수고하세요..)");
//                    }
//                } else {
//                    System.out.println("\n(후루룩..)\n체력 100이 회복되었습니다..");
//                    setHp(getHp() + 100);
//                    setMoney(getMoney() - 500);
//                    if (getHp() > getMaxHp()) {
//                        setHp(getMaxHp());
//                    }
//                }
//
//            } else if (select == 2) {
//                System.out.println("수고하세요..");
//            }
//        }
//    }
//
//
//    public void labor() {
//        System.out.println("1.물류센터(체력을 소모하며 10,000원 획득!)\n2.전단지(체력소모 없이 5원씩 획득!)");
//        Scanner sc = new Scanner(System.in);
//        int select = sc.nextInt();
//        if (select == 1) {
//            if (getHp() < 100) {
//                System.out.println("체력이 부족해서 물류센터 일을 할 수 없습니다.");
//                return;
//            }
//            System.out.println("\n(끙..)\n10,000을 벌었습니다.");
//            setMoney(getMoney() + 10000);
//            Random rd = new Random();
//            int injury = rd.nextInt(100) + 1;
//            if (injury <= 30) {
//                System.out.println("고된 노동에 체력의 한계를 느낍니다. 체력을 500 소모합니다.");
//                setHp(getHp() - 500);
//                if (getHp() < 1) {
//                    setHp(1);
//                }
//
//            } else {
//                System.out.println("체력을 100 소모합니다");
//                setHp(getHp() - 100);
//                if (getHp() < 1) {
//                    setHp(1);
//                }
//            }
//        } else if (select == 2) {
//            System.out.println("장당 5원의 돈이 책정되었습니다.");
//            while (true) {
//                System.out.println("1.시작하기 2.그만하기");
//                int start = sc.nextInt();
//                if (start == 1) {
//                    System.out.println("+5원을 정산합니다.");
//                    setMoney(getMoney() + 5);
//                } else if (start == 2) {
//                    System.out.println();
//                    break;
//                }
//            }
//
//        }

}


