/*
Este é um exemplo de classe de teste chamada `HearingInterpreterInnerClassTest` no pacote
`org.springframework.samples.petclinic.sfg.junit5`. Vamos analisar o código passo a passo:

1. As importações `org.junit.jupiter.api.Test` e `org.springframework.test.context.junit.jupiter.SpringJUnitConfig`
são importações necessárias para usar as anotações e classes de teste do JUnit 5 e do Spring.

2. A anotação `@SpringJUnitConfig(classes = HearingInterpreterInnerClassTest.TestConfig.class)` é usada para configurar
o ambiente de teste com o Spring. A classe de configuração interna `TestConfig` é especificada na configuração,
indicando que essa classe será usada para carregar o contexto do Spring.

3. A classe `HearingInterpreterInnerClassTest` está marcada com a anotação `@Test`, indicando que é uma classe de teste.

4. Dentro da classe `HearingInterpreterInnerClassTest`, há uma classe interna estática chamada `TestConfig`.
Essa classe é anotada com `@Configuration`, indicando que é uma classe de configuração do Spring.

5. Dentro da classe `TestConfig`, há um método chamado `hearingInterpreter()`, anotado com `@Bean`.
Esse método cria e retorna uma instância de `HearingInterpreter`, passando um `LaurelWordProducer` no construtor.

6. O campo `hearingInterpreter` é anotado com `@Autowired`, o que permite que o Spring injete uma instância de
`HearingInterpreter` no momento da execução do teste.

7. O método `whatIheard()` é anotado com `@Test`, indicando que é um método de teste.

8. Dentro do método de teste, a variável `word` recebe o resultado do método `whatIheard()` chamado na instância de `HearingInterpreter`.

9. A chamada `assertEquals("Laurel", word)` verifica se a palavra retornada é igual a "Laurel". Se não for igual, o teste falhará.

Em resumo, este teste utiliza uma classe interna estática `TestConfig` para configurar o ambiente de
teste com o Spring. Essa classe cria e configura um bean de `HearingInterpreter` com um `LaurelWordProducer`.
Em seguida, o teste verifica se o `HearingInterpreter` retorna a palavra esperada "Laurel" ao chamar o método `whatIheard()`.
*/

package org.springframework.samples.petclinic.sfg.junit5;

import org.junit.jupiter.api.Test;
import org.springframework.samples.petclinic.sfg.*;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles("inner-class")
@SpringJUnitConfig(classes = HearingInterpreterInnerClassTest.TestConfig.class)
class HearingInterpreterInnerClassTest {
    @Profile("inner-class")
    @Configuration
    static class TestConfig {
        @Bean
        HearingInterpreter hearingInterpreter() {
            return new HearingInterpreter(new LaurelWordProducer());
        }
    }

    @Autowired
    HearingInterpreter hearingInterpreter;

    @Test
    void whatIheard() {
        String word = hearingInterpreter.whatIheard();

        assertEquals("Laurel", word);
    }
}