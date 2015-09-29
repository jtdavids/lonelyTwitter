package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import junit.framework.Assert;
import junit.framework.TestCase;

import java.util.List;

/**
 * Created by Jake on 28/09/2015.
 */
public class TweetListTest extends ActivityInstrumentationTestCase2 {

    public TweetListTest() {
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }

    public void testAddTweet(){
        TweetList list = new TweetList();
        list.add(new NormalTweet("test"));
    }
    public void testAddException(){
        try {
            TweetList list = new TweetList();
            list.add(new NormalTweet("test"));
            list.add(new NormalTweet("test"));
        }
        catch (IllegalArgumentException e){
            assertEquals("gg",e.getMessage());
        }

    }
    public void testGetTweet(){
        TweetList list = new TweetList();
        NormalTweet tweet1 = new NormalTweet("test");
        NormalTweet tweet2 = new NormalTweet("test2");
        list.add(tweet1);
        list.add(tweet2);

        List<Tweet> list2 = list.getTweets();
        assertEquals(tweet1, list2.get(0));
        assertEquals(tweet2, list2.get(1));
    }

    public void testRemove(){
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.add(tweet);
        list.removeTweet(tweet);
        assertFalse(list.contains(tweet));
    }
    public void testContains(){
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.add(tweet);
        assertTrue(list.contains(tweet));
    }

    public void testHasTweet(){
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.add(tweet);
        assertTrue(list.hasTweet(tweet));
    }
    public void testCount(){
        TweetList list = new TweetList();
        NormalTweet tweet1 = new NormalTweet("test");
        NormalTweet tweet2 = new NormalTweet("test2");
        list.add(tweet1);
        assertEquals(list.getCount(), 1);
        list.add(tweet2);
        assertEquals(list.getCount(), 2);
        list.removeTweet(tweet2);
        assertEquals(list.getCount(),1);
    }
}