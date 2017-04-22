import javax.swing.*;
import java.awt.*;

public class SwapSort extends JPanel {

    int[] height = new int[20];
    int z = 0;

    public SwapSort(int[] height){
        for(int i = 0; i < 20; i++){
            this.height[i] = height[i];
        }
        swapSort();
    }

    public void swapSort() {
        for (int p = 0; p < height.length; p++) {
            for (int i = p + 1; i < height.length; i++) {
                if (height[i] < height[p]) {
                    height[p] = height[p] + height[i];
                    height[i] = height[p] - height[i];
                    height[p] = height[p] - height[i];
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
