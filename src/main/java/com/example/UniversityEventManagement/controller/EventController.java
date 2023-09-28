package com.example.UniversityEventManagement.controller;

import com.example.UniversityEventManagement.model.Event;
import com.example.UniversityEventManagement.service.EventServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
@RestController
public class EventController {
    @Autowired
    EventServices eventServices;
    @PostMapping("event")
    public String addEvent(@RequestBody List<Event> newEvent){
        return eventServices.addEvent(newEvent);
    }

    @PutMapping("event/id{id}/event/{location}")
    public String updateEvent(@PathVariable Integer id, @PathVariable String location ){
        return eventServices.updateEvent(id, location);
    }
    @DeleteMapping("event/id/{id}")
    public String deleteEvent(@PathVariable Integer id){
        return eventServices.deleteEvent(id);
    }

    @GetMapping("event/date/{date}")
    public List<Event> getAllEventsByDate(@PathVariable LocalDate date){
        return eventServices.getAllEventsByDate(date);
    }
}
