
public class OnlineBookingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ticket t=new Ticket();
		BookMyShow user1 = new BookMyShow("User Booking1",t);
		BookMyShow user2 = new BookMyShow("User Booking2",t);
		BookMyShow user3 = new BookMyShow("User Booking3",t);
		
		user1.start();
		user2.start();
		user3.start();
	}

}
