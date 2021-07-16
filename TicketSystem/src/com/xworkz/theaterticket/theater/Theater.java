package com.xworkz.theaterticket.theater;

import com.xworkz.theaterticket.ticketSystem.TicketSystem;

public class Theater {
	private TicketSystem ticket;
	public void bookSeat(int tickets){
		if(tickets <= TicketSystem.TOTAL_TICKETS) {
			System.out.println("tickets are available");
		}else {
			System.out.println("cant book tickets");
		}
	}
	
	public void cancelTickets(int tickets) {
		if(tickets <=TicketSystem.TOTAL_TICKETS) {
			System.out.println(" tickets exited ");
		}else {
			System.out.println(TicketSystem.TOTAL_TICKETS-tickets+"tickets are cancelled");
		}
	}
public void setRule(TicketSystem ticket) {
	this.ticket=ticket;
}
}
