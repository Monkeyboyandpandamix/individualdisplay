package edu.guilford;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


/**
 * JavaFX App
 */
public class IndividualDisplay extends Application {

    private static Scene scene;

    // Each JavaFX application provides a Stage, a window for the application
    @Override
    public void start(Stage stage) throws IOException {

        // create an instance of the IndividualPane class
        // IndividualPane is a container for the UI elements
        IndividualPane iPane = new IndividualPane();
        // The scene hold a container (a Pane or a Group, usually)
        scene = new Scene(loadFXML("control"), 640, 480);
        stage.setScene(scene);
        stage.show();


        //lets build a new stage/scene with ShapePane
        // and sset it as the root of the scene
        Stage shapeStage = new Stage();
        shapeStage.setTitle("Shapes");
        ShapePane sPane = new ShapePane(640, 480);
        //instanciate a shapelist and generate shapes
        ShapeList shapeList = new ShapeList(640, 480);
        shapeList.generateShapes(10);
        sPane.setShapeList(shapeList);
        shapeList.updateShapes(); //update the 
        Scene shapeScene = new Scene(sPane, 640, 480);
        shapeStage.setScene(shapeScene);
        shapeStage.show();

    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(IndividualDisplay.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}