package edu.parcial1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class HelloApplication extends Application {
    private double xOffset;/** declaramos la variable del metodo movimiento x **/
    private double yOffset;/** declaramos la variable del metodo movimiento y **/
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("grafico.fxml"));

        /**Metodo de movimiento de la aplicacion**/
/**root.SetOnMousePressed(new EventenHadler<MouseEvent>(){
     @Override
    public void handle(MouseEvent){
    xOffset= event.getSceneX();
    yOffset= event.getSceneY();
  }
  }root.SetOnMouseDragged(new EventenHadler<MouseEvent>(){
        @Override
        public void handle(MouseEvent){
        primaryStage.setX(event.getScreenX()-xOffset);
        primaryStage.setY(event.getScreenY()-yOffset);


}
 **/

        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.initStyle(StageStyle.TRANSPARENT); // hacemos la parte trasparente.
        stage.setTitle("Formulario");

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}