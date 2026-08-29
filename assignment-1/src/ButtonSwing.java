import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonSwing {
    
    // Changed from private static to public so Main can call it
    public void createAndShowGUI() {
        JFrame frame = new JFrame("Hello World App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        //JLabel label = new JLabel("Hello, World!", SwingConstants.CENTER);
        JButton button = new JButton("Click Me");
        frame.getContentPane().add(button, "South");

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}