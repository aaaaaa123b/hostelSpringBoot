package com.example.hostelspring.service.impl;

import com.example.hostelspring.model.Reservation;
import com.example.hostelspring.repository.AcceptApplicationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AcceptApplicationServiceImpl {

    AcceptApplicationRepository acceptApplicationRepository;

    public List<Reservation> findAll() {
        return acceptApplicationRepository.findAll();
    }

    public void addReservation(String type, int roomNumber, int userId, int hostelId, String hostelName, String applicationType) {
        Reservation reservation = new Reservation();

        reservation.setRoom_number(roomNumber);
        reservation.setType(type);
        reservation.setHostel_id(hostelId);
        reservation.setUser_id(userId);
        reservation.setHostel_name(hostelName);
        reservation.setApplication_type(applicationType);

        acceptApplicationRepository.save(reservation);
    }

}
