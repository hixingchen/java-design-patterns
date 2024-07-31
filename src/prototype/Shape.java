package prototype;

public class Shape implements Cloneable{

    private String type;

    public Shape(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public Shape clone() {
        try {
            return (Shape) super.clone();
        }catch (CloneNotSupportedException e){
            return null;
        }
    }
}
