package com.neopr.doctor;

import com.neopr.exception.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorService {

    private final DoctorDao doctorDao;

    public DoctorService(DoctorDao doctorDao) {
        this.doctorDao = doctorDao;
    }

    public List<Doctor> getDoctor() {
        return doctorDao.selectDoctor();
    }

    public void addNewDoctor(Doctor doctor) {

        int result = doctorDao.insertDoctor(doctor);
        if (result != 1) {
            throw new IllegalStateException("something wrong");
        }
    }

    public void deleteDoctor(Integer id) {
        Optional<Doctor> dostors = doctorDao.selectDoctorById(id);
        dostors.ifPresentOrElse(doctor -> {
            int result = doctorDao.deleteDoctor(id);
            if (result != 1) {
                throw new IllegalStateException("could not delete doctor");
            }
        }, () -> {
            throw new NotFoundException(String.format("Doctor with id %s not found", id));
        });
    }

    public Doctor getDoctor(int id) {
        return doctorDao.selectDoctorById(id)
                .orElseThrow(() -> new NotFoundException(String.format("Doctor with id %s not found", id)));
    }
}
