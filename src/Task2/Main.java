package Task2;

public class Main {
    public static void main(String[] args) {
        Player player = new Player(new Walk());
        player.move();
        player.setMovementMethod(new Jetpack());
        player.move();
    }
}
