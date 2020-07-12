import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.io.*;

public class Menu {

    String dialogo;

    public Menu() {     }

    public int obtenerOpcionMenu() throws IOException {
        dialogo = "MENU DE REGISTRO DE ALUMNOS\n";
        dialogo += "1.  Insertar alumno\n";
        dialogo += "2.  Modificar alumno\n";
        dialogo += "3.  Listar los alumnos\n";
        dialogo += "4.  Eliminar alumno\n";
        dialogo += "5.  Salir\n";
        dialogo += "Escoja Opción:\n";
        return Integer.parseInt(JOptionPane.showInputDialog(dialogo));
    }

    public String obtenerCodAlumno() throws IOException {
        dialogo = "Introduzca código de alumno\n";
        return JOptionPane.showInputDialog(dialogo);
    }

    //Completamos aquí la petición de datos
    public String obtenerNombreAlumno() throws IOException {
        dialogo = "Introduzca Nombre del alumno\n";
        return JOptionPane.showInputDialog(dialogo);
    }

    public String obtenerApellidosAlumno() throws IOException {
        dialogo = "Introduzca Apellidos del alumno\n";
        return JOptionPane.showInputDialog(dialogo);
    }

    public String obtenerNota1() throws IOException {
        dialogo = "Introduzca nota 1 del alumno\n";
        return JOptionPane.showInputDialog(dialogo);
    }

    public String obtenerNota2() throws IOException {
        dialogo = "Introduzca nota 2 del alumno\n";
        return JOptionPane.showInputDialog(dialogo);
    }

    public int obtenerNota3() throws IOException {
        dialogo = "Introduzca nota 3 del alumno\n";
        return Integer.parseInt(JOptionPane.showInputDialog(dialogo));
    }
   
    public void mostrarMensaje (String mensaje) {
        JFrame frame = new JFrame("Mensaje");
        JOptionPane.showMessageDialog(frame, mensaje);
    }
   
    public void cerrarPrograma () {
        JFrame frame = new JFrame("Final del programa");
        JOptionPane.showMessageDialog(frame, "Gracias por usar este programa. Fin");
        System.exit(0);
    }
}
