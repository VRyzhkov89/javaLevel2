package lession1;

public class Cat implements Participant{
    private final String type;
    private final String name;
    private final int maxJump;
    private final int maxRun;


    public Cat(String type,String name,int maxJump,int maxRun) {
        this.type=type;
        this.name=name;
        this.maxRun=maxRun;
        this.maxJump=maxJump;
    }

    public void run(int dist) {
        if (this.maxRun >= dist) System.out.println(this.type + " пробежал " + dist + " метров.");
        else System.out.println(this.type + " " + "не может бежать так далеко.");
    }
    public void jump(double dist) {
        if (this.maxJump >= dist) System.out.println(this.type + " прыгнул на " + dist + " метра.");
        else System.out.println(this.type + " не может прыгнуть так высоко!");
    }

    @Override
    public int run() {
        System.out.printf("Кот %s бежит дистанцию %d%n",type,maxRun);
        return maxRun;
    }

    @Override
    public int jump() {
        System.out.printf("Кот %s прыгнул на %d%n",type,maxJump);
        return maxJump;
    }
}
