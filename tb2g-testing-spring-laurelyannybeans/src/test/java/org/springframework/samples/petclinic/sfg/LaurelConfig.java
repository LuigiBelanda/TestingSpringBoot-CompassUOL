/*
Este é um exemplo de classe de configuração chamada `LaurelConfig` no pacote
`org.springframework.samples.petclinic.sfg`. Vamos analisar o código passo a passo:

1. A anotação `@Configuration` indica que essa classe é uma classe de configuração do Spring.

2. Dentro da classe, há um método chamado `laurelWordProducer()`.
Esse método retorna uma instância da classe `LaurelWordProducer`.

3. A classe `LaurelWordProducer` é uma implementação da interface `WordProducer`
que produz a palavra "Laurel". Essa classe foi explicada anteriormente.

4. A ausência de modificadores de acesso no método `laurelWordProducer()` indica que
o método é definido com o nível de acesso padrão (package-private).

Resumidamente, essa classe de configuração `LaurelConfig` define um método que cria e
retorna uma instância de `LaurelWordProducer`, que é uma implementação de `WordProducer`.
Essa configuração pode ser utilizada pelo Spring para injetar a instância correta em outros
componentes que dependem de um `WordProducer`, como no exemplo anterior do `HearingInterpreter`.
*/

package org.springframework.samples.petclinic.sfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Profile("base-test")
@Configuration
public class LaurelConfig {
    LaurelWordProducer laurelWordProducer() {
        return new LaurelWordProducer();
    }
}

