package view;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import contract.IElement;
import contract.IModel;

class ViewPanel extends JPanel implements Observer {
	private ViewFrame                    viewFrame;

	private Image image = null;

	private static final long    serialVersionUID    = -998294702363713521L;

	public ViewPanel(final ViewFrame viewFrame) {
		this.setViewFrame(viewFrame);
		viewFrame.getModel().getObservable().addObserver(this);
		try {
			this.image = ImageIO.read( new File("D:/Thomas Rapin/git/Projet_Boulder_Dash_grp2/model/SpritesCustom/wallblock.png"));
		} catch (final IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private ViewFrame getViewFrame() {
		return this.viewFrame;
	}


	private void setViewFrame(final ViewFrame viewFrame) {
		this.viewFrame = viewFrame;
	}

	@Override
	public void update(final Observable arg0, final Object arg1) {
		this.repaint();
	}

	@Override
	protected void paintComponent(final Graphics graphics) {
		graphics.clearRect(0, 0, this.getWidth(), this.getHeight());
		// graphics.drawString(this.getViewFrame().getModel().getMap().getMessage(),10, 20);

		final IModel model = this.getViewFrame().getModel();

		for (int x = 0; x < (model.getMaping().size()); x++) {
			for (int y = 0; y < (model.getMaping().get(x).size()); y++) {
				final IElement element = model.getMapingElement(x, y);
				if (element != null) {
					//System.out.print(String.valueOf(model.getMapingElement(x, y).getSprite().getConsoleImage()));
					graphics.drawImage(element.getSprite().getImage(), x*32 , y*32, 32,32, this);
					//graphics.drawString(element.getSprite().getConsoleImage(), x*15, y*15);
				} else {
					graphics.drawImage(this.image, x*32, y*32, 32, 32, this);
				}

			}
			System.out.println("");
		}
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
	}
}
