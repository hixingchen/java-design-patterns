package prototypePattern;

abstract class Shape implements Cloneable{

    protected String type;

    public abstract void draw();

    public String getType(){
        return type;
    }

    public Shape clone(){
        Shape clone = null;
        try {
            clone = (Shape)super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;
    }
}
