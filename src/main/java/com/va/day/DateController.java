package com.va.day;

import com.va.day.DateService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/date")
public class DateController {

    private final DateService dateService;

    public DateController(DateService dateService) {
        this.dateService = dateService;
    }

    @GetMapping("/day")
    public String getDay(@RequestParam String date) {
        LocalDate localDate = LocalDate.parse(date);
        return dateService.getDayOfWeek(localDate);
    }
    @PostMapping("/day")
    public Map<String, String> getDayOfWeek(@RequestParam String date) {
        LocalDate localDate = LocalDate.parse(date);
        String dayOfWeek = dateService.getDayOfWeek(localDate);

        Map<String, String> response = new HashMap<>();
        response.put("date", date);
        response.put("dayOfWeek", dayOfWeek);

        return response;
    }

}
