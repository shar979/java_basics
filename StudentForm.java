
import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class StudentForm extends JFrame {

    JTextField idField, nameField, courseField;

    // Constructor
    public StudentForm() {

        setTitle("Student Registration Form");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(4, 2, 10, 10));

        // Student ID
        add(new JLabel("Student ID:"));
        idField = new JTextField();
        add(idField);

        // Student Name
        add(new JLabel("Name:"));
        nameField = new JTextField();
        add(nameField);

        // Course
        add(new JLabel("Course:"));
        courseField = new JTextField();
        add(courseField);

        // Submit button
        JButton submitButton = new JButton("Submit");
        add(submitButton);

        submitButton.addActionListener(e -> insertStudent());

        setVisible(true);
    }

    // Insert student into MySQL
    private void insertStudent() {

        String url = "jdbc:mysql://localhost:3306/studentdb";
        String user = "root";
        String password = "";

        String sql = "INSERT INTO students VALUES (?, ?, ?)";

        try (Connection con =
                 DriverManager.getConnection(url, user, password);

             PreparedStatement pst = con.prepareStatement(sql)) {

            pst.setInt(1, Integer.parseInt(idField.getText()));
            pst.setString(2, nameField.getText());
            pst.setString(3, courseField.getText());

            pst.executeUpdate();

            JOptionPane.showMessageDialog(
                this, "Student details saved successfully!"
            );

            idField.setText("");
            nameField.setText("");
            courseField.setText("");

        } catch (SQLException | NumberFormatException ex) {

            JOptionPane.showMessageDialog(
                this, "Error: " + ex.getMessage()
            );
        }
    }

    // Main method
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> new StudentForm());
    }
}
