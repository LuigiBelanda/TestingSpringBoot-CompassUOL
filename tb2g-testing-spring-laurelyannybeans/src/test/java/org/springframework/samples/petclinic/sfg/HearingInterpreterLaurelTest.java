/*
Este é um exemplo de classe de teste chamada HearingInterpreterTest que testa a classe
HearingInterpreter do pacote org.springframework.samples.petclinic.sfg. Vamos analisar o código passo a passo:

As importações import org.junit.jupiter.api.*, import org.junit.runner.RunWith; e
import org.springframework.test.context.* são importações necessárias para usar as anotações e classes de teste do JUnit e do Spring.

A anotação @RunWith(SpringRunner.class) indica que o teste será executado com o runner SpringRunner,
que é fornecido pelo Spring Framework para executar testes com suporte de contexto.

A anotação @ContextConfiguration(classes = {BaseConfig.class, LaurelConfig.class}) é usada para
especificar as classes de configuração do Spring que serão carregadas para o contexto do teste.
Neste caso, são especificadas as classes BaseConfig e LaurelConfig.

A classe HearingInterpreterTest está marcada com a anotação @Test, indicando que é uma classe de teste.

O campo hearingInterprter é anotado com @Autowired, o que permite que o Spring injete uma
instância de HearingInterpreter no momento da execução do teste.

O método whatIHeard() é anotado com @Test, indicando que é um método de teste.

Dentro do método de teste, a variável word recebe o resultado do método whatIheard() chamado na instância de HearingInterpreter.

A chamada assertEquals("Laurel", word) verifica se a palavra retornada é igual a "Laurel". Se não for igual, o teste falhará.

Em resumo, este teste verifica se o HearingInterpreter retorna a palavra esperada
"Laurel" ao chamar o método whatIheard(). Ele utiliza a configuração do Spring para
carregar o contexto e permitir a injeção de dependências necessária para executar o teste com sucesso.
*/

package org.springframework.samples.petclinic.sfg;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles("base-test")
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {BaseConfig.class, LaurelConfig.class})
class HearingInterpreterLaurelTest {
    @Autowired
    HearingInterpreter hearingInterpreter;

    @Test
    public void whatIHeard() {
        String word = hearingInterpreter.whatIheard();
        assertEquals("Laurel", word);
    }
}