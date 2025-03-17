package edu.guilford;

import javafx.scene.layout.Pane;

public class ShapePane extends Pane {
    private ShapeList shapeList;


    public ShapePane(int width, int height) {
        super(); //call the constructor of the parent class (pane)
        //initialize the ShapeList with the specific width and height
        this.shapeList= new ShapeList(width, height);
        this.setPrefSize(width, height);
        this.setStyle("-fx-background-color: lightgray"); //optional background color
        }
        public ShapeList getShapeList() {
            return shapeList;
        }
        public void setShapeList(ShapeList shapeList) {
            this.shapeList = shapeList;
        }
        public void updateShapes() {
            this.getChildren().clear(); //clear exsisting shapes
            for (javafx.scene.shape.Shape shape : shapeList) {
                this.getChildren().add(shape); //add each shape to the pane
            }
        }
    }