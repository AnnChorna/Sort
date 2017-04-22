import javax.swing.*;
import java.awt.*;

public class BubbleSort extends JPanel{

    int[] height = new int[20];
    int z = 0;
    int i = 0;

    public BubbleSort(int[] height){
        for(int i = 0; i < 20; i++){
            this.height[i] = height[i];
        }
        bubbleSort();
    }

    private void bubbleSort() {
        int t;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                if (height[j] < height[i]) {
                    t = height[j];
                    height[j] = height[i];
                    height[i] = t;
                }
            }
            repaint();

        }
    }

    public void paint(Graphics graphics){
        for(int i = 0; i < 20; i++){
            graphics.fillRect(z+=5,600, 10, height[i]);
            graphics.setColor(Color.BLACK);
        }
    }

}

