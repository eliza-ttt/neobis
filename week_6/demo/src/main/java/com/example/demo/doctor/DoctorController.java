package com.example.demo.doctor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/doctor")
public class DoctorController {

    @GetMapping
    public List<Doctor> getDoctor(){
        return List.of(
                new Doctor(
                        1L,
                        "Mark",
                        "surgeon",
                        LocalDate.of(1990, Month.APRIL, 23),
                        32

                )

        );
    }



}
