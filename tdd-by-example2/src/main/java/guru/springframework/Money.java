package guru.springframework;

// Super class - Classe Pai
/*
*   Em Java, temos um tipo especial de classe chamado classe abstrata. Este tipo
*   de classe possui uma característica muito específica, que é o de não
*   permitir que novos objetos sejam instanciados a partir desta classe. Por este motivo,
*   as classes abstratas possuem o único propósito de servirem
*   como super classes a outras classes do Java.
*/
public class Money implements Expression {
    // Aqui abaixo estão os atributos que as classes que herdarem desta devem ter
    protected int amount;
    protected String currency;

    // Constructor da nossa classe pai
    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    // Aqui encontramos os métodos que as classes que herdarem desta deverão ter ou poderão usar
    // Este primeiro é para mostrar o tipo da moeda
    protected String currency() {
        return currency;
    };

    public static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    public static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount && this.currency == money.currency;
    }

    @Override
    public Money reduce(Bank bank, String to) {
        // int rate = (currency.equals("CHF") && to.equals("USD") ? 2 : 1);

        return new Money(amount / bank.rate(this.currency, to), to);
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }

    @Override
    public Expression times(int multiplier) {
        return new Money(amount * multiplier, this.currency);
    }

    @Override
    public Expression plus(Expression addend) {
        return new Sum(this, addend);
    }
}
