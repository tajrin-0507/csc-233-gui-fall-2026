
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        // We still use the Event Dispatch Thread for thread safety
        SwingUtilities.invokeLater(() -> {

            ImagePanel panel = new ImagePanel(new
            ImageIcon("images/background.png").getImage());
            JFrame frame = new JFrame("Hack #1: Create Image-Themed Components");
            frame.getContentPane().add(panel);
            frame.pack();
            frame.setVisible(true);


            // Create an instance of the separate class and call its method
            ButtonSwing app = new ButtonSwing();
            app.createAndShowGUI();

            final ImageButton button = new ImageButton("images/button.png");
            button.setLocation(60,74);
            panel.add(button);

        });

        System.out.println("Main method completed run successfully :)");
    }
}