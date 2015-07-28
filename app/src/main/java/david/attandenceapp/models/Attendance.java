package david.attandenceapp.models;

/**
 * Created by davide on 27/07/2015.
 */
public class Attendance {

    private Long checkInTime;
    private Long checkOutTime;
    private Event currEvent;
    private Attendant currAttendant;

    public Long getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(Long checkInTime) {
        this.checkInTime = checkInTime;
    }

    public Long getCheckOutTime() {
        return checkOutTime;
    }

    public void setCheckOutTime(Long checkOutTime) {
        this.checkOutTime = checkOutTime;
    }

    public Event getCurrEvent() {
        return currEvent;
    }

    public void setCurrEvent(Event currEvent) {
        this.currEvent = currEvent;
    }

    public Attendant getCurrAttendant() {
        return currAttendant;
    }

    public void setCurrAttendant(Attendant currAttendant) {
        this.currAttendant = currAttendant;
    }
}
