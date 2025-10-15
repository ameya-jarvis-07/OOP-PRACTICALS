import java.awt.*;
import java.awt.event.*;

public class Practical7_AWT extends Frame implements ActionListener {
    Button button;

    Practical7_AWT() {
        button = new Button("Click Me");
        button.setBounds(100, 100, 80, 30);
        button.addActionListener(this);

        add(button);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("Button Clicked!"); // Message in terminal
    }

    public static void main(String[] args) {
        new Practical7_AWT();
    }
}