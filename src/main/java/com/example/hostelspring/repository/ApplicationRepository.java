package com.example.hostelspring.repository;


import com.example.hostelspring.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationRepository extends JpaRepository<Reservation, Long> {

}
