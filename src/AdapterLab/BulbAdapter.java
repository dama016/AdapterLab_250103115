package AdapterLab;

public class BulbAdapter implements SmartDevice{
    private final LegacyBulb bulb;

    public BulbAdapter(LegacyBulb bulb){
        if(bulb == null){
            throw new IllegalArgumentException("Bulb can't be null");
        }
        this.bulb = bulb;
    }
    @Override
    public void turnOn() {
        bulb.setBrightness(255);
    }

    @Override
    public void turnOff() {
        bulb.setBrightness(0);
    }

    @Override
    public boolean isOn() {
        if(bulb.hasPower() && bulb.readBrightness() > 0){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public int getPowerPercent() {
        int rawBrightness = bulb.readBrightness();
        int k = 5; //25010311(5)

        if(rawBrightness == 0)return 0;

        int rawPercent = (rawBrightness*100)/255;
        int calibratedPercent = rawPercent + k;

        if(calibratedPercent > 100){
            return 100;
        }
        else{
            return calibratedPercent;
        }
    }
}
