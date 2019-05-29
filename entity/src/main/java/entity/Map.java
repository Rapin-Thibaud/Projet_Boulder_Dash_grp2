
package entity;

import java.util.ArrayList;

public class Map extends Entity {
    private String                      label;
    private int                         width;
    private int                         height;
    private final ArrayList<FillingMap> toto;

    public Map() {
        this.height = 23;
        this.width = 26;
        this.toto = new ArrayList<FillingMap>();
    }

    public Map(final int height, final int width) {
        this.height = height;
        this.width = width;
        this.toto = new ArrayList<FillingMap>();
    }

    public void fillToto(final FillingMap f) {
        this.toto.add(f);
    }

    public int getHeight() {
        return this.height;
    }

    public String getLabel() {
        return this.label;
    }

    public int getWidth() {
        return this.width;
    }

    public void setHeight(final int height) {
        this.height = height;
    }

    public void setLabel(final String label) {
        this.label = label;
    }

    public void setWidth(final int width) {
        this.width = width;
    }

}