package ca.ualberta.cs.lonelytwitter.test;

import java.util.Collections;
import java.util.Comparator;

import ca.ualberta.cs.lonelytwitter.LonelyTweetModel;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.TweetListModel;
import android.test.ActivityInstrumentationTestCase2;


public class TweetListModelTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity>
{

	public TweetListModelTest( )
	{

		super(LonelyTwitterActivity.class);
		// TODO Auto-generated constructor stub
	}
	//public void testFail(){
	//	fail("we should have never palyed");
	//}
	public void testFiveIsFive(){
		assertEquals(5, 5);
	}
	
	public void testTweetlistModel(){

		TweetListModel tlm = new TweetListModel();

	}

	public void testAdd()
	{

		LonelyTweetModel t = new LonelyTweetModel("Hello");
		TweetListModel tlm = new TweetListModel();
		tlm.add(t);
		assertTrue(tlm.hasTweet(t));
	}

	public void testremove()
	{

		LonelyTweetModel t = new LonelyTweetModel("Hello");
		TweetListModel tlm = new TweetListModel();
		tlm.add(t);
		tlm.removeTweet(t);
		assertFalse(tlm.hasTweet(t));
	}
	public void testhasTweets(){
		LonelyTweetModel t = new LonelyTweetModel("Hello");
		TweetListModel tlm = new TweetListModel();
		for (int i=0;i<tlm.getcount();i++){
			assertFalse(tlm.getTweet(i).equals(t));
		}
	}
	public void testgetTweets(){
		LonelyTweetModel t = new LonelyTweetModel("Hello");
		TweetListModel tlm = new TweetListModel();
		TweetListModel tlm2 = new TweetListModel();
		tlm2.add(t);
		LonelyTweetModel t1 = new LonelyTweetModel("Hello");
		tlm2.add(t1);
		LonelyTweetModel t2 = new LonelyTweetModel("Hello");
		tlm2.add(t2);
		LonelyTweetModel t3 = new LonelyTweetModel("Hello");
		tlm2.add(t3);
		LonelyTweetModel t4 = new LonelyTweetModel("Hello");
		tlm2.add(t4);
		Collections.sort(tlm, new Comparator<TweetListModel>() {
			  public int compare(TweetListModel o1, TweetListModel o2) {
			      return o1.getDateTime().compareTo(o2.getDateTime());
			  }
			});
		assertTrue(tlm.getTweets().equals(tlm2));
	}
	public void testgetcount(){
		LonelyTweetModel t = new LonelyTweetModel("Hello");
		TweetListModel tlm = new TweetListModel();
		tlm.add(t);
		LonelyTweetModel t1 = new LonelyTweetModel("Hello");
		tlm.add(t1);
		LonelyTweetModel t2 = new LonelyTweetModel("Hello");
		tlm.add(t2);
		LonelyTweetModel t3 = new LonelyTweetModel("Hello");
		tlm.add(t3);
		assertTrue(tlm.getcount()==4);
	}
	public void addTweet(){
		LonelyTweetModel t = new LonelyTweetModel("Hello");
		TweetListModel tlm = new TweetListModel();
		try{
			tlm.add(t);
		}
		catch(IllegalArgumentException e){
		}

	}
	
}
