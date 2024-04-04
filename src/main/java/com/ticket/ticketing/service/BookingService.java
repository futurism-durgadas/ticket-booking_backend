package com.ticket.ticketing.service;

import com.ticket.ticketing.dto.BookingDetailsDto;
import com.ticket.ticketing.dto.BookingDto;
import com.ticket.ticketing.entity.Booking;
import com.ticket.ticketing.entity.Register;
import com.ticket.ticketing.repository.BookingRepo;
import com.ticket.ticketing.repository.RegisterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookingService {

    @Autowired
    BookingRepo bookingRepo;

    @Autowired
    RegisterRepo registerRepo;

//    public List<Booking> getAllBookingWithPagination(int pageNumber,int pageSize){
//        Pageable pageable = PageRequest.of(pageNumber,pageSize);
//        Page<Booking> bookingDetails = bookingRepo.findAll(pageable);
//
//        List<Booking> allBooking = bookingDetails.getContent().stream()
//                .map(Booking::new)
//                .collect(Collectors.toList());
////        return bookingRepo.findAll();
//        return allBooking;
//    }

    public Booking saveDataDto(BookingDto bookingDto) {
        Booking booking = new Booking();
        Register user = registerRepo.findById(bookingDto.getUser_id()).orElse(null);
            booking.setSource(bookingDto.getSource());
            booking.setDest(bookingDto.getDest());
            booking.setAdult(bookingDto.getAdult());
            booking.setChild(bookingDto.getChild());
            booking.setTravel_date(bookingDto.getTravel_date());
            booking.setTotal_bill(bookingDto.getTotal_bill());
            booking.setUser(user);

            bookingRepo.save(booking);
            return  booking;

    }

    public List<BookingDetailsDto> getAllBookingsWithUserDetails() {
        List<Booking> bookings = bookingRepo.findAll();
        return bookings.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }
    private BookingDetailsDto convertToDto(Booking booking){
        BookingDetailsDto bookingDetailsDto = new BookingDetailsDto();

        bookingDetailsDto.setBooking_id(booking.getBooking_id());
        bookingDetailsDto.setPassengerName(booking.getUser().getFname());
        bookingDetailsDto.setMobileNo(booking.getUser().getContact());
        bookingDetailsDto.setSourceCity(booking.getSource());
        bookingDetailsDto.setDestinationCity(booking.getDest());
        bookingDetailsDto.setNoOfAdult(booking.getAdult());
        bookingDetailsDto.setNoOfChild(booking.getChild());
        bookingDetailsDto.setTotal_bill(booking.getTotal_bill());
        bookingDetailsDto.setTravel_date(booking.getTravel_date());

        return bookingDetailsDto;

    }
}
