package day01;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Concert {
    private List<Person> persons = new ArrayList<>();

    public void addPerson(Person person, LocalTime entryTime) {
        if (person.getTicket() != null && entryTime.isAfter(person.getTicket().entryTime())) {
            persons.add(person);
        } else {
            throw new IllegalArgumentException(
                    person.getTicket() == null ? "It's not possible without ticket!" : "It's too early!");
        }
    }

    public List<Person> getPersons() {
        return persons;
    }
}
