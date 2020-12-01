package lession1;

import java.util.Objects;

public class Competition {
    private Obstacle[] obstacles;
    private Participant[] participants;
    private final String competitionTitle;

    public Competition(String competitionTitle) {   
        this.competitionTitle = competitionTitle;
    }

    public void setObstacles(Obstacle... obstacles) {
        this.obstacles = obstacles;
    }

    public void setParticipants(Participant... participants) {
        this.participants = participants;
    }

    public void startCompetition() {
        System.out.println("Начало соревнования" + competitionTitle);


        for (Participant participant : participants) {
            boolean sucess = passAllObstacles(participant);
            if (! sucess) {
                System.out.println("Участник " + participant + " покинул испытание");
            } else {

            }
        }
    }

    private boolean passAllObstacles(Participant participant) {
        for (Obstacle obstacle : obstacles) {
            if (!participant.doIt(obstacle) ) {
                return false;
            }
            System.out.println();
        }
        return true;
    }

}