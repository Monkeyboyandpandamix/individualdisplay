package edu.guilford;


import java. util.ArrayList;
import java.util.Random;

import javafx.scene.paint.Color;
import javafx.scene.shape.Shape;

public class ShapeList extends ArrayList<Shape> {
   private Random random = new Random();
   private int width;
    private int height;

    public ShapeList(int width, int height) {
        super();
        this.width = width;
        this.height = height;

    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    // method to generate a random color
    public Color randomColor() {
        //generate a random value for red, green, blue, and Alpha(opacity)
        //each value is between 0.0 (transparent) and 1.0 (opaque)
        return new Color(random.nextDouble(), random.nextDouble(), random.nextDouble(),  random.nextDouble() *0.7 +0.3); //alpha value bettween 0.3 and 1.0

    }
    public void generateShapes(int numShapes) {
        this.clear(); //clear the list of shapes
        //generate a random number of shapes between 5 and 15
        //loop to create the specified numer of shapes of diffrent types
        for (int i = 0; i < numShapes; i++) {
            int shapeType = random.nextInt(3); //generate a random number between 0 and 2
            Shape shape = null;
            Color color = randomColor();
            //select what shape to create based on the random ShapeType
            switch (shapeType) {
                case 0:
                    double radius = random.nextInt(50) + 10; //generate a random radius between 10 and 60
                    double centerX = random.nextInt(width - (int) radius * 2) + radius; //generate a random x-coordinate
                    double centerY = random.nextInt(height - (int) radius * 2) + radius; //generate a random y-coordinate
                    shape = new javafx.scene.shape.Circle(centerX, centerY, radius, color);
                    break;
                case 1: //rectangle
                    double rectWidth = random.nextInt(50) + 10; //generate a random width between 10 and 60
                    double rectHeight = random.nextInt(50) + 10; //generate a random height between 10 and 60
                    double rectX = random.nextInt(width - (int) rectWidth); //generate a random x-coordinate
                    double rectY = random.nextInt(height - (int) rectHeight); //generate a random y-coordinate
                    shape = new javafx.scene.shape.Rectangle(rectX, rectY, rectWidth, rectHeight);
                    break;
                //case 2: //triangle 

            }
            {

            }
        }
    }
    }