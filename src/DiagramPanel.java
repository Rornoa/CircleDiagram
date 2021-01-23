import java.awt.*;
import javax.swing.*;

class DiagramPanel extends JPanel {

    DiagramPanel(double a, double b, double c) {
        setLayout(new FlowLayout());
        setBackground(Color.LIGHT_GRAY);
        add(new CircleDiagram(a, b, c));
        Box box = Box.createVerticalBox();

        box.add(new DiagramLabel(Color.GREEN, " 5"));
        box.add(new DiagramLabel(Color.YELLOW, " 4"));
        box.add(new DiagramLabel(Color.RED, " 3"));
        add(box);
    }
}
