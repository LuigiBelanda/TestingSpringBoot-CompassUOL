package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


// por padrão os arquivos e classes de teste são ClasseTest
// Nome da Classe + "Test"
class FooTest {

    // Este annotation diz que este método é de teste
    @Test
    void getBar() {
        Foo foo = new Foo();

        String result = foo.getBar();

        assertEquals("Foo Bar", result);
    }
}