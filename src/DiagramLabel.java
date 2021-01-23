import javax.swing.*;
import java.awt.*;

public class DiagramLabel extends JComponent {
    private Color color;
    private String title;
    private int height = Main.sSize.height / 40;
    private int width = Main.sSize.width / 40;

    DiagramLabel(Color color, String title) {

        setBounds(0, 0, width, height);
        setPreferredSize(getSize());
        this.color = color;
        this.title = title;
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D graphics2D = (Graphics2D) g;
        graphics2D.setColor(color);
        graphics2D.fillRect(5, 5, width / 3, height / 2);
        graphics2D.setColor(Color.black);
        graphics2D.setFont(new Font("Times new Roman", Font.BOLD, width / 3));
        graphics2D.drawRect(5, 5, width / 3, height / 2);
        graphics2D.drawString(title, width * 2 / 3, height * 2 / 3);
    }
}
