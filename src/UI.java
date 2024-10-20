import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import javax.swing.JLabel; // Import JLabel from Swing

public class UI {
    private Button button; // Declare a Button instance
    private Frame frame;   // Declare a Frame instance

    public UI() {
        // Initialize the Frame
        frame = new Frame();
        
        // Initialize the Button
        button = new Button("Click Me"); // Add a label to the button
        button.setBounds(100, 50, 100, 30); // Set position and size of the button
        
        // Add the button to the frame
        frame.add(button);
        
        // Set up the Frame properties
        frame.setSize(300, 200); // Set the frame size
        frame.setLayout(null); // Set layout to null for absolute positioning
        frame.setVisible(true); // Make the frame visible
    }

    public void designUI() {
        // Change button colors to red
        button.setBackground(Color.RED);
        // Adjust font size for buttons
        button.setFont(new Font("Arial", Font.PLAIN, 16));

        // Add new components (e.g., a label)
        JLabel newLabel = new JLabel("New Feature");
        newLabel.setBounds(100, 100, 100, 30); // Set position and size of the label
        frame.add(newLabel); // Add the label to the frame
    }

    public static void main(String[] args) {
        UI ui = new UI(); // Create UI instance
        ui.designUI(); // Apply design changes
    }
}
