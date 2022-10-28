package com.neopr.doctor;

import java.util.List;
import java.util.Optional;

public interface DoctorDao {
    List<Doctor> selectDoctor();
    int insertDoctor(Doctor doctor);
    int deleteDoctor(int id);
    Optional<Doctor> selectDoctorById(int id);

}
