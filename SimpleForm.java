import javax.swing.*;

public class SimpleForm {
    public static void main(String[] args) {
        JFrame f = new JFrame("Student Form");

        // Labels and TextFields
        JLabel l1 = new JLabel("Name:");
        JTextField t1 = new JTextField();

        JLabel l2 = new JLabel("RNO:");
        JTextField t2 = new JTextField();

        JLabel l3 = new JLabel("Mail ID:");
        JTextField t3 = new JTextField();

        JLabel l4 = new JLabel("Gender:");
        JTextField t4 = new JTextField();

        JLabel l5 = new JLabel("Branch:");
        JTextField t5 = new JTextField();

        JLabel l6 = new JLabel("Address:");
        JTextField t6 = new JTextField();

        JButton b = new JButton("SAVE");

        // Set positions (absolute positioning)
        l1.setBounds(20, 20, 80, 20); t1.setBounds(100, 20, 150, 20);
        l2.setBounds(20, 50, 80, 20); t2.setBounds(100, 50, 150, 20);
        l3.setBounds(20, 80, 80, 20); t3.setBounds(100, 80, 150, 20);
        l4.setBounds(20, 110, 80, 20); t4.setBounds(100, 110, 150, 20);
        l5.setBounds(20, 140, 80, 20); t5.setBounds(100, 140, 150, 20);
        l6.setBounds(20, 170, 80, 20); t6.setBounds(100, 170, 150, 20);
        b.setBounds(100, 210, 80, 30);

        // Button Action
        b.addActionListener(e -> {
            String data = "Name: " + t1.getText() + "\n"
                        + "RNO: " + t2.getText() + "\n"
                        + "Mail ID: " + t3.getText() + "\n"
                        + "Gender: " + t4.getText() + "\n"
                        + "Branch: " + t5.getText() + "\n"
                        + "Address: " + t6.getText();
            JOptionPane.showMessageDialog(f, data);
        });

        // Add to frame
        f.add(l1); f.add(t1);
        f.add(l2); f.add(t2);
        f.add(l3); f.add(t3);
        f.add(l4); f.add(t4);
        f.add(l5); f.add(t5);
        f.add(l6); f.add(t6);
        f.add(b);

        f.setSize(800, 800);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
