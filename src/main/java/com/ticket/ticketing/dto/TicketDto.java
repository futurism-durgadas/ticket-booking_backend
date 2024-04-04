package com.ticket.ticketing.dto;

import java.util.Date;

public class TicketDto {

    private int ticket_id;
    private String source;
    private String dest;
    private int km;
    private int full_price;
    private int half_price;


    public TicketDto() {

    }

    public TicketDto(int ticket_id, String source, String dest, int km, int full_price, int half_price) {
        this.ticket_id = ticket_id;
        this.source = source;
        this.dest = dest;
        this.km = km;
        this.full_price = full_price;
        this.half_price = half_price;
    }

    public int getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(int ticket_id) {
        this.ticket_id = ticket_id;
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

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public int getFull_price() {
        return full_price;
    }

    public void setFull_price(int full_price) {
        this.full_price = full_price;
    }

    public int getHalf_price() {
        return half_price;
    }

    public void setHalf_price(int half_price) {
        this.half_price = half_price;
    }
}
