import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Frame extends JFrame {

    Screen screen;
    RandomHeight randomHeight;
    BubbleSort bubbleSort;
    ChoiceSort choiceSort;
    InsertSort insertSort;
    MergerSort mergerSort;
    QuickSort quickSort;
    SwapSort swapSort;
    int[] height = new int[20];

    public Frame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,500);
        setResizable(false);
        setTitle("Graphics");

        init();
    }

    public void init(){
        setLocationRelativeTo(null);

        setLayout(new GridLayout(1,1,0,0));

        screen = new Screen();

        JButton buttonBubbleSort = new JButton("BubbleSort");
        buttonBubbleSort.setSize(40,20);
        JButton buttonInsertSort = new JButton("InsertSort");
        buttonInsertSort.setSize(40,20);
        JButton buttonChoiceSort = new JButton("ChoiceSort");
        buttonChoiceSort.setSize(40,20);
        JButton buttonMergerSort = new JButton("MergerSort");
        buttonMergerSort.setSize(40,20);
        JButton buttonSwapSort = new JButton("SwapSort");
        buttonSwapSort.setSize(40,20);
        JButton buttonQuickSort = new JButton("QuickSort");
        buttonQuickSort.setSize(40,20);

        JButton rand = new JButton("Random");
        rand.setSize(40,30);


        Box box = Box.createVerticalBox();
        box.setMinimumSize(new Dimension(75,400));
        box.add(Box.createVerticalStrut(40));
        box.add(rand);
        box.add(Box.createVerticalStrut(30));
        box.add(buttonBubbleSort);
        box.add(Box.createVerticalStrut(20));
        box.add(buttonChoiceSort);
        box.add(Box.createVerticalStrut(20));
        box.add(buttonInsertSort);
        box.add(Box.createVerticalStrut(20));
        box.add(buttonMergerSort);
        box.add(Box.createVerticalStrut(20));
        box.add(buttonQuickSort);
        box.add(Box.createVerticalStrut(20));
        box.add(buttonSwapSort);

        add(box);
        rand.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                randomHeight = new RandomHeight(setRand());
                add(randomHeight);
                setVisible(true);

            }
        });
        buttonBubbleSort.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bubbleSort = new BubbleSort(height);
                add(bubbleSort);
                setVisible(true);
            }
        });
        buttonChoiceSort.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                choiceSort = new ChoiceSort(height);
                add(choiceSort);
                setVisible(true);
            }
        });
        buttonInsertSort.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                insertSort = new InsertSort(height);
                add(insertSort);
                setVisible(true);
            }
        });
        buttonMergerSort.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mergerSort = new MergerSort(height);
                add(mergerSort);
                setVisible(true);
            }
        });
        buttonQuickSort.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quickSort = new QuickSort(height);
                add(quickSort);
                setVisible(true);
            }
        });
        buttonSwapSort.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                swapSort = new SwapSort(height);
                add(swapSort);
                setVisible(true);
            }
        });


        setVisible(true);
    }

    public int[] setRand(){
        Random random = new Random();
        for (int i = 0; i < 20; i++){
            height[i] = random.nextInt(300);
        }
        return height;
    }

    public static void main(String[] args) {
        new Frame();
    }

}
