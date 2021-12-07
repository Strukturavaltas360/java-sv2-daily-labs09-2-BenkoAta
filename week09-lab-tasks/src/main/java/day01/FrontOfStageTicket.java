package day01;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class FrontOfStageTicket extends Ticket {
    private String extraCode;

    public FrontOfStageTicket(String band, LocalDateTime dateTime, int price, String extraCode) {
        super(band, dateTime, price);
        this.extraCode = extraCode;
    }

    @Override
    public LocalTime entryTime() {
        return getDateTime().toLocalTime().minusHours(2);
    }

    public String getExtraCode() {
        return extraCode;
    }
}
