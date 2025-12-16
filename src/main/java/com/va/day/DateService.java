package com.va.day;

import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class DateService {

    public String getDayOfWeek(LocalDate date) {
        return date.getDayOfWeek().toString();
    }
}
