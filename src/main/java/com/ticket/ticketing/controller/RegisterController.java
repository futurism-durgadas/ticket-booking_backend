package com.ticket.ticketing.controller;

import com.ticket.ticketing.entity.Register;
import com.ticket.ticketing.repository.RegisterRepo;
import com.ticket.ticketing.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping
public class RegisterController {
    @Autowired
    RegisterRepo registerRepo;

    @Autowired
    RegisterService registerService;

    @GetMapping("/getUser")
    public List<Register> getAllUser(){
        return registerRepo.findAll();
    }

    @PostMapping("/registerUser")
    public Register addUser(@RequestBody Register user) {
        return registerRepo.save(user);
    }


    @PostMapping("/getFirstName")
    public ResponseEntity<String> getFirstNameByEmail(@RequestParam(name = "email_id") String email_id) {
        String fname = registerService.getFirstName(email_id);
        return ResponseEntity.ok(fname);
    }

    @PostMapping("/getUserId")
    public ResponseEntity<Integer> getUserIdByEmail(@RequestParam(name = "email_id") String email_id) {
        int user_id = registerService.getUserId(email_id);
        return ResponseEntity.ok(user_id);
    }

}
