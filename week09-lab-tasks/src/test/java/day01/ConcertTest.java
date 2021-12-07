package day01;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class ConcertTest {
    LocalDateTime time = LocalDateTime.of(2022, 01, 1, 20, 00);
    LocalTime entryTime = LocalTime.of(19, 30);
    Ticket ticket = new Ticket("The Band", time, 10_000);
    LocalTime vipEntryTime = LocalTime.of(18, 30);
    FrontOfStageTicket vipTicket = new FrontOfStageTicket("The Band", time, 10_000, "XYZ");
    Concert concert = new Concert();

    @Test
    void testAddPersonWithTicket() {
        concert.addPerson(new Person(ticket), entryTime);
        assertEquals(1, concert.getPersons().size());
        assertThrows(IllegalArgumentException.class, ()-> concert.addPerson(new Person(ticket), entryTime.minusHours(1)));
    }

    @Test
    void testAddPersonWithFrontOfStageTicket() {
        concert.addPerson(new Person(vipTicket), vipEntryTime);
        assertEquals(1, concert.getPersons().size());
        assertThrows(IllegalArgumentException.class, ()-> concert.addPerson(new Person(ticket), vipEntryTime.minusHours(1)));
    }

}