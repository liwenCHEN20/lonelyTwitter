package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;


public class TweetListModel
{
	private ArrayList<LonelyTweetModel> tweets;
	public TweetListModel(){
		super();
		this.tweets = new ArrayList<LonelyTweetModel>();
	}
	public void add(LonelyTweetModel t)
	{

		// TODO Auto-generated method stub
		tweets.add(t);
	}

	public boolean hasTweet(LonelyTweetModel t)
	{
		return tweets.contains(t);

		// TODO Auto-generated method stub

	}
	
	public void removeTweet(LonelyTweetModel t){
		tweets.remove(t);
	}
	
	public ArrayList<LonelyTweetModel> getTweets()
	{

		return tweets;
	}
	
	public LonelyTweetModel getTweet(int i)
	{

		return tweets.get(i);
		
	}
	public int getcount(){
		return tweets.size();
	}
	public Object getDateTime()
	{

		  private Date dateTime;

		  public Date getDateTime() {
		    return dateTime;
		  }

		  public void setDateTime(Date datetime) {
		    this.dateTime = datetime;
		  }

	}
}
