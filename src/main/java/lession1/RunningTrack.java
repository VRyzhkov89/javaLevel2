package lession1;

public class RunningTrack {
    public final int length;

    public RunningTrack(int length) {
        this.length=length;
    }

    public boolean passObstacleBy(Participant participant) {
        if (participant.run() > length) {
            System.out.println("Участник " + participant + " пробежал дистанцию");
            return true;
        } else {
            System.out.println("Участник " + participant + "не прошел дистанцию" + length);
            return false;
        }
    }
}
