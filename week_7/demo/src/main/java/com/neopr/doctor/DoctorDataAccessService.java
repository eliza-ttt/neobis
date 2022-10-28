package com.neopr.doctor;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class DoctorDataAccessService implements DoctorDao {

    private final JdbcTemplate jdbcTemplate;

    public DoctorDataAccessService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Doctor> selectDoctor() {
        var sql = """
                SELECT id, name, position
                FROM doctor
                LIMIT 2;
                 """;
        return jdbcTemplate.query(sql, new DoctorRowMapper());
    }

    @Override
    public int insertDoctor(Doctor doctor) {
        var sql = """
                INSERT INTO doctor(name, position)
                VALUES (?, ?);
                 """;
        return jdbcTemplate.update(
                sql,
                doctor.name(), doctor.position()
        );
    }

    @Override
    public int deleteDoctor(int id) {
        var sql = """
                DELETE FROM doctor   
                WHERE id = ?
                """;
        return jdbcTemplate.update(sql, id);
    }

    @Override
    public Optional<Doctor> selectDoctorById(int id) {
        var sql = """
                SELECT id, name, position
                FROM doctor
                WHERE id = ?
                 """;
        return jdbcTemplate.query(sql, new DoctorRowMapper(), id)
                .stream()
                .findFirst();
    }

}
