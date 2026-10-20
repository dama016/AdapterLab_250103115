package Task1;

public class PineappleDecorator extends PizzaDecorator{
    public PineappleDecorator(PlainPizza plainPizza) {
        super(plainPizza);
    }

    @Override
    public double getPrice() {
        return super.getPrice()+1.5;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Pineapple";
    }
}
