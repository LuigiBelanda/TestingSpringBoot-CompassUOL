package guru.springframework;

// Herdam os atributos / métodos da classe pai = Money
public class Franc extends Money {
    // Propriedade que diz qual o tipo da moeda
    private String currency;

    // Aqui que chamamo nossos constructor pegamos o amount que o usuário passou
    // E colocamos no nosso objeto e definimos qual o tipo de nossa moeda
    // No caso ainda usamos o super() para passar os valores dos atribustos do nosso objeto
    // Para nossa classe pai
    public Franc(int amount, String currency) {
        super(amount, currency);
    }
}
