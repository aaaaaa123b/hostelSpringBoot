package com.example.hostelspring.repository;

import com.example.hostelspring.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AcceptApplicationRepository extends JpaRepository<Reservation, Long> {
}
