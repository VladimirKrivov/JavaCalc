import javax.swing.*;

public class MainForm extends JFrame {
    public MainForm() {
        setTitle("Калькулятор");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(350, 600);
        setLocation(400, 650);
    }

    public static void main(String[] args) {
        MainForm mw = new MainForm();
    }

}
