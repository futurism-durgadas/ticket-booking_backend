package com.ticket.ticketing.dto;

import java.util.Date;

public class BookingDetailsDto {

    private int booking_id;
    private String passengerName;
    private String mobileNo;
    private String sourceCity;
    private String destinationCity;
    private int noOfAdult;
    private int noOfChild;
    private Date travel_date;
    private int total_bill;
    public BookingDetailsDto() {

    }

    public BookingDetailsDto(int booking_id, String passengerName, String mobileNo, String sourceCity, String destinationCity, int noOfAdult, int noOfChild, Date travel_date, int total_bill) {
        this.booking_id = booking_id;
        this.passengerName = passengerName;
        this.mobileNo = mobileNo;
        this.sourceCity = sourceCity;
        this.destinationCity = destinationCity;
        this.noOfAdult = noOfAdult;
        this.noOfChild = noOfChild;
        this.travel_date = travel_date;
        this.total_bill = total_bill;
    }

    public int getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(int booking_id) {
        this.booking_id = booking_id;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getSourceCity() {
        return sourceCity;
    }

    public void setSourceCity(String sourceCity) {
        this.sourceCity = sourceCity;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }

    public int getNoOfAdult() {
        return noOfAdult;
    }

    public void setNoOfAdult(int noOfAdult) {
        this.noOfAdult = noOfAdult;
    }

    public int getNoOfChild() {
        return noOfChild;
    }

    public void setNoOfChild(int noOfChild) {
        this.noOfChild = noOfChild;
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
}
