package com.xworkz.theaterticket.ticketSystem;

public interface TicketSystem {
	int TOTAL_TICKETS=100;
	boolean book(int totalTickets);
	boolean cancel(int tickets);
	

}
