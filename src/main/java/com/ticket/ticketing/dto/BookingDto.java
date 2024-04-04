package com.ticket.ticketing.dto;

import java.util.Date;

public class BookingDto {
 //  source, dest, adult, child, travel_date, total_bill,user_id
    private String source;
    private String dest;
    private int adult;
    private int child;
    private Date travel_date;
    private int total_bill;
    private int user_id;
    public BookingDto() {

    }
    public BookingDto(String source, String dest, int adult, int child, Date travel_date, int total_bill, int user_id) {
        this.source = source;
        this.dest = dest;
        this.adult = adult;
        this.child = child;
        this.travel_date = travel_date;
        this.total_bill = total_bill;
        this.user_id = user_id;
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

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
}
