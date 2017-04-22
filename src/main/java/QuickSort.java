import javax.swing.*;
import java.awt.*;

public class QuickSort extends JPanel {

    int[] height = new int[20];
    int z = 0;

    public QuickSort(int[] height){
        for(int i = 0; i < 20; i++){
            this.height[i] = height[i];
        }
        quickSort();
    }

    public void quickSort() {
        int startIndex = 0;
        int endIndex = height.length - 1;
        doSort(startIndex, endIndex);
    }

    private void doSort( int start, int end) {
        if (start >= end)
            return;
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (height[i] <= height[cur])) {
                i++;
            }
            while (j > cur && (height[cur] <= height[j])) {
                j--;
            }
            if (i < j) {
                int temp = height[i];
                height[i] = height[j];
                height[j] = temp;
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        doSort(start, cur);
        doSort(cur+1, end);
    }

    public void paint(Graphics graphics){
        for(int i = 0; i < 20; i++){
            graphics.fillRect(z+=5,600, 10, height[i]);
            graphics.setColor(Color.BLACK);
        }
    }

}
