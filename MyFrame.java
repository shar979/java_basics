import javax.swing.JFrame;

public class MyFrame {

    public static void main(String[] args) {

    
        JFrame frame = new JFrame("MyFrame");

        // Set our  frame size
        frame.setSize(500, 400);

                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
