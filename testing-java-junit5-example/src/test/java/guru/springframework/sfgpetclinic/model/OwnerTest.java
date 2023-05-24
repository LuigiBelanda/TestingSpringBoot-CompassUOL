package guru.springframework.sfgpetclinic.model;

import guru.springframework.sfgpetclinic.ModelTests;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.*;

class OwnerTest implements ModelTests {

    @Test
    void dependentAssertions() {
        Owner owner = new Owner(1l, "Joe", "Buck");
        owner.setCity("Key West");
        owner.setTelephone("123456789");

        // Neste caso estamos colocando um teste
        // Properties teste e dentro dele temos mais 2 grupos de teste
        // Que vão testar as props do nosso Owner
        assertAll("Properties test",
                () -> assertAll("Person properties",
                    () -> assertEquals("Joe", owner.getFirstName(), "First Name Did Not Match"),
                    () -> assertEquals("Buck", owner.getLastName())),
                () -> assertAll("Owner properties",
                    () -> assertEquals("Key West", owner.getCity(), "City Did Not Match"),
                    () -> assertEquals("123456789", owner.getTelephone())
                ));

        assertThat(owner.getCity(), is("Key West"));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Spring", "Framework", "Guru"})
    void testValueSource(String val) {
        System.out.println(val);
    }
}