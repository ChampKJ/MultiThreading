
public class BookMyShow extends Thread
{
	Ticket t;
	public BookMyShow(String tn,Ticket t) {
		super(tn);
		this.t = t;
	}
	public void run()
	{
		System.out.println(Thread.currentThread().getName() + " your tickets are being booked");
		
		t.bookTheTickets(20);
		System.out.println("Thanks for using BookMySjow to book the tickets...");
	}
}
