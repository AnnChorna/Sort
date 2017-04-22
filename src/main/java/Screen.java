import javax.swing.*;
import java.awt.*;

public class Screen extends JPanel {

    public Screen(){
        repaint();
    }

    public void paint(Graphics graphics){
        graphics.fillRect(100,100,50,50);
        graphics.fillRect(100,200,50,50);
        graphics.fillRect(100,300,50,50);

    }

}
