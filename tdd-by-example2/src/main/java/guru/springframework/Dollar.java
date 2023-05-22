package guru.springframework;

// Herdam os atributos / métodos da classe pai = Money
public class Dollar extends Money {
    public Dollar(int amount) {
        this.amount = amount;
    }
    
    public Money times(int multiplier) {
        return new Dollar (amount * multiplier);
    }
}
