import javax.swing.*;
import java.awt.*;

public class InsertSort extends JPanel {

    int[] height = new int[20];
    int z = 0;

    public InsertSort(int[] height){
        for(int i = 0; i < 20; i++){
            this.height[i] = height[i];
        }
        insertSort();
    }

    public void insertSort(){
        for(int j = 1; j < height.length; j++){
            int key = height[j];
            int i = j -1;
            while ( i >= 0 && height[i] >key){
                height[i+1] = height[i];
                i--;
            }
            height[i+1] = key;
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
