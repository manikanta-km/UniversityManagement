package com.example.UniversityEventManagement.service;

import com.example.UniversityEventManagement.model.Event;
import com.example.UniversityEventManagement.repo.IEventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EventServices {
    @Autowired
    IEventRepo iEventRepo;
    public String addEvent(List<Event> newEvent){
        iEventRepo.saveAll(newEvent);
        return "Event Added";
    }
    public String updateEvent(Integer id, String location ){
        Event pEvent = iEventRepo.findById(id).orElse(null);
        if(pEvent != null){
            pEvent.setLocationOfEvent(location);
            iEventRepo.save(pEvent);
            return "Info Updated";
        }
        else
            return "Event Not Found";
    }
    public String deleteEvent(Integer id){
        iEventRepo.deleteById(id);
        return "Event Deleted";
    }

    public List<Event> getAllEventsByDate(LocalDate date){
        return iEventRepo.findByEventDateEquals(date);
    }
}
