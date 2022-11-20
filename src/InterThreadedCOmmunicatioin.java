class SenderThread extends Thread
{
	MessageService m;
	public SenderThread(String n,MessageService m)
	{
		super(n);
		this.m=m;
	}
	public void run()
	{
		System.out.println(Thread.currentThread().getName() + " Started...");
		while(true)
		{
			m.sendMessage();
		}
	}
	
}
class ReceiverThread extends Thread
{
	MessageService m;
	public ReceiverThread(String n,MessageService m)
	{
		super(n);
		this.m=m;
	}
	public void run()
	{
		System.out.println(Thread.currentThread().getName() + " Started...");
		while(true)
		{
			m.receiveMessage();
		}
	}
	
	
}
public class InterThreadedCOmmunicatioin {

	public static void main(String[] args) {
		MessageService m = new MessageService();
		SenderThread st = new SenderThread("Senedr-Thread", m);
		ReceiverThread rt = new ReceiverThread("Receiver-Thread", m);
		st.start();
		rt.start();

	}

}
