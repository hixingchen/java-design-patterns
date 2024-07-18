package adapterPattern;

public class PowerAdapter implements NewPowerOutlet{

    private OldPowerOutlet oldPowerOutlet;

    public PowerAdapter(OldPowerOutlet oldPowerOutlet){
        this.oldPowerOutlet = oldPowerOutlet;
    }

    @Override
    public void supply220V() {
        System.out.println("电压转换110V-->220V");
        oldPowerOutlet.supply110V();//调用旧插座方法
        //假设转换操作成功
        System.out.println("提供220V电压...");
    }
}
