package day01;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ticket {
    private String band;
    private LocalDateTime dateTime;
    private int price;

    public Ticket(String band, LocalDateTime dateTime, int price) {
        this.band = band;
        this.dateTime = dateTime;
        this.price = price;
    }

    public LocalTime entryTime() {
        return dateTime.toLocalTime().minusHours(1);
    }

    public String getBand() {
        return band;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public int getPrice() {
        return price;
    }
}
