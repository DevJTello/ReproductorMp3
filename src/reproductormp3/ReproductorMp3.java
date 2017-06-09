
package reproductormp3;

/**
 *
 * @author Javier E. Tello <devjtello@gmail.com>
 */
//JavaFX
import javafx.application.Application;
import javafx.stage.Stage;

public class ReproductorMp3 extends Application {

    //Sobrecarga del metodo start de la clase aplicacion
    @Override
    public void start(Stage primaryStage) {}
    
    //Metodo principal
    public static void main(String[] args) {
        //Se instancia el formulario frmReproductor
        frmReproductor Reproductor = new frmReproductor();
        //Se muestra el reproductor
        Reproductor.show();
    }
    
}
