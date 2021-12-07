package day01;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class TicketTest {
    LocalDateTime time = LocalDateTime.of(2022, 01, 1, 0, 10);
    LocalTime entryTime = LocalTime.of(23, 10);
    Ticket ticket = new Ticket("The Band", time, 10_000);

    @Test
    void createTest() {
        assertEquals("The Band", ticket.getBand());
        assertEquals(time, ticket.getDateTime());
        assertEquals(10_000, ticket.getPrice());
    }

    @Test
    void entryTime() {
        assertEquals(entryTime, ticket.entryTime());
    }
}