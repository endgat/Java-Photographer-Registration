package rw.Photo.View;

import rw.Photo.Dao.PhClas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Phview extends JDialog {
    private JPanel Signpanel;
    private JTextField Fnamefield;
    private JButton signupButton;
    private JButton cancelButton;
    private JTextField lastnaameField2;
    private JTextField emailField3;
    private JPasswordField passwordField1;
    private JPasswordField confirmPasswordF;
    private JTextField cmfield;


    public Phview(JFrame parent) {
    super(parent);
    setTitle("Create new account");
    setContentPane(Signpanel);
    setModal(true);
    setMinimumSize(new Dimension(800, 400));
    setLocationRelativeTo(parent);







        signupButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Signupuser();
            }
        });
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        setVisible(true);
    }

    private void Signupuser() {
        int cameraid = Integer.parseInt(cmfield.getText());
        String firstName = Fnamefield.getText();
        String lastName = lastnaameField2.getText();
        String email = emailField3.getText();
        String password = new String(passwordField1.getPassword());
        String confirmPassword = new String(confirmPasswordF.getPassword());


        if (firstName.isEmpty() || lastName.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Exit method if any field is empty
        }

        if (!password.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(this, "Passwords do not match.", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Exit method if passwords don't match
        }




        PhClas phClass = new PhClas();
        if (phClass.Signupuser(cameraid,firstName, lastName, email, password)) {
            JOptionPane.showMessageDialog(this, "User added successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Failed to add user. Please try again later.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    public static void main(String[] args) {
        Phview myform  = new Phview(null);
    }



}
