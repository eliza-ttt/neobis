package com.neopr.doctor;

import com.neopr.client.Actor;

import java.time.LocalDate;
import java.util.List;

public record Doctor(Integer id,
                     String name,
                     List<Actor> actors,
                     LocalDate releaseDate) {
}
