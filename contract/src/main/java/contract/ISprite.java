package contract;

import java.awt.Image;
import java.io.IOException;

public interface ISprite {

	String getConsoleImage();

	Image getImage();

	String getImagename();

	boolean isImageloaded();

	void loadImage() throws IOException;

}