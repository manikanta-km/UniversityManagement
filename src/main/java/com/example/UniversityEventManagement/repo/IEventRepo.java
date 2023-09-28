package com.example.UniversityEventManagement.repo;

import com.example.UniversityEventManagement.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IEventRepo extends CrudRepository<Event,Integer> {
     List<Event> findByEventDateEquals(LocalDate date);
}
