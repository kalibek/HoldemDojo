package com.nedogeek.holdem.gameEvents;

import com.nedogeek.holdem.gamingStuff.Player;
import com.nedogeek.holdem.gamingStuff.PlayersList;

/**
 * User: Konstantin Demishev
 * Date: 09.03.13
 * Time: 18:28
 */
public class PlayerMovesEvent extends Event {
    private final int moverNumber;

    public PlayerMovesEvent(Player mover, PlayersList players) {
        super(mover.getName() + " moves.");

        moverNumber = players.indexOf(mover);
    }

    public int getMoverNumber() {
        return moverNumber;
    }
}
