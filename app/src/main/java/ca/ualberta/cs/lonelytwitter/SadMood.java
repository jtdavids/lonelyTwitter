package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Jake on 14/09/2015.
 */
public class SadMood extends Mood {
    public SadMood(Date date) {
        super(date);
    }

    public SadMood() {
        super();
    }

    public String getMood() {
        return "Sad";
    }
}
