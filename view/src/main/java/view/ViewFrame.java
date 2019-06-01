package view;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

import contract.IController;
import contract.IModel;

/**
 * The Class ViewFrame.
 *
 * @author Jean-Aymeric Diet
 */
class ViewFrame extends JFrame implements KeyListener {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -697358409737458175L;

    /** The model. */
    private IModel            model;
    /** The controller. */
    private IController       controller;

    /**
     * Instantiates a new view frame.
     *
     * @param model
     *            the model
     * @throws HeadlessException
     *             the headless exception
     */
    JTable                    tableBoulderDash;
    ImageIcon                 imageCopy;
    private TableModel        modelBoulderDash;

    public ViewFrame(final IModel model) {
        super();
        this.modelBoulderDash = new TableModel() {

            @Override
            public void addTableModelListener(final TableModelListener l) {
                // TODO Auto-generated method stub

            }

            @Override
            public Class<?> getColumnClass(final int columnIndex) {

                return ImageIcon.class;

            }

            @Override
            public int getColumnCount() {

                return 28;
            }

            @Override
            public String getColumnName(final int columnIndex) {
                // TODO Auto-generated method stub
                return null;
            }

            @Override
            public int getRowCount() {

                return 28;
            }

            @Override
            public Object getValueAt(final int rowIndex, final int columnIndex) {
                // final ArrayList<Position> tabMap = model.getMap();
                return 5;
            }

            @Override
            public boolean isCellEditable(final int rowIndex, final int columnIndex) {
                // TODO Auto-generated method stub
                return true;
            }

            @Override
            public void removeTableModelListener(final TableModelListener l) {
                // TODO Auto-generated method stub

            }

            @Override
            public void setValueAt(final Object aValue, final int rowIndex, final int columnIndex) {
                // final ArrayList<Position> tabmap = model.getMap();
                // return fileToIcon( this.onTheMap[t.getX()][t.getY()] =
                // t.getid());

            }

        };
    }

    /**
     * Instantiates a new view frame.
     *
     * @param model
     *            the model
     * @param gc
     *            the gc
     */
    public ViewFrame(final IModel model, final GraphicsConfiguration gc) {
        super(gc);
        this.buildViewFrame(model);
    }

    /**
     * Instantiates a new view frame.
     *
     * @param model
     *            the model
     * @param title
     *            the title
     * @throws HeadlessException
     *             the headless exception
     */
    public ViewFrame(final IModel model, final String title) throws HeadlessException {
        super(title);
        this.buildViewFrame(model);
    }

    /**
     * Instantiates a new view frame.
     *
     * @param model
     *            the model
     * @param title
     *            the title
     * @param gc
     *            the gc
     */
    public ViewFrame(final IModel model, final String title, final GraphicsConfiguration gc) {
        super(title, gc);
        this.buildViewFrame(model);
    }

    /**
     * Builds the view frame.
     *
     * @param model
     *            the model
     */
    private void buildViewFrame(final IModel model) {
        this.setModel(model);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.addKeyListener(this);
        this.setContentPane(new ViewPanel(this));
        this.setSize(400 + this.getInsets().left + this.getInsets().right,
                60 + this.getInsets().top + this.getInsets().bottom);
        this.setLocationRelativeTo(null);
    }

    private ImageIcon fileToIcon(final String filePath) {

        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(filePath));
        } catch (final IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return new ImageIcon(img);

    }

    // private IController getController() {
    // return this.controller;
    // }

    /**
     * Gets the model.
     *
     * @return the model
     */
    protected IModel getModel() {
        return this.model;
    }

    public TableModel getModelBoulderDash() {
        return this.modelBoulderDash;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.awt.event.KeyListener#keyPressed(java.awt.event.KeyEvent)
     */
    @Override
    public void keyPressed(final KeyEvent e) {
        // this.getController().orderPerform(e.getKeyCode()));
    }

    /*
     * (non-Javadoc)
     *
     * @see java.awt.event.KeyListener#keyReleased(java.awt.event.KeyEvent)
     */
    @Override
    public void keyReleased(final KeyEvent e) {

    }

    /*
     * (non-Javadoc)
     *
     * @see java.awt.event.KeyListener#keyTyped(java.awt.event.KeyEvent)
     */
    @Override
    public void keyTyped(final KeyEvent e) {

    }

    /**
     * Prints the message.
     *
     * @param message
     *            the message
     */
    public void printMessage(final String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    /**
     * Sets the controller.
     *
     * @param controller
     *            the new controller
     */
    protected void setController(final IController controller) {
        this.controller = controller;
    }

    /**
     * Sets the model.
     *
     * @param model
     *            the new model
     */
    private void setModel(final IModel model) {
        this.model = model;
    }

    public void setModelBoulderDash(final TableModel modelBoulderDash) {
        this.modelBoulderDash = modelBoulderDash;
    }
}
