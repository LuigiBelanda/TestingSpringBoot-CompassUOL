package guru.springframework;

// Super class - Classe Pai
/*
*   Em Java, temos um tipo especial de classe chamado classe abstrata. Este tipo
*   de classe possui uma característica muito específica, que é o de não
*   permitir que novos objetos sejam instanciados a partir desta classe. Por este motivo,
*   as classes abstratas possuem o único propósito de servirem
*   como super classes a outras classes do Java.
*/
public abstract class Money {
    protected int amount;

    public abstract Money times(int multiplier);

    public static Money dollar(int amount) {
        return new Dollar(amount);
    }

    public static Money franc(int amount) {
        return new Franc(amount);
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount && this.getClass().equals(object.getClass());
    }
}
