package day01;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class FrontOfStageTicketTest {
    LocalDateTime time = LocalDateTime.of(2022, 01, 1, 0, 10);
    LocalTime entryTime = LocalTime.of(22, 10);
    FrontOfStageTicket ticket = new FrontOfStageTicket("The Band", time, 10_000, "XYZ");

    @Test
    void createTest() {
        assertEquals("XYZ", ticket.getExtraCode());
    }

    @Test
    void entryTime() {
        assertEquals(entryTime, ticket.entryTime());
    }
}