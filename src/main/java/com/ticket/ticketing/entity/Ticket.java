package com.ticket.ticketing.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "ticket", schema = "public")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ticket_id")
    private int ticket_id;
    @Column(name = "source")
    private String source;
    @Column(name = "dest")
    private String dest;
    @Column(name = "km")
    private int km;
    @Column(name = "full_price")
    private int full_price;
    @Column(name = "half_price")
    private int half_price;

    public Ticket() {

    }

    public Ticket(int ticket_id, String source, String dest, int km, int full_price, int half_price) {
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
