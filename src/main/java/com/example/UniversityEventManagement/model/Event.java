package com.example.UniversityEventManagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Event {
    @Id
    private Integer eventId;
    private String eventName;
    private String locationOfEvent;
    private LocalDate eventDate;
    private LocalTime startTime;
    private LocalTime endTime;
}
