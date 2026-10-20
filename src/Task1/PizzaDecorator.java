package Task1;

public class PizzaDecorator implements Pizza{
    Pizza pizza;
    PizzaDecorator(Pizza pizza){
        this.pizza = pizza;
    }
    @Override
    public double getPrice() {
        return pizza.getPrice();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }
}
