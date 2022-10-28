package com.neopr.doctor;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/doctor")
public class DoctorController {

    private final DoctorService doctorService;

    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @GetMapping
    public List<Doctor> listDoctors() {
        return doctorService.getDoctors();
    }

    @GetMapping("{id}")
    public Doctor getDoctorId(@PathVariable("id") Integer id) {
        return doctorService.getDoctor(id);
    }

    @PostMapping
    public void addDoctor(@RequestBody Doctor doctor) {
        doctorService.addNewDoctor(doctor);
    }

    @DeleteMapping("{id}")
    public void deleteDoctor(@PathVariable("id") Integer id) {
        doctorService.deleteDoctor(id);
    }

}
