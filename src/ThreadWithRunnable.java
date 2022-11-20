class MatchScore implements Runnable
{
	int score;
  public MatchScore(int s)
  {
	 // super(n);
	  score=s;
  }
  public void run()
  {
	  for(;score<=1000;score+=100)
	  {
		  System.out.println("MatchSocre is  -"+ score);
		  try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
  }
}

public class ThreadWithRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MatchScore targetTask = new MatchScore(10);
		 
		Thread p1 = new Thread(targetTask, "India-pak -20-20");
		p1.start();
		}

}
