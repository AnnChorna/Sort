import javax.swing.*;
import java.awt.*;

public class MergerSort extends JPanel{

    int[] height = new int[20];
    int z = 0;

    public MergerSort(int[] height){
        for(int i = 0; i < 20; i++){
            this.height[i] = height[i];
        }
        mergerSort();
    }

    public void mergerSort() {
        int left, right, medium;
        int[] z = new int[height.length];
        left = 0;
        medium = Math.round(height.length / 2);
        right = medium;
        for (int p = left; p < right; p++) {
            for (int i = p + 1; i < right; i++) {
                if (height[i] < height[p]) {
                    height[p] = height[p] + height[i];
                    height[i] = height[p] - height[i];
                    height[p] = height[p] - height[i];
                }
            }
        }
        for (int p = right; p < height.length; p++) {
            for (int i = p + 1; i < height.length; i++) {
                if (height[i] < height[p]) {
                    height[p] = height[p] + height[i];
                    height[i] = height[p] - height[i];
                    height[p] = height[p] - height[i];
                }
            }
        }

        left = 0;
        right = medium;
        System.out.println();
        for (int i = 0; i < height.length; i++) {
            if (left >= medium) {
                z[i] = height[right];
                right++;
                continue;
            }
            if (right > height.length - 1) {
                z[i] = height[left];
                left++;
                continue;
            }
            if (height[left] < height[right]) {
                z[i] = height[left];
                left++;
            } else {
                z[i] = height[right];
                right++;
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
