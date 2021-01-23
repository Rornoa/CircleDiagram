import java.awt.*;
import java.util.Scanner;

public class Main {
    static final Dimension sSize = Toolkit.getDefaultToolkit().getScreenSize();

    public static void main(String[] args) {
        System.out.println("Введите количество пятёрок, четвёрок и троек через пробел");//
        Scanner scanner = new Scanner(System.in);//
        SimpleFrame simpleframe = new SimpleFrame();
        simpleframe.setContentPane(new DiagramPanel(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));//
        simpleframe.setVisible(true);

    }
}
