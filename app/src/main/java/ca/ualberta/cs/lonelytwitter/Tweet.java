package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Jake on 14/09/2015.
 */
public abstract class Tweet extends Object{
    private String text;
    private Date date;
    private ArrayList<Mood> moods;

    public Tweet(String text, Date date) {
        this.text = text;
        this.date = date;
        moods = new ArrayList<Mood>();
    }

    public Tweet(String text) {
        this.text = text;
        date = new Date();
        moods = new ArrayList<Mood>();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) throws IOException {
        if (text.length() <= 140) {
            this.text = text;
        } else{
            throw new IOException("Tweet was too long!");
        }
    }
    public abstract Boolean isImportant();

    public void addMood(Mood mood){
        moods.add(mood);
    }

}
