package model.element;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Sprite {
    private Image   image;
    private String  imagename;
    private char    consoleImage;
    private boolean imageloaded;

    public Sprite(final char character, final String imagename) {
        this.setConsoleImage(character);
        this.setImagename(imagename);
    }

    public char getConsoleImage() {
        return this.consoleImage;
    }

    public Image getImage() {
        return this.image;
    }

    public String getImagename() {
        return this.imagename;
    }

    public boolean isImageloaded() {
        return this.imageloaded;
    }

    public void loadImage() throws IOException {
        this.setImage(ImageIO.read(new File("SpritesCustom/" + this.getImage())));
    }

    public void setConsoleImage(final char consoleImage) {
        this.consoleImage = consoleImage;
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
