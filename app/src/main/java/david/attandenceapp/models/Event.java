package david.attandenceapp.models;

/**
 * Created by davide on 27/07/2015.
 */
public class Event {

    private String name;
    private String venue;
    private String city;
    private String organizerName;
    private Long eventDate;
    private String eventPicturePath;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getOrganizerName() {
        return organizerName;
    }

    public void setOrganizerName(String organizerName) {
        this.organizerName = organizerName;
    }

    public Long getEventDate() {
        return eventDate;
    }

    public void setEventDate(Long eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventPicturePath() {
        return eventPicturePath;
    }

    public void setEventPicturePath(String eventPicturePath) {
        this.eventPicturePath = eventPicturePath;
    }
}
