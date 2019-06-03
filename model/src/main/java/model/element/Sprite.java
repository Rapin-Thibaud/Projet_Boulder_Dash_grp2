package model.element;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import contract.ISprite;

public class Sprite implements ISprite {
	private Image   image;
	private String  imagename;
	private String    consoleImage;
	private boolean imageloaded;

	public Sprite(final String character, final String imagename) {
		this.setConsoleImage(character);
		this.setImagename(imagename);
		try {
			this.setImage(ImageIO.read(new File("D:/Thomas Rapin/git/Projet_Boulder_Dash_grp2/model/SpritesCustom/"+ this.getImagename())));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String getConsoleImage() {
		return this.consoleImage;
	}

	@Override
	public Image getImage() {
		return this.image;
	}

	@Override
	public String getImagename() {
		return this.imagename;
	}

	@Override
	public boolean isImageloaded() {
		return this.imageloaded;
	}

	@Override
	public void loadImage() throws IOException {
		this.setImage(ImageIO.read(new File("D:/Thomas Rapin/git/Projet_Boulder_Dash_grp2/model/SpritesCustom/"+ this.getImagename())));
	}

	public void setConsoleImage(final String consoleImage) {
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
