import java.util.Scanner;

public class MessageService
{
	String message="Hello";
	boolean flag=true;
	Scanner sc=new Scanner(System.in);
	synchronized public void sendMessage()
	{
		if(flag==true)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Enter the message to be sent :");
		message=sc.nextLine();
		flag=true;
		notify();
	}
	
	synchronized public void receiveMessage()
	{
		if(flag==false)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("Message received : "+message);
		flag=false;
		notify();
	}
	
	
	
	

}
