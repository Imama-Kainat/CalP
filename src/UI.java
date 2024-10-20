import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;

public class UI {
    private Button button; // Declare a Button instance

    public UI() {
        // Initialize the Button
        button = new Button("Click Me"); // Add a label to the button
        // Set up the Frame (UI container)
        Frame frame = new Frame();
        frame.add(button);
        frame.setSize(300, 200); // Set the frame size
        frame.setLayout(null); // Set layout to null for absolute positioning
        frame.setVisible(true); // Make the frame visible
    }

    public void designUI() {
        // Change button colors to green
        button.setBackground(Color.GREEN);
        // Adjust font size for buttons
        button.setFont(new Font("Arial", Font.PLAIN, 16));
    }

    public static void main(String[] args) {
        UI ui = new UI(); // Create UI instance
        ui.designUI(); // Apply design changes
    }
}
