package AdapterLab;

public class ThermostatAdapter implements SmartDevice{
    private final LegacyThermostat thermostat;

    public ThermostatAdapter(LegacyThermostat thermostat) {
        if (thermostat == null) {
            throw new IllegalArgumentException("Thermostat cannot be null");
        }
        this.thermostat = thermostat;
    }

    @Override
    public void turnOn() {
        if("IDLE".equals(thermostat.checkDial())){
            thermostat.rotateDial("LOW");
        }
    }

    @Override
    public void turnOff() {

        thermostat.rotateDial("IDLE");
    }

    @Override
    public boolean isOn() {
        String currentDial = thermostat.checkDial();
        return "LOW".equals(currentDial) || "MEDIUM".equals(currentDial) || "MAX".equals(currentDial);
    }

    @Override
    public int getPowerPercent() {
        String currentDial = thermostat.checkDial();
        if (currentDial == null) {
            return 0;
        }
        switch (currentDial) {
            case "LOW":
                return 33;
            case "MEDIUM":
                return 66;
            case "MAX":
                return 100;
            case "IDLE":
            default:
                return 0;
        }
    }
}
