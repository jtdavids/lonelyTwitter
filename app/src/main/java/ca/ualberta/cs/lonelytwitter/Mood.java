package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Jake on 14/09/2015.
 */
public abstract class Mood {
    private Date date;

    public Mood(Date date) {
        this.date = date;
    }

    public Mood(){
        date = new Date();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract String getMood();

}
