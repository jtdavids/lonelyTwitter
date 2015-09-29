package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by Jake on 28/09/2015.
 */
public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public void add(Tweet tweet){
        if(!tweets.contains(tweet)) {
            tweets.add(tweet);
        }else{
            throw new IllegalArgumentException("gg");
        }
    }

    public void removeTweet(Tweet tweet){
        tweets.remove(tweet);
    }

    public Boolean contains(Tweet tweet){
        return tweets.contains(tweet);
    }

    public ArrayList<Tweet> getTweets(){
        return tweets;
    }
    public Boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }
    public int getCount(){
        return tweets.size();
    }
}
