package guru.springframework;

// Herdam os atributos / métodos da classe pai = Money
public class Dollar extends Money {
    // Propriedade que diz qual o tipo da moeda
    private String currency;

    // Aqui que chamamo nossos constructor pegamos o amount que o usuário passou
    // E colocamos no nosso objeto e definimos qual o tipo de nossa moeda
    // No caso ainda usamos o super() para passar os valores dos atribustos do nosso objeto
    // Para nossa classe pai
    public Dollar(int amount, String currency) {
        super(amount, currency);
    }

    public Money times(int multiplier) {
        return Money.dollar(amount * multiplier);
    }
}
