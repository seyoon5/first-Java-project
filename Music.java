package bgm;

import javazoom.jl.player.Player;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Music extends Thread {
    boolean isLoop; //반복여부 정하기
    String name; //음악파일이름(확장자까지) 넣기
    Player player;
    FileInputStream fis;
    BufferedInputStream bis;

    //생성자부분
    public Music(String fileName, boolean isLoop) {
        try {
            this.name = fileName;
            this.isLoop = isLoop;

            //프로그램내의 src아래 bgm패키지를 생성하고 그곳에 음악파일을 넣었을 때의 경로
            //C:/~src/패키지이름/음악파일이름.mp3 까지 해도 상관없음
            fis = new FileInputStream("src/bgm" + name);
            bis = new BufferedInputStream(fis);
            player = new Player(bis);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    //음악종료
    public void close(){
        isLoop = false;
        this.interrupt();
    }

    @Override
    public void run() {
        try {
            do {
                fis = new FileInputStream("src/bgm" + name);
                bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();
            }
            while (isLoop);
        } catch (Exception e) {

        }
    }

}

