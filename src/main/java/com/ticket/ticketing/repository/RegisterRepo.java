package com.ticket.ticketing.repository;

import com.ticket.ticketing.entity.Register;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisterRepo extends JpaRepository<Register, Integer> {

    @Query(value = "select * from public.register where email_id=?1", nativeQuery = true)
    Register findRegisterByEmail_id(String email_id);

}
