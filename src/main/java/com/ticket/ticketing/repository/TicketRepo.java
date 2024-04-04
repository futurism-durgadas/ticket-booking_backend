package com.ticket.ticketing.repository;

import com.ticket.ticketing.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepo extends JpaRepository<Ticket,Integer> {
    Ticket findTicketByDest(String dest);
}
