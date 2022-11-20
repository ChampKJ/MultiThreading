
class Data implements Runnable
{
	String contents;
	int size;
	Data(){}
	Data(String t, int s)
	{
		contents=t;
		size=s;
	}
	
 synchronized public void accessData(String purpose)
	{
	 if(purpose.equals("Editor"))
		{
			
				contents =contents.concat(" ffks fsfh;skhfds");
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Edited sucessfully...");
		}
	else
		{
		for(int i=0;i<contents.length();i++)
		{
			System.out.println(contents.charAt(i));
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("Read sucessfully...");
		}
	}
	public void run()
	{
		System.out.println(Thread.currentThread().getName() + " Sarted WOrking ..");
		accessData(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName() + " Completed WOrking ..");
		
	
	
	}
}


public class SynchronizationExample {

		public static void main(String s[])
		{
			Data d = new Data("Some data", 234);
			Thread editor=new Thread(d,"Editor");
			Thread reader=new Thread(d,"Reader");
			
			editor.start();
			
			reader.start();
		}
}
