package com.ticket.ticketing.controller;

import com.ticket.ticketing.dto.TicketDto;
import com.ticket.ticketing.entity.Ticket;
import com.ticket.ticketing.repository.TicketRepo;
import com.ticket.ticketing.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/ticket")
public class TicketController {

    @Autowired
    TicketRepo repo;

    @Autowired
    TicketService ticketService;

    @GetMapping("/getTicket")
    public List<Ticket> getAllTicket(){
        return repo.findAll();
    }

    @PostMapping("/addTicket")
    public Ticket addInfo(@RequestBody Ticket ticket) {
        return repo.save(ticket);
    }

    @PostMapping("/calculateTotalBill")
    public ResponseEntity<Integer> calculateTotalBill(@RequestParam(name = "destination") String dest,
                                                      @RequestParam(name = "adult") int adult,
                                                      @RequestParam(name = "child") int child){
        int total_bill = ticketService.calculateTotalBill(dest, adult, child);
        return ResponseEntity.ok(total_bill);
    }


}
