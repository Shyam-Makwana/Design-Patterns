package Prototype;

/*
 * @author Shyam Makwana
 */

public abstract class Animal implements Cloneable {

    private String id;
    protected String type;

    abstract void render();

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object clone() throws CloneNotSupportedException {
        Object clone = null;
            clone = super.clone();
    
        return clone;
    }
}
