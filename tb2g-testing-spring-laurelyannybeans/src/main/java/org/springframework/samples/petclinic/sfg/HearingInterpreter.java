/*
Esta é uma classe chamada `HearingInterpreter`, anotada com `@Service`, o que
indica que é um componente de serviço gerenciado pelo Spring.

A classe possui um construtor que recebe um objeto `WordProducer` como argumento.
Isso significa que `HearingInterpreter` depende de um `WordProducer` para realizar sua funcionalidade.

Dentro do método `whatIheard()`, a classe chama o método `getWord()` do `wordProducer`
para obter uma palavra. Em seguida, imprime a palavra no console e a retorna.

Essa classe pode ser interpretada como um "intérprete de audição" que recebe um `WordProducer`
e retorna a palavra obtida por meio desse objeto. O objetivo dessa classe é encapsular a lógica de
interpretar a palavra recebida e executar ações relacionadas a ela.

A anotação `@Service` é usada para indicar que essa classe é um componente de serviço do Spring e
pode ser injetada em outras partes da aplicação. Portanto, o `HearingInterpreter` é um componente de
serviço que depende de um `WordProducer` para realizar sua tarefa de interpretação de palavras.
*/

package org.springframework.samples.petclinic.sfg;

import org.springframework.stereotype.Service;

/**
 * Created by jt on 2019-02-16.
 */
@Service
public class HearingInterpreter {

    private final WordProducer wordProducer;

    public HearingInterpreter(WordProducer wordProducer) {
        this.wordProducer = wordProducer;
    }

    public String whatIheard(){
        String word = wordProducer.getWord();

        System.out.println(word);

        return word;
    }
}
