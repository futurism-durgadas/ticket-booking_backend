package com.ticket.ticketing.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "booking", schema = "public")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "booking_id")
    private int booking_id;
    @Column(name = "source")
    private String source;
    @Column(name = "dest")
    private String dest;
    @Column(name = "adult")
    private int adult;
    @Column(name = "child")
    private int child;
    @Column(name = "travel_date")
    private Date travel_date;
    @Column(name = "total_bill")
    private int total_bill;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private Register user;

    public Booking() {

    }

    public Booking(int booking_id, String source, String dest, int adult, int child, Date travel_date, int total_bill) {
        this.booking_id = booking_id;
        this.source = source;
        this.dest = dest;
        this.adult = adult;
        this.child = child;
        this.travel_date = travel_date;
        this.total_bill = total_bill;
    }

    public Booking(Booking booking) {
    }

    public int getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(int booking_id) {
        this.booking_id = booking_id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public int getAdult() {
        return adult;
    }

    public void setAdult(int adult) {
        this.adult = adult;
    }

    public int getChild() {
        return child;
    }

    public void setChild(int child) {
        this.child = child;
    }

    public Date getTravel_date() {
        return travel_date;
    }

    public void setTravel_date(Date travel_date) {
        this.travel_date = travel_date;
    }

    public int getTotal_bill() {
        return total_bill;
    }

    public void setTotal_bill(int total_bill) {
        this.total_bill = total_bill;
    }
    public Register getUser() {
        return user;
    }

    public void setUser(Register user) {
        this.user = user;
    }
}
