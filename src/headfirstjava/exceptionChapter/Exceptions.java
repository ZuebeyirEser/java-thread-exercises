package headfirstjava.exceptionChapter;

public class Exceptions {
    public static void main(String[] args) {
        MusicTest1 mt = new MusicTest1();
        mt.play();
        System.out.println(1/0);
    }

}
