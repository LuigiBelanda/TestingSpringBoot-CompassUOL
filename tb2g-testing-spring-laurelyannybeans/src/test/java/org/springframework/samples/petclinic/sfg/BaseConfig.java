/*
Este é um exemplo de classe de configuração chamada `BaseConfig` no pacote
`org.springframework.samples.petclinic.sfg`. Vamos analisar o código passo a passo:

1. A anotação `@Configuration` indica que essa classe é uma classe de configuração do Spring.

2. Dentro da classe, há um método chamado `hearingInterprter(WordProducer wordProducer)`.
Esse método é anotado com `@Bean`, o que indica que ele é responsável por criar e configurar um bean gerenciado pelo Spring.

3. O parâmetro `WordProducer wordProducer` no método `hearingInterprter` indica que esse bean depende de um objeto `WordProducer`.

4. Dentro do método, é criada uma instância de `HearingInterprter`, passando o `wordProducer` como argumento para o construtor.

5. A instância de `HearingInterprter` criada é retornada pelo método.

Resumidamente, essa classe de configuração `BaseConfig` define um método que cria
e retorna uma instância de `HearingInterprter`, que é um bean gerenciado pelo Spring.
Esse bean depende de um `WordProducer`, que será injetado pelo Spring no momento da criação
do bean. Essa configuração permite que outros componentes do Spring possam utilizar o `HearingInterprter` devidamente configurado.
*/

package org.springframework.samples.petclinic.sfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BaseConfig {
    @Bean
    HearingInterpreter hearingInterprter(WordProducer wordProducer) {
        return new HearingInterpreter(wordProducer);
    }
}
