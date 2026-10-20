package Task1;

public class CheeseDecorator extends PizzaDecorator{
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Cheese";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 2;
    }
}
