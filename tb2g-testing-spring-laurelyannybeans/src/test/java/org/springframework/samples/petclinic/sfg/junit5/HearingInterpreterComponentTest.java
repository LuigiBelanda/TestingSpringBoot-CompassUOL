/*
Este é um exemplo de classe de teste chamada `HearingInterpreterComponentTest` no pacote
`org.springframework.samples.petclinic.sfg.junit5`. Vamos analisar o código passo a passo:

1. A importação `org.junit.jupiter.api.Test` é uma importação necessária para usar a anotação `@Test` do JUnit 5.

2. A classe `HearingInterpreterComponentTest` está marcada com a anotação `@Test`, indicando que é uma classe de teste.

3. Dentro da classe `HearingInterpreterComponentTest`, há uma classe interna estática chamada `TestConfig`.
Essa classe é anotada com `@Configuration`, indicando que é uma classe de configuração do Spring.

4. A anotação `@ComponentScan("org.springframework.samples.petclinic.sfg")` em `TestConfig` instrui o Spring a escanear
o pacote `org.springframework.samples.petclinic.sfg` em busca de componentes para configuração.

5. O campo `hearingInterpreter` é anotado com `@Autowired`, o que permite que o Spring injete uma instância de
`HearingInterpreter` no momento da execução do teste.

6. O método `whatIheard()` é anotado com `@Test`, indicando que é um método de teste.

7. Dentro do método de teste, a variável `word` recebe o resultado do método `whatIheard()` chamado na instância de `HearingInterpreter`.

8. A chamada `assertEquals("Laurel", word)` verifica se a palavra retornada é igual a "Laurel". Se não for igual, o teste falhará.

Em resumo, este teste utiliza uma classe interna estática `TestConfig` para configurar o ambiente de teste com o
Spring. Essa classe realiza a varredura de componentes no pacote `org.springframework.samples.petclinic.sfg`.
O teste verifica se o `HearingInterpreter` retorna a palavra esperada "Laurel" ao chamar o método `whatIheard()`.
*/

package org.springframework.samples.petclinic.sfg.junit5;

import org.junit.jupiter.api.Test;
import org.springframework.samples.petclinic.sfg.HearingInterpreter;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles("component-scan")
@SpringJUnitConfig(classes = HearingInterpreterComponentTest.TestConfig.class)
class HearingInterpreterComponentTest {

    @Profile("component-scan")
    @Configuration
    @ComponentScan("org.springframework.samples.petclinic.sfg")
    static class TestConfig {

    }

    @Autowired
    HearingInterpreter hearingInterpreter

    @Test
    void whatIheard() {
        String word = hearingInterpreter.whatIheard();

        assertEquals("Laurel", word);
    }
}