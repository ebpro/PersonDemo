package fr.univtln.bruno.samples.persons;

import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor(staticName = "getInstance")
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public class Person implements Comparable<Person> {
    @Getter
    @EqualsAndHashCode.Include
    final String email;
    @Getter
    @Setter
    String firstName;
    @Getter
    @Setter
    String lastName;
    @Getter
    @Setter
    int age;

    @Override
    public int compareTo(Person o) {
        return email.compareTo(o.email);
    }
}
