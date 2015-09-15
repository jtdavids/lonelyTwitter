package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;
import java.util.Date;

/**
 * Created by Jake on 14/09/2015.
 */
public class ImportantTweet extends Tweet implements Tweetable {
    public ImportantTweet (String text, Date date){
        super(text, date);
    }

    public ImportantTweet(String text) throws IOException {
        super(text);
        this.setText(text);
    }
    public Boolean isImportant(){
        return Boolean.TRUE;
    }
}
