
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        // We still use the Event Dispatch Thread for thread safety
        SwingUtilities.invokeLater(() -> {
            // Create an instance of the separate class and call its method
            ButtonSwing app = new ButtonSwing();
            app.createAndShowGUI();
        });
    }
}