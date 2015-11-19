
package pkgsuper.los.pibes;
import Interfaces.Principal;
import Seguridad.Archivo;
import java.io.File;

public class SuperLosPibes {

    public static void main(String[] args) {
        Archivo.inicializarTodo(); 
        Principal menu = new Principal();
        menu.setVisible(true);
    } 
}
