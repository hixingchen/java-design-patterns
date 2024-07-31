package abstractFactory;

public class ExcelApplication implements Application{
    @Override
    public void open() {
        System.out.println("Opening Excel Application");
    }
}
