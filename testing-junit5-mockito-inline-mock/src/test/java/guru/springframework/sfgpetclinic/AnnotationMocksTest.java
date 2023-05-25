package guru.springframework.sfgpetclinic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Map;

public class AnnotationMocksTest {
    // Criando um mock
    @Mock
    Map<String, Object> mapMock;

    // Iniciando os mocks desta classe antes de cada teste
    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    // Testando o mock
    @Test
    void testMock() {
        mapMock.put("Keyvalue", "foo");
    }
}
