package templateMethod;

public abstract class AbstractClass {
    /**
     * 步骤1
     */
    abstract void step1();
    /**
     * 步骤2
     */
    abstract void step2();
    /**
     * 步骤3
     */
    abstract void step3();

    public void templateMethod() {
        step1();
        step2();
        step3();
    }
}
