import javax.swing.*;
import java.awt.*;

public class ChoiceSort extends JPanel{

    int[] height = new int[20];
    int z = 0;

    public ChoiceSort(int[] height){
        for(int i = 0; i < 20; i++){
            this.height[i] = height[i];
        }
        choiceSort();
    }

    public void choiceSort(){
        for (int i = 0; i < height.length-1; i++)
        {
            int index = i;
            for (int j = i+1; j < height.length; j++)
                if (height[j] < height[index]){
                    index = j;
                }
                else{
                    int smallerNumber = height[index];
                    height[index] = height[i];
                    height[i] = smallerNumber;
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