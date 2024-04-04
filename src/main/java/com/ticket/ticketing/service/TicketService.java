package com.ticket.ticketing.service;

import com.ticket.ticketing.entity.Ticket;
import com.ticket.ticketing.repository.TicketRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService {
    @Autowired
    private TicketRepo ticketRepo;

    public int calculateTotalBill(String dest,int adult,int child){
        Ticket t1 = ticketRepo.findTicketByDest(dest);
        return (adult * t1.getFull_price()) + (child * t1.getHalf_price());
    }

}
