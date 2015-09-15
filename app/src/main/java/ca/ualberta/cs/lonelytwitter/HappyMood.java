package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Jake on 14/09/2015.
 */
public class HappyMood extends Mood {
    public HappyMood(Date date) {
        super(date);
    }

    public HappyMood() {
        super();
    }

    @Override
    public String getMood() {
        return "Happy";
    }
}
