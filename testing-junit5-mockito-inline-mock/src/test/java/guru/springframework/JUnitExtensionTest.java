package guru.springframework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Map;

@ExtendWith(MockitoExtension.class)
public class JUnitExtensionTest {

    // Criando um mock
    @Mock
    Map<String, Object> mapMock;

    // Testando o mock
    @Test
    void testMock() {
        mapMock.put("Keyvalue", "foo");
    }
}
