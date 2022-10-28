package com.neopr.doctor;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DoctorRowMapper implements RowMapper<Doctor> {
    @Override
    public Doctor mapRow(ResultSet resultSet, int i) throws SQLException {
        return new Doctor(
                resultSet.getInt("id"),
                resultSet.getString("name"),
                resultSet.getString("position")
        );
    }
}
