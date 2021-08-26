import bgm.Music;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n" +
                "  /$$$$$$  /$$                                         /$$                    \n" +
                " /$$__  $$| $$                                        |__/                    \n" +
                "| $$  \\__/| $$$$$$$   /$$$$$$  /$$$$$$/$$$$   /$$$$$$  /$$  /$$$$$$  /$$$$$$$ \n" +
                "| $$      | $$__  $$ |____  $$| $$_  $$_  $$ /$$__  $$| $$ /$$__  $$| $$__  $$\n" +
                "| $$      | $$  \\ $$  /$$$$$$$| $$ \\ $$ \\ $$| $$  \\ $$| $$| $$  \\ $$| $$  \\ $$\n" +
                "| $$    $$| $$  | $$ /$$__  $$| $$ | $$ | $$| $$  | $$| $$| $$  | $$| $$  | $$\n" +
                "|  $$$$$$/| $$  | $$|  $$$$$$$| $$ | $$ | $$| $$$$$$$/| $$|  $$$$$$/| $$  | $$\n" +
                " \\______/ |__/  |__/ \\_______/|__/ |__/ |__/| $$____/ |__/ \\______/ |__/  |__/\n" +
                "                                            | $$                              \n" +
                "                                            | $$                              \n" +
                "                                            |__/                              \n");
        //배경음악
        Music music = new Music("/전투bgm.mp3", true);
        music.start();
        Hero hero = new Hero();
        //캐릭터 설정
        Scanner sc = new Scanner(System.in);
        System.out.println("컈릭터의 이름을 설정하세요");
        String name = sc.next();
        hero.setName(name);
        System.out.println("이름 : " + hero.getName() + "\n"
        );
        System.out.println("격투타입을 선택하세요");
        System.out.println("1.스트라이커 2.그래플러");
        int num = sc.nextInt();
        if (num == 1) {
            hero = new Striker(name, 1, 0, 100, 1000, 1000, 100, 1000);
        } else if (num == 2) {
            hero = new Grappler(name, 1, 0, 100, 1300, 1300, 90, 1000);
        }
        System.out.println();
        System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
        System.out.println();
        System.out.println("                   영웅의 상태                                          ");
        System.out.println("     이　름 : " + hero.getName() + "　　　　　　　　　체　력　: " + hero.getHp() + "/" + hero.getMaxHp());
        System.out.println("     레　벨 : " + hero.getLevel() + "　　　　　 　　 　　힘　　: " + hero.getPower());
        System.out.println("     경험치 : " + hero.getExp() + "/" + hero.getLevelUpExp() + "　　　　　   소 지 금　: " + hero.getMoney());
        System.out.println();
        System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★\n");
        System.out.println("캐릭터가 생성되었습니다. 각 도시 체육관 대표들을 이기고 챔피언 타이틀을 획득하세요.\n");
        Yasuo yasuo = new Yasuo("야스오", 500, 50, 1, 10, 100, 500);
        Reaper reaper = new Reaper("리퍼", 800, 70, 2, 20, 500, 800);
        Son son = new Son("손오공", 1000, 120, 3, 30, 1000, 1000);
        SuperSon superSon = new SuperSon("손오공(초사이언 상태)", 1500, 150, 4, 50, 3000, 1500);


        //기능선택
        while (true) {
            System.out.println("---------------화면선택---------------");
            System.out.println("1.상태보기\n2.스파링\n3.도박\n4.훈련\n5.돈 벌기\n6.휴식\n7.종료\n0.테스트");
            System.out.println("-------------------------------------");
            Scanner scan = new Scanner(System.in);
            int nb = scan.nextInt();
            if (nb == 1) {
                hero.setName(name);
                System.out.println();
                System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
                System.out.println();
                System.out.println("                   영웅의 상태                                          ");
                System.out.println("     이　름 : " + hero.getName() + "　　　　　　　　　체　력　: " + hero.getHp() + "/" + hero.getMaxHp());
                System.out.println("     레　벨 : " + hero.getLevel() + "　　　　　 　　 　　힘　　: " + hero.getPower());
                System.out.println("     경험치 : " + hero.getExp() + "/" + hero.getLevelUpExp() + "　　　　　   소 지 금　: " + hero.getMoney());
                System.out.println();
                System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★\n");
                // mainSystem.status();
            } else if (nb == 2) {
                System.out.println("체육관 선택");
                System.out.println("1.남성 2.이수 3.사당");
                Scanner scanner = new Scanner(System.in);
                int number = scanner.nextInt();
                //야스오
                if (number == 1) {
                    System.out.println(yasuo.getName() + " : 죽음은 바람과 같지.. 늘 곁에 있으니...\n");
                    //vs야스오
                    YasuoThread yasuoThread = new YasuoThread(yasuo, hero);
                    yasuoThread.start();


                    while (true) {
                        if (yasuo.getHp() < 0) {
                            Thread.interrupted();
                        }
                        hero.공격하기(yasuo);
                        if (yasuo.getHp() > 0) {
                            System.out.println(yasuo.getName() + "의 남은 체력 : " + yasuo.getHp() + "\n");
                        } else {
                            System.out.println(yasuo.getName() + "이(가) 쓰러졌습니다.\n");
                            System.out.println("경험치 +10");
                            System.out.println("돈 +100");
                            hero.setExp(hero.getExp() + yasuo.getExp());
                            hero.levelUp();
                            hero.setMoney(hero.getMoney() + yasuo.getMoney());
                            hero.belt[0] = 1;
                            try {
                                Thread.sleep(3000);
                            } catch (InterruptedException e) {
                            }
                            yasuo.setHp(yasuo.getMaxHp() * 2);
                            break;
                        }
                    }


                    //리퍼
                } else if ((number == 2)) {
                    if (hero.belt[0] != 1) {
                        System.out.println("남성 체육관 대표를 쓰러뜨려야 입장 가능!");
                        return;
                    }
                    System.out.println(reaper.getName() + " : 죽음을 맞이해라!\n");
                    ReaperThread reaperThread = new ReaperThread(reaper, hero);
                    reaperThread.start();
                    // fight-reaper
                    while (true) {
                        if (reaper.getHp() < 0) {
                            Thread.interrupted();
                        }
                        hero.공격하기(reaper);
                        if (reaper.getHp() > 0) {
                            System.out.println(reaper.getName() + "의 남은 체력 : " + reaper.getHp() + "\n");
                        } else {
                            System.out.println(reaper.getName() + "이(가) 쓰러졌습니다.\n");
                            System.out.println("경험치 +20");
                            System.out.println("돈 +500");
                            hero.setExp(hero.getExp() + reaper.getExp());
                            hero.levelUp();
                            hero.setMoney(hero.getMoney() + reaper.getMoney());
                            hero.belt[1] = 2;
                            try {
                                Thread.sleep(3000);
                            } catch (InterruptedException e) {
                            }
                            reaper.setHp(reaper.getMaxHp() * 2);
                            break;
                        }
                        System.out.println(reaper.getName() + "의 공격");
                        reaper.공격하기(hero);
                        if (hero.getHp() > 0) {
                            System.out.println(hero.getName() + "의 남은 체력 : " + hero.getHp() + "\n");
                        } else {
                            System.out.println(hero.getName() + "이(가) 쓰러졌습니다.\n");
                            System.out.println("게임을 종료합니다.");
                            System.exit(0);
                        }

                    }

                    // vs 손오공
                } else if ((number == 3)) {
                    if (hero.belt[0] != 1 || hero.belt[1] != 2) {
                        System.out.println("이전 체육관 대표를 쓰러뜨려야 입장 가능!");
                        return;
                    }
                    System.out.println(son.getName() + " : 승부다!\n");
                    SonThread sonThread = new SonThread(son, hero);
                    sonThread.start();

                    // fight-son
                    while (true) {
                        if (son.getHp() < 0) {
                            Thread.interrupted();
                        }
                        hero.공격하기(son);
                        if (son.getHp() > 0) {
                            System.out.println(son.getName() + "의 남은 체력 : " + son.getHp() + "\n");

                        } else {
                            System.out.println(son.getName() + "이(가) 쓰러졌습니다.");
                            System.out.println("경험치 +30");
                            System.out.println("돈 +1000");
                            hero.setExp(hero.getExp() + son.getExp());
                            hero.levelUp();
                            hero.setMoney(hero.getMoney() + son.getMoney());
                            break;
                        }
                        System.out.println(son.getName() + "의 공격");
                        son.공격하기(hero);
                        if (hero.getHp() > 0) {
                            System.out.println(hero.getName() + "의 남은 체력 : " + hero.getHp() + "\n");
                        } else {
                            System.out.println(hero.getName() + "이(가) 쓰러졌습니다.\n");

                            System.out.println("게임을 종료합니다.");
                            System.exit(0);
                        }
                    }
                    System.out.println("\n" + son.getName() + "(초사이언 상태) : 잠깐... 아직 끝나지 않았다..\n");
                    SuperSonThread superSonThread = new SuperSonThread(superSon, hero);
                    superSonThread.start();

                    while (true) {
                        //슈퍼손오공
                        hero.공격하기(superSon);
                        if (superSon.getHp() > 0) {
                            System.out.println(superSon.getName() + "의 남은 체력 : " + superSon.getHp() + "\n");
                        } else {
                            Thread.interrupted();
                            System.out.println(superSon.getName() + "!이(가) 쓰러졌습니다.");
                            System.out.println("경험치 +50");
                            System.out.println("돈 +2000");
                            hero.setExp(hero.getExp() + superSon.getExp());
                            hero.levelUp();
                            hero.setMoney(hero.getMoney() + superSon.getMoney());
                            System.out.println("\n(짝짝짝) 챔피언 타이틀을 획득했습니다.");
                            try {
                                Thread.sleep(3000);
                            } catch (InterruptedException e) {
                            }
                            son.setHp(son.getMaxHp() * 2);
                            superSon.setHp(superSon.getMaxHp() * 2);
                            break;
                        }

                        System.out.println(superSon.getName() + "의 공격");
                        superSon.공격하기(hero);
                        if (hero.getHp() > 0) {
                            System.out.println(hero.getName() + "의 남은 체력 : " + hero.getHp() + "\n");

                        } else {
                            System.out.println(hero.getName() + "이(가) 쓰러졌습니다.\n");
                            System.out.println("게임을 종료합니다.");
                            System.exit(0);
                        }

                        //mainSystem.sparring();
                    }
                }
            } else if (nb == 3) {
                System.out.println("1.홀짝(x2) 2.뽑기(x8) ");
                int lotto = sc.nextInt();
                if (lotto == 1) {
                    System.out.println("금액을 입력하세요"); //소지금을 입력
                    int inPut = sc.nextInt();
                    if (inPut <= hero.getMoney()) {  //투입금액이 소지금액을 넘지 않으면 도박을 시작.
                        hero.setMoney(hero.getMoney() - inPut);
                        Random rdNum = new Random();//랜덤으로 하나를 뽑아야함.
                        int luckyNum = rdNum.nextInt(10) + 1;
                        System.out.println("홀! 짝!");
                        System.out.println("숫자선택!\n1.홀수 2.짝수");
                        int select = sc.nextInt();
                        if (select == 1) {
                            if (luckyNum % 2 != 0) {
                                System.out.println("홀수입니다.");
                                System.out.println("\n축하드립니다!\n" + inPut * 2 + "획득!");
                                hero.setMoney((inPut * 2) + hero.getMoney());
                            } else {
                                System.out.println("짝수입니다.");
                                System.out.println("다음 기회에..");
                            }
                        }
                    }
                } else if (lotto == 2) { //뽑기
                    System.out.println("금액을 입력하세요"); //소지금을 입력
                    int inPut = sc.nextInt();
                    if (inPut <= hero.getMoney()) { //투입금액이 소지금액을 넘지 않으면 도박을 시작.
                        System.out.println("숫자선택!\n(1 ~ 10 중 하나 입력)");
                        int select = sc.nextInt();
                        Random rdNum = new Random();
                        int luckyNum = rdNum.nextInt(10) + 1;
                        System.out.println("행운의 숫자는 : " + luckyNum);
                        if (select == luckyNum) {
                            System.out.println("\n축하드립니다!\n" + inPut * 8 + "획득!");
                            hero.setMoney((inPut * 8) + hero.getMoney());
                        } else if (select != luckyNum) {
                            System.out.println("다음기회에");
                            hero.setMoney(hero.getMoney() - inPut);
                        }
                    }
                } else {
                    System.out.println("소지금이 부족합니다.");
                }
                //ainSystem.gamble();
            } else if (nb == 4) {
                System.out.println("\n체육관 이용료는 1000원 입니다.");
                System.out.println("1.이용하기 2.나가기");
                int menuSelect = sc.nextInt();
                if (menuSelect == 1) {
                    //이용하기 1번
                    if (hero.getMoney() < 1000) {
                        System.out.println("소지금이 부족합니다.");
                    }
                    //if( 현재 소지금이 100원보다 적으면 이용 불가능)
                    else {
                        hero.setMoney(hero.getMoney() - 1000);
                        System.out.println("\n어느 훈련을 하시겠습니까?\n1.유산소 2.근력");
                        int select = sc.nextInt();
                        if (select == 1) {
                            System.out.println("\n체력이 100 증가합니다");
                            hero.setMaxHp(hero.getMaxHp() + 100);
                        } else if (select == 2) {
                            System.out.println("\n힘이 50 증가합니다.");
                            hero.setPower(hero.getPower() + 50);
                        }
                    }
                } else if (menuSelect == 2) {
                    System.out.println("\n(끼익..철컥)");
                }
                //mainSystem.training();
            } else if (nb == 5) {
                System.out.println("1.물류센터(체력을 소모하며 10,000원 획득!)\n2.전단지(체력소모 없이 5원씩 획득!)");
                int select = sc.nextInt();
                if (select == 1) {
                    if (hero.getHp() < 100) {
                        System.out.println("체력이 부족해서 물류센터 일을 할 수 없습니다.");
                        return;
                    }
                    System.out.println("\n(끙..)\n10,000을 벌었습니다.");
                    hero.setMoney(hero.getMoney() + 10000);
                    Random rd = new Random();
                    int injury = rd.nextInt(100) + 1;
                    if (injury <= 30) {
                        System.out.println("고된 노동에 체력의 한계를 느낍니다. 체력을 500 소모합니다.");
                        hero.setHp(hero.getHp() - 500);
                        if (hero.getHp() < 1) {
                            hero.setHp(1);
                        }

                    } else {
                        System.out.println("체력을 100 소모합니다");
                        hero.setHp(hero.getHp() - 100);
                        if (hero.getHp() < 1) {
                            hero.setHp(1);
                        }
                    }
                } else if (select == 2) {
                    System.out.println("장당 5원의 돈이 책정되었습니다.");
                    while (true) {
                        System.out.println("1.시작하기 2.그만하기");
                        int start = sc.nextInt();
                        if (start == 1) {
                            System.out.println("+5원을 정산합니다.");
                            hero.setMoney(hero.getMoney() + 5);
                        } else if (start == 2) {
                            System.out.println();
                            break;
                        }
                    }

                }
                //mainSystem.labor();
            } else if (nb == 6) {
                System.out.println("\n1.찜질방(모든 체력이 회복됩니다.) \n2.국밥(체력이 100만큼 회복됩니다.)");
                int eat = sc.nextInt();
                if (eat == 1) {
                    System.out.println("이용료는 10,000원 입니다.");
                    System.out.println("1.이용하기 2.나가기");
                    int select = sc.nextInt();
                    if (select == 1) {
                        if (hero.getMoney() < 10000) {
                            System.out.println("소지금이 부족합니다.");
                        } else if (hero.getHp() == hero.getMaxHp()) {
                            System.out.println("회복할 체력이 없습니다. 그래도 이용하시겠습니까?\n1.이용하기 2.나가기");

                            int select2 = sc.nextInt();
                            if (select2 == 1) {
                                System.out.println("\n찜질을 통해 온몸의 피로가 풀립니다");
                                hero.setMoney(hero.getMoney() - 10000);
                            } else if (select2 == 2) {
                                System.out.println("\n(수고하세요..)");
                            }
                        } else {
                            System.out.println("\n찜질을 통해 온몸의 피로가 풀립니다\n체력이 모두 회복됩니다.");
                            hero.setHp(hero.getMaxHp());
                            hero.setMoney(hero.getMoney() - 10000);
                        }
                    } else if (select == 2) {
                        System.out.println("\n(수고하세요..)");
                    }

                } else if (eat == 2) {
                    System.out.println("가격은 500원 입니다.");
                    System.out.println("1.주문하기 2.나가기");
                    int select = sc.nextInt();
                    if (select == 1) {
                        if (hero.getMoney() < 500) {
                            System.out.println("소지금이 부족합니다.");
                        } else if (hero.getHp() == hero.getMaxHp()) {
                            System.out.println("회복할 체력이 없습니다. 그래도 이용하시겠습니까?\n1.이용하기 2.나가기");
                            int select2 = sc.nextInt();
                            if (select2 == 1) {
                                System.out.println("\n(후루룩..)");
                                hero.setMoney(hero.getMoney() - 500);
                            } else if (select2 == 2) {
                                System.out.println("\n(수고하세요..)");
                            }
                        } else {
                            System.out.println("\n(후루룩..)\n체력 100이 회복되었습니다..");
                            hero.setHp(hero.getHp() + 100);
                            hero.setMoney(hero.getMoney() - 500);
                            if (hero.getHp() > hero.getMaxHp()) {
                                hero.setHp(hero.getMaxHp());
                            }
                        }

                    } else if (select == 2) {
                        System.out.println("수고하세요..");
                    }
                    //mainSystem.rest();
                }
            } else if (nb == 7) {
                System.exit(0);
            } else if (nb == 0) {
                hero.setHp(hero.getHp() + 10000);
                hero.setMoney(hero.getMoney() + 10000);
                hero.setPower(hero.getPower() + 1000);
            }
        }
    }
}




