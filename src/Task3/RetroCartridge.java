package Task3;

public class RetroCartridge {
    private final String title;

    public RetroCartridge(String title) {
        this.title = title;
    }

    public void insertCartridge() {
        System.out.println("Blowing dust off and inserting cartridge: " + title);
    }
}
