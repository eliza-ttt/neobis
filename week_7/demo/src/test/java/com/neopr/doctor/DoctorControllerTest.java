package com.neopr.doctor;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;

class DoctorControllerTest {

    @Mock
    private DoctorService doctorService;

    private DoctorController underTest;

    @BeforeEach
    void setUp() {
        underTest = new DoctorController(DoctorService);
    }
}