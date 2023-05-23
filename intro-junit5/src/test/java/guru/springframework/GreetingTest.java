package guru.springframework;

import org.junit.jupiter.api.*;

class GreetingTest {
    private Greeting greeting;

    // Todos com esta annotation vão rodar antes de tudo, é o primeiro método a ser executado
    @BeforeAll
    public static void beforeClass() {
        System.out.println("Before - I am only called Onde!!!");
    }

    // Todos com esta annotation vão rodar antes de CADA UM dos testes, se tivermos 2 testes
    // Este método setUp irá ser executado antes de cada um, ou seja, 2x
    @BeforeEach
    void setUp() {
        System.out.println("In Before Each...");
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());

    }

    @Test
    void testHelloWorld() {
        System.out.println(greeting.helloWorld("John"));
    }

    // Todos com esta annotation vão rodar DEPOIS de CADA UM dos testes, se tivermos 2 testes
    // Este método setUp irá ser executado DEPOIS de cada um, ou seja, 2x
    @AfterEach
    void tearDown() {
        System.out.println("In After Each...");
    }

    // Todos com esta annotation vão depois de tudo, é o primeiro método a ser executado
    @AfterAll
    public static void afterClass() {
        System.out.println("After - I am only called Onde!!!");
    }
}