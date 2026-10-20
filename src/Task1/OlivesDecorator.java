package Task1;

public class OlivesDecorator extends PizzaDecorator{
    public OlivesDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getPrice() {
        return super.getPrice()+1;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" + Olives";
    }
}
