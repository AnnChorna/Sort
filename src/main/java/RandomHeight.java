import javax.swing.*;
import java.awt.*;

public class RandomHeight extends JPanel{

    int[] height = new int[20];
    int z = 0;

    public RandomHeight(int[] height){
        for(int i = 0; i < 20; i++){
            this.height[i] = height[i];
        }
        repaint();
    }

    public void paint(Graphics graphics){
        for(int i = 0; i < 20; i++){
            graphics.fillRect(z+=5,600, 10, height[i]);
            graphics.setColor(Color.BLACK);
        }
    }

}
