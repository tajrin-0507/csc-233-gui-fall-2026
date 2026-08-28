import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class HelloWorldSwing {
    
    // Changed from private static to public so Main can call it
    public void createAndShowGUI() {
        JFrame frame = new JFrame("Hello World App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JLabel label = new JLabel("Hello, World!", SwingConstants.CENTER);
        frame.getContentPane().add(label);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
