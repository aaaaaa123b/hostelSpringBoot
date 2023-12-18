package com.example.hostelspring.repository;


import com.example.hostelspring.model.Hostel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HostelRepository extends JpaRepository<Hostel, Long> {

    Hostel findByName(String name);
}
