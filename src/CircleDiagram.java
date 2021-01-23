import javax.swing.*;
import java.awt.*;
import java.awt.geom.Arc2D;

import static java.awt.geom.Arc2D.PIE;

public class CircleDiagram extends JComponent {
    private double countOfA, countOfB, countOfC, countAll;
    private int radius = Main.sSize.height / 8;

    CircleDiagram(double countOfA, double countOfB, double countOfC) {
        setBounds(0, 0, 3 * radius / 2, radius + 2);
        setPreferredSize(getSize());
        this.countOfA = countOfA;
        this.countOfB = countOfB;
        this.countOfC = countOfC;
        countAll = countOfA + countOfB + countOfC;
    }

    @Override
    protected void paintComponent(Graphics g) {

        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(1.0f));
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); //Сглаживание пикселей

        g2.setPaint(Color.RED);
        g2.fill(new Arc2D.Double(radius / 4.0, 0.0, radius, radius, 0, 360.0 * countOfC / countAll, PIE));
        g2.setPaint(Color.BLACK);
        g2.draw(new Arc2D.Double(radius / 4.0, 0.0, radius, radius, 0, 360.0 * countOfC / countAll, PIE)); //контур

        g2.setPaint(Color.YELLOW);
        g2.fill(new Arc2D.Double(radius / 4.0, 0.0, radius, radius, 360.0 * countOfC / countAll, 360.0 * countOfB / countAll, PIE));
        g2.setPaint(Color.BLACK);
        g2.draw(new Arc2D.Double(radius / 4.0, 0.0, radius, radius, 360.0 * countOfC / countAll, 360.0 * countOfB / countAll, PIE)); //контур

        g2.setPaint(Color.GREEN);
        g2.fill(new Arc2D.Double(radius / 4.0, 0.0, radius, radius, 360 - 360.0 * countOfA / countAll, 360.0 * countOfA / countAll, PIE));
        g2.setPaint(Color.BLACK);
        g2.draw(new Arc2D.Double(radius / 4.0, 0.0, radius, radius, 360 - 360.0 * countOfA / countAll, 360.0 * countOfA / countAll, PIE)); //контур
    }
}
