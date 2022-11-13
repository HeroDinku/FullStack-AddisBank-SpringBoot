package com.bank.addisbank.dao;

import com.bank.addisbank.domain.Appointment;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AppointmentDao extends CrudRepository<Appointment, Long> {

  List<Appointment> findAll();
}
