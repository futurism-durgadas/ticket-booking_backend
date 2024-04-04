package com.ticket.ticketing.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "register", schema = "public")
public class Register {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "fname")
    private String fname;
    @Column(name = "lname")
    private String lname;
    @Column(name = "email_id")
    private String email_id;
    @Column(name = "address")
    private String address;
    @Column(name = "age")
    private int age;
    @Column(name = "contact")
    private String contact;

    @Column(name = "gender")
    private String gender;

    public Register() {

    }

    public Register(int id, String fname, String lname, String email_id, String address, int age, String contact, String gender) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.email_id = email_id;
        this.address = address;
        this.age = age;
        this.contact = contact;
        this.gender = gender;
    }

    public int getId() { return id; }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
