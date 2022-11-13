package com.bank.addisbank.service.UserServiceImp;


import com.bank.addisbank.dao.AppointmentDao;
import com.bank.addisbank.domain.Appointment;
import com.bank.addisbank.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentServiceImpl implements AppointmentService {

  @Autowired
  private AppointmentDao appointmentDao;

  public Appointment createAppointment(Appointment appointment) {
    return appointmentDao.save(appointment);
  }

  public List<Appointment> findAll() {
    return appointmentDao.findAll();
  }

  public Appointment findAppointment(Long id) {
    return null;
  }

  public void confirmAppointment(Long id) {
    Appointment appointment = findAppointment(id);
    appointment.setConfirmed(true);
    appointmentDao.save(appointment);
  }
}
