package Task1;

public class Main {

    public static void main(String[] args) {
        Pizza pizza = new CheeseDecorator(new OlivesDecorator(new PineappleDecorator(new PlainPizza())));
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getPrice() + "$");
    }

}
