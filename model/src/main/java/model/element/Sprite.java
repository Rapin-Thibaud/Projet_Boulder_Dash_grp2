package model.element;

import java.awt.Image;

public class Sprite {
    private Image   image;
    private String  imagename;
    private boolean imageloaded;

    public Image getImage() {
        return this.image;
    }

    public String getImagename() {
        return this.imagename;
    }

    public boolean isImageloaded() {
        return this.imageloaded;
    }

    public void setImage(final Image image) {
        this.image = image;
    }

    public void setImageloaded(final boolean imageloaded) {
        this.imageloaded = imageloaded;
    }

    public void setImagename(final String imagename) {
        this.imagename = imagename;
    }

}
