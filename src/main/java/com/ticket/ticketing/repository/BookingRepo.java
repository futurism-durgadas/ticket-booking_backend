package com.ticket.ticketing.repository;

import com.ticket.ticketing.dto.BookingDetailsDto;
import com.ticket.ticketing.dto.BookingDto;
import com.ticket.ticketing.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepo extends JpaRepository<Booking,Integer> {

//    @Query("SELECT b.user.id, b.user.fname, b.user.contact, b.source, b.dest, b.adult, b.child FROM Booking b")
//    List<BookingDetailsDto> findAllBookingsWithUserDetails();

}
