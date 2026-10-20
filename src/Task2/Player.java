package Task2;

public class Player {
    Movement movementMethod;
    Player(Movement movementMethod){
        this.movementMethod = movementMethod;
    }

    public void setMovementMethod(Movement movementMethod) {
        this.movementMethod = movementMethod;
    }

    public void move(){
        System.out.println("Moving with " + movementMethod.getSpeed() + " km/h");
    }
}
