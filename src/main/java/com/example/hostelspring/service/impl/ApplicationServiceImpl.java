package com.example.hostelspring.service.impl;

import com.example.hostelspring.model.Reservation;
import com.example.hostelspring.repository.ApplicationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ApplicationServiceImpl {
    private final ApplicationRepository applicationRepository;

    public List<Reservation> findAll() {
        return applicationRepository.findAll();
    }

    public Reservation addReservation(int userId, int hostelId, String reservationType, int roomNumber, String hostelName, String type) {

        Reservation reservation = new Reservation();

        reservation.setRoom_number(roomNumber);
        reservation.setType(type);
        reservation.setHostel_id(hostelId);
        reservation.setUser_id(userId);
        reservation.setHostel_name(hostelName);
        reservation.setApplication_type(reservationType);

        return applicationRepository.save(reservation);
    }

    public void deleteById(long reservationId) {
        applicationRepository.deleteById(reservationId);
    }

    public Reservation findById(int reservationId) {
        return applicationRepository.findById(Long.valueOf(reservationId)).get();
    }
}
