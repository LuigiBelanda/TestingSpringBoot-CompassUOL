package guru.springframework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GreetingTest {
    private Greeting greeting;

    // Todos com esta annotation vão rodar antes de CADA UM dos testes, se tivermos 2 testes
    // Este método setUp irá ser executado antes de cada um, ou seja, 2x
    @BeforeEach
    void setUp() {
        System.out.println("In Before Each...");
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        greeting = new Greeting();
        System.out.println(greeting.helloWorld());

    }

    @Test
    void testHelloWorld() {
        greeting = new Greeting();
        System.out.println(greeting.helloWorld("John"));
    }
}