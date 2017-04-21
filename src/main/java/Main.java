import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.*;
import javafx.stage.Stage;

import java.awt.*;
import java.awt.Font;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;
import java.util.Random;

public class Main extends Application {

    BorderPane mainLayout = new BorderPane();
    int[] a = new int[30];

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Сортування масивів");

        Label label = new Label("Методи сортування масиву");

        VBox V = new VBox();
        V.getChildren().add(label);
        V.setSpacing(15);
        V.setAlignment(Pos.TOP_CENTER);

        mainLayout.setPadding(new Insets(10, 10, 10, 10));

        HBox H1 = new HBox();
        H1.setSpacing(3);
        H1.setAlignment(Pos.BOTTOM_CENTER);

        Button button1 = new Button("Сортування бульбашкою");
        Button button2 = new Button("Сортування злиттям");
        Button button3 = new Button("Сортування обміном");

        Button button12 = new Button("Сортування вибором");
        Button button22 = new Button("Сортування включенням");
        Button button32 = new Button("Швидке сортування");

        Button rand = new Button("Рандом");
        rand.minWidth(100);
        rand.minWidthProperty();

        VBox V1 = new VBox();
        V1.setSpacing(10);
        V1.getChildren().addAll(button1, button12);

        VBox V2 = new VBox();
        V2.setSpacing(10);
        V2.getChildren().addAll(button2, button22 ,rand);

        VBox V3 = new VBox();
        V3.setSpacing(10);
        V3.getChildren().addAll(button3, button32);

        HBox H = new HBox();
        H.setSpacing(15);
        H.setAlignment(Pos.CENTER);
        H.getChildren().addAll(V1, V2, V3);

        V.getChildren().add(H);

        mainLayout.setTop(V);
        mainLayout.setCenter(H);
        mainLayout.setBottom(H1);

        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.BOTTOM_CENTER);
        Random random = new Random();
        int z = 10;
        for (int i = 0; i < a.length; i++) {
            z += 10;
            a[i] = random.nextInt(250);
            Rectangle rectangle = new Rectangle(z, 300, 10, a[i]);
            hBox.getChildren().add(rectangle);

        }
        mainLayout.setBottom(hBox);

        rand.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                Random random = new Random();
                HBox hBox = new HBox();
                hBox.setSpacing(10);
                hBox.setAlignment(Pos.BOTTOM_CENTER);
                int z = 10;
                for (int i = 0; i < a.length; i++) {
                    z += 10;
                    a[i] = random.nextInt(250);
                    Rectangle rectangle = new Rectangle(z, 300, 10, a[i]);
                    hBox.getChildren().add(rectangle);

                }
                mainLayout.setBottom(hBox);
            }
        });

        button1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                a = bublSort(a);
                int z = 10;
                HBox hBox1 = new HBox();
                hBox1.setSpacing(10);
                hBox1.setAlignment(Pos.BOTTOM_CENTER);
                z = 10;
                for (int i = 0; i < a.length; i++) {
                    z += 10;
                    Rectangle rectangle = new Rectangle(z, 300, 10, a[i]);
                    hBox1.getChildren().add(rectangle);

                }
                mainLayout.setBottom(hBox1);
            }
        });

        button2.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                a = sliyanie(a);
                int z = 10;
                HBox hBox1 = new HBox();
                hBox1.setSpacing(10);
                hBox1.setAlignment(Pos.BOTTOM_CENTER);
                z = 10;
                for (int i = 0; i < a.length; i++) {
                    z += 10;
                    Rectangle rectangle = new Rectangle(z, 300, 10, a[i]);
                    hBox1.getChildren().add(rectangle);

                }
                mainLayout.setBottom(hBox1);
            }
        });

        button3.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                a = obmin(a);
                int z = 10;
                HBox hBox1 = new HBox();
                hBox1.setSpacing(10);
                hBox1.setAlignment(Pos.BOTTOM_CENTER);
                z = 10;
                for (int i = 0; i < a.length; i++) {
                    z += 10;
                    Rectangle rectangle = new Rectangle(z, 300, 10, a[i]);
                    hBox1.getChildren().add(rectangle);

                }
                mainLayout.setBottom(hBox1);
            }
        });

        button12.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                a = choicesort(a);
                int z = 10;
                HBox hBox1 = new HBox();
                hBox1.setSpacing(10);
                hBox1.setAlignment(Pos.BOTTOM_CENTER);
                z = 10;
                for (int i = 0; i < a.length; i++) {
                    z += 10;
                    Rectangle rectangle = new Rectangle(z, 300, 10, a[i]);
                    hBox1.getChildren().add(rectangle);

                }
                mainLayout.setBottom(hBox1);
            }
        });



        button22.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                a = vkl(a);
                int z = 10;
                HBox hBox1 = new HBox();
                hBox1.setSpacing(10);
                hBox1.setAlignment(Pos.BOTTOM_CENTER);
                z = 10;
                for (int i = 0; i < a.length; i++) {
                    z += 10;
                    Rectangle rectangle = new Rectangle(z, 300, 10, a[i]);
                    hBox1.getChildren().add(rectangle);

                }
                mainLayout.setBottom(hBox1);
            }
        });

        button32.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                a = quickSort(a);
                int z = 10;
                HBox hBox1 = new HBox();
                hBox1.setSpacing(10);
                hBox1.setAlignment(Pos.BOTTOM_CENTER);
                z = 10;
                for (int i = 0; i < a.length; i++) {
                    z += 10;
                    Rectangle rectangle = new Rectangle(z, 300, 10, a[i]);
                    hBox1.getChildren().add(rectangle);

                }
                mainLayout.setBottom(hBox1);
            }
        });


        primaryStage.setScene(new Scene(mainLayout, 700, 400));       // створення та встановлення сцени на головне вікно програми
        primaryStage.show();

    }

    private int[] bublSort(int[] array) {
        int t;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    t = array[j];
                    array[j] = array[i];
                    array[i] = t;
                }
            }

        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        return array;
    }

    public static int[] sliyanie(int[] a) {
        int left, right, medium;
        int[] z = new int[a.length];
        left = 0;
        medium = Math.round(a.length / 2);
        right = medium;

        long startTime = System.nanoTime();

        for (int p = left; p < right; p++) {
            for (int i = p + 1; i < right; i++) {
                if (a[i] < a[p]) {
                    a[p] = a[p] + a[i];
                    a[i] = a[p] - a[i];
                    a[p] = a[p] - a[i];
                }
            }
        }
        for (int p = right; p < a.length; p++) {
            for (int i = p + 1; i < a.length; i++) {
                if (a[i] < a[p]) {
                    a[p] = a[p] + a[i];
                    a[i] = a[p] - a[i];
                    a[p] = a[p] - a[i];
                }
            }
        }

        left = 0;
        right = medium;
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            if (left >= medium) {
                z[i] = a[right];
                right++;
                continue;
            }
            if (right > a.length - 1) {
                z[i] = a[left];
                left++;
                continue;
            }
            if (a[left] < a[right]) {
                z[i] = a[left];
                left++;
            } else {
                z[i] = a[right];
                right++;
            }
        }
        return z;
    }

    static int[] obmin(int[] a) {
        for (int p = 0; p < a.length; p++) {
            for (int i = p + 1; i < a.length; i++) {
                if (a[i] < a[p]) {
                    a[p] = a[p] + a[i];
                    a[i] = a[p] - a[i];
                    a[p] = a[p] - a[i];
                }
            }
        }
        return a;
    }

    public int[] vkl(int[] array)
    {
        for(int j = 1; j < array.length; j++){
            int key = array[j];
            int i = j -1;
            while ( i >= 0 && array[i] >key){
                array[i+1] = array[i];
                i--;
            }
            array[i+1] = key;
        }
        return array;
    }

    public static int[] choicesort(int[] numbers){
        for (int i = 0; i < numbers.length-1; i++)
        {
            int index = i;
            for (int j = i+1; j < numbers.length; j++)
                if (numbers[j] < numbers[index]) //Finds smallest number
                    index = j;

            int smallerNumber = numbers[index];  //Swap
            numbers[index] = numbers[i];
            numbers[i] = smallerNumber;

        }
        return numbers;
    }

    public static int[] quickSort(int [] array) {
        int startIndex = 0;
        int endIndex = array.length - 1;
        doSort(array, startIndex, endIndex);
        return  array;
    }

    private static void doSort(int[] array, int start, int end) {
        if (start >= end)
            return;
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (array[i] <= array[cur])) {
                i++;
            }
            while (j > cur && (array[cur] <= array[j])) {
                j--;
            }
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        doSort(array,start, cur);
        doSort(array,cur+1, end);
    }

}