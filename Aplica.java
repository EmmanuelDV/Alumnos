import java.util.List;
import java.util.ArrayList;
import java.io.*;
import java.util.Iterator;

public class Aplica {

    public static void main (String[] Args) throws IOException {

        int opcionEligeUsuario = 0;
        List <Alumno> listaDeAlumnos = new ArrayList<Alumno> ();
        Menu opcionesUsuario = new Menu();
        Menu mensajeVent = new Menu();

        while (opcionEligeUsuario != 5 ) {

            opcionEligeUsuario = opcionesUsuario.obtenerOpcionMenu();

            //Registrar la información de alumno opción 1
            if (opcionEligeUsuario == 1) {

                Alumno tmpAlumno = new Alumno();
                tmpAlumno.SetIdentificacion(opcionesUsuario.obtenerCodAlumno());
                tmpAlumno.SetNombre(opcionesUsuario.obtenerNombreAlumno());
                tmpAlumno.SetApellidos(opcionesUsuario.obtenerApellidosAlumno());
                tmpAlumno.SetNota1(opcionesUsuario.obtenerNota1());
                tmpAlumno.SetNota2(opcionesUsuario.obtenerNota2());
                tmpAlumno.SetNota3(opcionesUsuario.obtenerNota3());
                //Terminamos guardando el objeto alumno
                listaDeAlumnos.add(tmpAlumno);
            }
            //Fin opción 1 registro información de alumno

            //Modificar la información de un alumno opción 2
            if (opcionEligeUsuario == 2) {
                String identAlumnoBuscado = opcionesUsuario.obtenerCodAlumno();
                boolean AlumnoEncontrado = false;

                Iterator<Alumno> it = listaDeAlumnos.iterator();
                Alumno tmpAnalizando;

                while ( it.hasNext() ) {           //Utilizamos el método hasNext de los objetos tipo Iterator

                    tmpAnalizando = it.next();                //Utilizamos el método next de los objetos tipo Iterator

                    if (tmpAnalizando.getIdentificacion().equals(identAlumnoBuscado) ) {
                        AlumnoEncontrado = true;
                        String mensaje = tmpAnalizando.getStringAlumno();
                        mensaje = mensaje + "\n\n\n";
                        mensaje = mensaje + "A continuación introduzca nuevos datos para este alumno";

                        mensajeVent.mostrarMensaje(mensaje);

                        // Aquí código para pedir nuevos datos para el alumno

                        mensajeVent.mostrarMensaje("La identificación no puede ser modificada, indique resto de datos");
                        tmpAnalizando.SetNombre(opcionesUsuario.obtenerNombreAlumno());
                        tmpAnalizando.SetApellidos(opcionesUsuario.obtenerApellidosAlumno());
                        tmpAnalizando.SetNota1(opcionesUsuario.obtenerNota1());
                        tmpAnalizando.SetNota2(opcionesUsuario.obtenerNota2());
                        tmpAnalizando.SetNota3(opcionesUsuario.obtenerNota3());

                        mensaje = tmpAnalizando.getStringAlumno();
                        mensajeVent.mostrarMensaje(mensaje);

                    } else { }    //else vacío. No hay acciones a ejecutar.

                } //Cierre del while

                if (AlumnoEncontrado == false) {
                    mensajeVent.mostrarMensaje("No se encontró el alumno con esa identificación");
                }
            } //Fin opción 2 registro información de alumno

            //Opción 3 listar alumnos
            if (opcionEligeUsuario == 3) {

                String listado = "";

                Iterator<Alumno> it2 = listaDeAlumnos.iterator();
                Alumno tmpAnalizando;

                while ( it2.hasNext() ) {           //Utilizamos el método hasNext de los objetos tipo Iterator
                    tmpAnalizando = it2.next();                //Utilizamos el método next de los objetos tipo Iterator
                    listado = listado + tmpAnalizando.getStringAlumno();
                    listado = listado + "\n\n\n";
                } //Cierre del while

                mensajeVent.mostrarMensaje(listado);

            } //Fin opción 3 listar alumnos

            //Eliminar un alumno opción 4
            if (opcionEligeUsuario == 4) {
                String identAlumnoBuscado = opcionesUsuario.obtenerCodAlumno();
                boolean AlumnoEncontrado = false;

                Iterator<Alumno> it = listaDeAlumnos.iterator();
                Alumno tmpAnalizando;

                while ( it.hasNext() && AlumnoEncontrado==false ) {           //Utilizamos el método hasNext de los objetos tipo Iterator

                    tmpAnalizando = it.next();                //Utilizamos el método next de los objetos tipo Iterator

                    if (tmpAnalizando.getIdentificacion().equals(identAlumnoBuscado) ) {
                        AlumnoEncontrado = true;
                        String mensaje = tmpAnalizando.getStringAlumno();
                        mensaje = mensaje + "\n\n\n";
                        mensaje = mensaje + "Se procede al borrado de datos de este alumno\n\n";

                        mensajeVent.mostrarMensaje(mensaje);

                        // Aquí código para pedir nuevos datos para el alumno
                        listaDeAlumnos.remove(tmpAnalizando);
                        AlumnoEncontrado=true;

                    } else { }    //else vacío. No hay acciones a ejecutar.

                } //Cierre del while

                if (AlumnoEncontrado == false) {
                    mensajeVent.mostrarMensaje("No se encontró el alumno con esa identificación");
                }
            } //Fin opción 2 registro información de alumno

        }

        opcionesUsuario.cerrarPrograma();

    } //Cierra main

} //Cierra clase
