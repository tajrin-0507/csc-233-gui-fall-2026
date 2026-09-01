import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

public class ImagePanel extends JPanel {
    final private Image img;
    
    public ImagePanel(Image img) {
        this.img = img;
        Dimension size = new Dimension(img.getWidth(null),
        img.getHeight(null));
        setSize(size);
        setPreferredSize(size);
        setMinimumSize(size);
        setMaximumSize(size);
        setLayout(null);
    }
    /**
     * It's important to override paintComponent( ) instead of paint( ), 
     * or else the child components won't get drawn. 
     */
    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(img,0,0,null);
    }

}