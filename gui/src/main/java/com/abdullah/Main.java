package com.abdullah;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        // We still use the Event Dispatch Thread for thread safety
        SwingUtilities.invokeLater(() -> {
            // Create an instance of the separate class and call its method
            HelloWorldSwing app = new HelloWorldSwing();
            app.createAndShowGUI();
        });
        System.out.println("Main method has completed execution.");
    }
}
