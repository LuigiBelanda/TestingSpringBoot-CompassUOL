/*
A anotação `@ActiveProfiles` é usada em testes para ativar perfis específicos do Spring durante a execução do teste.
Vamos analisar o código de exemplo para entender melhor:

1. A importação `org.springframework.test.context.ActiveProfiles` é uma importação necessária para usar a anotação `@ActiveProfiles`.

2. A classe `HearingInterpretureActiveProfileTest` está anotada com `@ActiveProfiles("yanny")`. Isso significa que o
perfil "yanny" será ativado durante a execução deste teste.

3. A anotação `@SpringJUnitConfig(classes = HearingInterpretureActiveProfileTest.TestConfig.class)` é usada
para configurar o ambiente de teste com o Spring. A classe de configuração interna `TestConfig` é especificada
na configuração, indicando que essa classe será usada para carregar o contexto do Spring.

4. Dentro da classe `HearingInterpretureActiveProfileTest`, há uma classe interna estática chamada `TestConfig`.
Essa classe é anotada com `@Configuration`, indicando que é uma classe de configuração do Spring.

5. A anotação `@ComponentScan("org.springframework.samples.petclinic.sfg")` em `TestConfig` instrui o Spring a
escanear o pacote `org.springframework.samples.petclinic.sfg` em busca de componentes para configuração.

6. O campo `hearingInterpreter` é anotado com `@Autowired`, o que permite que o Spring injete uma instância de
`HearingInterpreter` no momento da execução do teste.

7. O método `whatIheard()` é anotado com `@Test`, indicando que é um método de teste.

8. Dentro do método de teste, a variável `word` recebe o resultado do método `whatIheard()` chamado na instância de `HearingInterpreter`.

9. A chamada `assertEquals("Yanny", word)` verifica se a palavra retornada é igual a "Yanny". Se não for igual, o teste falhará.

Em resumo, neste teste, o perfil "yanny" é ativado através da anotação `@ActiveProfiles`. Isso significa que o
contexto do Spring será configurado de acordo com as definições associadas a esse perfil. O teste verifica
se o `HearingInterpreter` retorna a palavra esperada "Yanny" ao chamar o método `whatIheard()`, levando em
consideração a configuração específica do perfil "yanny".
*/

package org.springframework.samples.petclinic.sfg.junit5;

import org.junit.jupiter.api.Test;
import org.springframework.samples.petclinic.sfg.HearingInterpreter;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ActiveProfiles("yanny")
@SpringJUnitConfig(classes = HearingInterpretureActiveProfileTest.TestConfig.class)
public class HearingInterpretureActiveProfileTest {
    @Configuration
    @ComponentScan("org.springframework.samples.petclinic.sfg")
    static class TestConfig {

    }

    @Autowired
    HearingInterpreter hearingInterpreter

    @Test
    void whatIheard() {
        String word = hearingInterpreter.whatIheard();

        assertEquals("Yanny", word);
    }
}
