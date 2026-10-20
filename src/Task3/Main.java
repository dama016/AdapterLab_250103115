package Task3;

public class Main {
    public static void main(String[] args) {
        ModernConsole console = new ModernConsole();
        RetroCartridge retro = new RetroCartridge("Super Pixel Bros");

        console.run(new CartridgeAdapter(retro));
    }
}
