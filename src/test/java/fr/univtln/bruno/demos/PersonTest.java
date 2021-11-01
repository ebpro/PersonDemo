package fr.univtln.bruno.demos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {
    static final String p1Email = "a.b@x.fr";
    static final String p1Lastname = "b";
    static final String p1Firstname = "a";
    static final int p1Age = 10;

    static final String p2Email = "c.d@x.fr";
    static final String p2Lastname = "c";
    static final String p2Firstname = "d";
    static final int p2Age = 10;

    static final String p1BisEmail = "a.b@x.fr";
    static final String p1BisLastname = "b";
    static final String p1BisFirstname = "a";
    static final int p1BisAge = 11;

    public static void checkPerson(Person person) {
        Assertions.assertAll(
                () -> assertEquals(p1Email, person.getEmail()),
                () -> assertEquals(p1Firstname, person.getFirstName()),
                () -> assertEquals(p1Lastname, person.getLastName()),
                () -> assertEquals(p1Age, person.getAge()));
    }

    @Test
    void getInstance() {
        Person p1 = Person.getInstance(p1Email, p1Firstname, p1Lastname, p1Age);
        checkPerson(p1);
    }

    @Test
    void builder() {
        Person p1 = Person.builder().email(p1Email).firstName(p1Firstname).lastName(p1Lastname).age(p1Age).build();
        checkPerson(p1);
    }
}