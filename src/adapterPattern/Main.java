package adapterPattern;

public class Main {
    public static void main(String[] args) {
        OldPowerOutlet oldPowerOutlet = new OldPowerOutlet();
        NewPowerOutlet newPowerOutlet = new PowerAdapter(oldPowerOutlet);
        newPowerOutlet.supply220V();
    }
}
