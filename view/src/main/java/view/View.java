package view;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import contract.IController;
import contract.IModel;
import contract.IView;

public final class View implements IView, Runnable {
    private final ViewFrame viewFrame;

    // protected static ControllerOrder keyCodeToControllerOrder(final int
    // keyCode) {
    /*
     * switch (keyCode) { case KeyEvent.VK_UP: return ControllerOrder.UP; case
     * KeyEvent.VK_DOWN: return ControllerOrder.DOWN; case KeyEvent.VK_RIGHT:
     * return ControllerOrder.RIGHT; case KeyEvent.VK_LEFT: return
     * ControllerOrder.LEFT; default: return ControllerOrder.NOTHING; } }
     */

    public View(final IModel model) {
        this.viewFrame = new ViewFrame(model);
        this.viewFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.initComponents(this.viewFrame);
        this.viewFrame.setVisible(true);
        // SwingUtilities.invokeLater(this);
        this.viewFrame.setSize(900, 700);
    }

    private void initComponents(final JFrame frame) {
        final JTable table = new JTable(this.viewFrame.getModelBoulderDash());
        frame.getContentPane().add(new JScrollPane(table));
    }

    /*
     * (non-Javadoc)
     *
     * @see contract.IView#printMessage(java.lang.String)
     */
    @Override
    public void printMessage(final String message) {
        this.viewFrame.printMessage(message);
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Runnable#run()
     */
    @Override
    public void run() {
        this.viewFrame.setVisible(true);
    }

    /**
     * Sets the controller.
     *
     * @param controller
     *            the new controller
     */
    public void setController(final IController controller) {
        this.viewFrame.setController(controller);
    }

    /*
     * private void setModel(final IModel road) throws IOException { this.model
     * = road; for (int x = 0; x < this.getMap().getWidth(); x++) { for (int y =
     * 0; y < this.getMap().getHeight(); y++) {
     * this.getMap().getElementOnTheMap(x, y).getSprite().loadImage(); } } }
     *
     * private void setView(final int view) { this.view = view; }
     */
}
