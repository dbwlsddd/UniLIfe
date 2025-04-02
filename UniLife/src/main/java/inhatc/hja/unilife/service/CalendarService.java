// 일정 관리 서비스

package inhatc.hja.unilife.service;

import inhatc.hja.unilife.model.Event;
import inhatc.hja.unilife.repository.EventRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalendarService {

    private final EventRepository eventRepository;

    public CalendarService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public void addEvent(Event event) {
        eventRepository.save(event);
    }

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }
}
