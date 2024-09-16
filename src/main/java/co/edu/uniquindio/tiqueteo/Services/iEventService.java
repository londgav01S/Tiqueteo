package co.edu.uniquindio.tiqueteo.Services;

import co.edu.uniquindio.tiqueteo.Dto.EventDto;
import co.edu.uniquindio.tiqueteo.Model.Event;

public interface iEventService {
    public Event createEvent(EventDto event);
    public Event updateEvent(EventDto event);
    public Event deleteEvent(EventDto event);
    public Event getEventById(int id);

}
