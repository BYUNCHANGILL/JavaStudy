package ch07;

class Tv {
    boolean power;
    int channel;

    void power() {
        power = !power;
    }
    void channelUp() {
        ++channel;
    }
    void channelDown() {
        --channel;
    }
}

class SmartTv extends Tv { // CaptionTv는 Tv에 캡션(자막)을 보여주는 기능을 추가
    boolean caption;
    void displayCaption(String text) {
        if (caption) { // 캡션 상태가 on(true)일 때만 text 를 보여 준다.
            System.out.println(text);
        }
    }
}

public class ExtendsEx {
    public static void main(String[] args) {
        SmartTv stv = new SmartTv();
        stv.channel = 10;			// 조상 클래스로부터 상속받은 멤버
        stv.channelUp();			// 조상 클래스로부터 상속받은 멤버
        System.out.println(stv.channel);

        stv.displayCaption("Hello, World");
        stv.caption = true; // 캡션(자막) 기능을 켠다.
        stv.displayCaption("Hello");
    }
}
