
public class Ticket 
{
	int stock;
	public Ticket() {stock=50;}
	 public void bookTheTickets(int qty)
	{
		if(stock>=qty)
		{
			
				stock-=qty;
				System.out.println(Thread.currentThread().getName() + " your "+ qty+" tickets are booked!");
				System.out.println("Stock updated to "+stock );
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		else
		{
			if(stock==0)
			System.out.println("Show is house FULLLL...");
			else
				System.out.println("Sorry.. only "+stock + " tickets available!!");

		}
			
	}

}
