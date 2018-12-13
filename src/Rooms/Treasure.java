package Rooms;

import Game.Runner;
import People.Person;

public class Treasure extends Room
{

    public Treasure (int treasurex, int treasurey) {
        super(treasurex, treasurey);



    }


    /**
     * Triggers the game ending conditions.
     * @param x the Person entering
     */
    @Override
    public void enterRoom(Person x) {

        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("You have found treasure. You have earned bonus coins.");
        Runner.gameOff();
    }


}

