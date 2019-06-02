
package entity;

public class FillingMap extends Entity{

    private int id;
    private String elementChar;
    private int x;
    private int y;


    public FillingMap(final int id, String elementChar, int x, int y) {
        setId(id);
        setElementChar(elementChar);
        setX(x);
        setY(y);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getElementChar() {
        return elementChar;
    }

    public void setElementChar(String elementChar) {
        this.elementChar = elementChar;
    }

    public int getX() {
        return x;
    }
    public void setX(final int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(final int y) {
        this.y = y;
    }




}