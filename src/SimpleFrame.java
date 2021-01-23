import javax.swing.*;

class SimpleFrame extends JFrame {

    SimpleFrame() {
        setTitle("Circle diagram");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        int width = Main.sSize.width;
        int height = Main.sSize.height;
        setBounds(width / 2 - width / 12, height / 2 - height / 12, width / 6, height / 6);
        setResizable(false);
    }
}
