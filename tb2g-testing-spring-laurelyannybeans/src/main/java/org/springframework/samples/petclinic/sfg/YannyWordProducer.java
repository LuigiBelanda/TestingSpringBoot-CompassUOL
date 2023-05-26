/*
Este é um exemplo de classe chamada `YannyWordProducer` que implementa a interface `WordProducer`.
A classe é anotada com `@Component`, indicando que é um componente gerenciado pelo Spring.

A classe `YannyWordProducer` tem um método `getWord()` que retorna a palavra "Yanny".
Esse método é uma implementação do método definido na interface `WordProducer`, que provavelmente possui a assinatura `String getWord()`.

A anotação `@Component` indica ao Spring que essa classe deve ser gerenciada como
um componente e pode ser injetada em outras classes. Isso significa que outras partes da
aplicação podem usar a instância de `YannyWordProducer` por meio da injeção de dependência.

Portanto, essa classe é um componente que produz a palavra "Yanny" quando o método `getWord()` é chamado.
*/

package org.springframework.samples.petclinic.sfg;

import org.springframework.stereotype.Component;

/**
 * Created by jt on 2019-02-16.
 */
@Component
public class YannyWordProducer implements WordProducer {
    @Override
    public String getWord() {
        return "Yanny";
    }
}
