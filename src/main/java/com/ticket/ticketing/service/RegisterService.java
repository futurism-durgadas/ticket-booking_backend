package com.ticket.ticketing.service;

import com.ticket.ticketing.entity.Register;
import com.ticket.ticketing.repository.RegisterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class RegisterService {

    @Autowired
    private RegisterRepo registerRepo;

    public String getFirstName(String email_id) {
        Register user1 = registerRepo.findRegisterByEmail_id(email_id);
        return user1.getFname();
    }

    public int getUserId(String email_id) {
        Register user2 = registerRepo.findRegisterByEmail_id(email_id);
        return user2.getId();
    }

}
