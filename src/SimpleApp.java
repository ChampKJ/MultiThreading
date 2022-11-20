
class ScoreThread implements Runnable//extends Thread
{
	int score;
  public ScoreThread()
  {
	 // super(n);
	  score=0;
  }
  public void run()
  {
	  System.out.println(Thread.currentThread().getName() + "playing");
	while(score<=1000)
	{
	   score+=100;
	   System.out.println("Score reached to " + score );
	   try {
		Thread.sleep(200);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	} 
	  
		 
  }
}

class MusicThread extends Thread
{
	public void run()
	{
		System.out.println("Music started....");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Music stopped!!!");
	}
}

class MyThread extends Thread
{
	public void run() 
	{
		System.out.println("National Anthom is going on...");
		for(int i=1;i<=10;i++)
		{
		    System.out.println("National Anthom i= "+ i);
			if(i==5)
				try {
					join(6000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		System.out.println("National Anthom is completd");
	}
}

public class SimpleApp {

	public static void main(String[] args) throws InterruptedException
	{
		System.out.println(Thread.currentThread().getName() + "Started  .."
				+ " with priority "+Thread.currentThread().getPriority() );
		
		
		MyThread nAtnm=new MyThread();
		
		//nAtnm.join();
		ScoreThread target = new ScoreThread();
		Thread player1 = new Thread(target,"Virat");
		
		
		nAtnm.start();
		player1.start();
		
//		Thread player2 = new Thread(target,"Vrushabh");
//		System.out.println(player2.getName() + " just borned! It's state is "+player2.getState());
//
//		player2.start();
//		player1.start();
		System.out.println("Main finshed");
	}

}
