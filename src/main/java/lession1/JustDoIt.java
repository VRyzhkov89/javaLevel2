package lession1;

import java.util.Random;

public class JustDoIt {
    public static void main(String[] args) {

        System.out.println("Подготовительный этап");

        Competition competition = createAndPrepareCompetition();

        System.out.println("Начинаем соревнование");

        competition.startCompetition();
        System.out.println("Соревнование окончено! Победители");

    }

    private static Competition createAndPrepareCompetition() {
            Participant human = new Human("Человек","Вова",2,5000);
            Participant cat = new Cat("Кот","Томас",3,2000);
            Participant droid = new Droid("Робот","Бендер",5,1000);

        Random random = new Random();

        Wall wall = new Wall(random.nextInt(5));
        RunningTrack runningTrack = new RunningTrack(random.nextInt(5000));

        Competition competition = new Competition("Замес");
        competition.setParticipants(human,cat,droid);
        return competition;
    }
}
