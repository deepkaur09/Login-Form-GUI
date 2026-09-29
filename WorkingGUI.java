import javax.swing.*;
public class WorkingGUI{
    public static void main(String [] args){
        String correctUser = "Dapinder";
        String correctPass = "Kaur89";

        JTextField textField = new JTextField();
        textField.setBounds(20, 20, 150, 30);

        JLabel label_1 = new JLabel("Username");
        label_1.setBounds(20, 55, 250, 25);

        JPasswordField password = new JPasswordField();
        password.setBounds(20, 100,  150, 30);

        JLabel label_2 = new JLabel("Password");
        label_2.setBounds(20, 135, 250, 25);

        JButton button = new JButton("Login");
        button.setBounds(180, 20, 90, 30);

        button.addActionListener(e -> {
            String enteredUser = textField.getText();
            String enteredPass = new String(password.getPassword());
            if(correctUser.equals(enteredUser) && correctPass.equals(enteredPass)){
                JOptionPane.showMessageDialog(null, "Login Successful!");
            }
            else{
                JOptionPane.showMessageDialog(null, "Invalid Username or Password");
            }
        });

        JFrame frame = new JFrame("Sign In");
        frame.setSize(350, 200);
        frame.add(textField);
        frame.add(label_1);
        frame.add(password);
        frame.add(label_2);
        frame.add(button);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
