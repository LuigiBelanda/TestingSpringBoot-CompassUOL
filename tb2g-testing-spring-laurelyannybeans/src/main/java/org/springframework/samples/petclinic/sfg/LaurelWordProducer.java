/*
Este é outro exemplo de classe chamada `LaurelWordProducer`
 que implementa a interface `WordProducer`. Assim como a classe anterior,
 esta classe também é anotada com `@Component`, indicando que é um componente gerenciado pelo Spring.

Além disso, a classe possui a anotação `@Primary`, que é usada para indicar que essa
implementação é a principal (primary) quando existem múltiplas implementações da mesma interface no contexto do Spring.

O método `getWord()` retorna a palavra "Laurel". Essa implementação também é
uma forma de fornecer uma palavra quando o método `getWord()` é chamado.

A anotação `@Primary` é útil quando há várias implementações de uma interface e o
Spring precisa decidir qual implementação usar em uma injeção de dependência.
Ao marcar uma implementação com `@Primary`, estamos dizendo ao Spring para usar essa
implementação por padrão quando for necessário injetar um objeto do tipo `WordProducer`.

Portanto, essa classe é outro componente que produz a palavra "Laurel" quando o método
`getWord()` é chamado, e é marcada como a implementação primária da interface `WordProducer`.
*/

package org.springframework.samples.petclinic.sfg;

/**
 * Created by jt on 2019-02-16.
 */
@Component
public class LaurelWordProducer implements WordProducer {
    @Override
    public String getWord() {
        return "Laurel";
    }
}
