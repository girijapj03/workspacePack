package com.xworkz.theaterticket;

import com.xworkz.theaterticket.movieBook.OnlineMovieBook;
import com.xworkz.theaterticket.theater.Theater;
import com.xworkz.theaterticket.ticketSystem.TicketSystem;

public class Tester {

	public static void main(String[] args) {
		TicketSystem system=new OnlineMovieBook();
		Theater  theater=new Theater();
		theater.setRule(system);
		theater.bookSeat(90);
		
		theater.cancelTickets(140);
		theater.cancelTickets(50);
		theater.bookSeat(130);

	}

}
