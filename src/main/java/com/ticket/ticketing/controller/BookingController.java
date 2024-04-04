package com.ticket.ticketing.controller;

import com.ticket.ticketing.dto.BookingDetailsDto;
import com.ticket.ticketing.dto.BookingDto;
import com.ticket.ticketing.entity.Booking;
import com.ticket.ticketing.repository.BookingRepo;
import com.ticket.ticketing.repository.RegisterRepo;
import com.ticket.ticketing.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/booking")
public class BookingController {

    @Autowired
    BookingRepo bookingRepo;

    @Autowired
    RegisterRepo registerRepo;

    @Autowired
    BookingService bookingService;

    @GetMapping("/getBooking")
    public List<Booking> getAllBooking(){
        return bookingRepo.findAll();
    }

//    @GetMapping("/getBooking")
//    public ResponseEntity<List<Booking>> getAllBookingWithPagination(@RequestParam(value = "pageNumber" ,defaultValue = "1", required = false) int pageNumber,
//                                                                    @RequestParam(value = "pageSize", defaultValue = "10", required = false) int pageSize){
//        List<Booking> allBooking=bookingService.getAllBookingWithPagination(pageNumber,pageSize);
//        return ResponseEntity.ok(allBooking);
//
//    }

    @PostMapping("/addBooking")
    public Booking addBooking(@RequestBody Booking book) {
        return bookingRepo.save(book);
    }

    @PostMapping("/addBooking-Data")
    public Booking saveData(@RequestBody BookingDto bookingDto) {
        return bookingService.saveDataDto(bookingDto);
    }

    @GetMapping("/getBooking-Data")
    public List<BookingDetailsDto> getAllBookingsWithUserDetails() {
        return bookingService.getAllBookingsWithUserDetails();
    }

}
