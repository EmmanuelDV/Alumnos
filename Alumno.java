public class Alumno {
    private String identificacion;
    private String nombre;
    private String apellidos;
    private String nota1;
    private String nota2;
    private int nota3;

    /**
     * Constructor
     */
    public Alumno()    {
        // Inicialización
        identificacion = "desconocido";
        nombre = "desconocido";
        apellidos = "desconocido";
        nota1 = "desconocido";
        nota2 = "desconocido";
        nota3 = 0;
    }

    //Metodos Modificadores//
    public void SetIdentificacion(String identificacion) {this.identificacion = identificacion;   }
    public void SetNombre(String nombre) {this.nombre = nombre; }
    public void SetApellidos(String apellidos) {this.apellidos = apellidos; }
    public void SetNota1(String Nota1) { this.nota1 = nota1; }
    public void SetNota2(String Nota2) {this.nota2 = nota2; }
    public void SetNota3(int Nota3) {this.nota3 = nota3; }

    // Metodos Analizador//
    public String getIdentificacion() {return identificacion; }
    public String getNombre() {return nombre; }
    public String getApellidos() { return apellidos; }
    public String getNota1() {return nota1; }
    public String getNota2() { return nota2;}
    public int getNota3() {return nota3;}
    public String getStringAlumno () {
        String mensaje = "Información actual de pasajero: \n";
        mensaje = mensaje + "Identificacion: " + this.getIdentificacion()+"\n";
        mensaje = mensaje + "Nombre: " + this.getNombre()+"\n";
        mensaje = mensaje + "Apellidos: " + this.getApellidos() + "\n";
        mensaje = mensaje + "Email: " + this.getNota1() + "\n";
        mensaje = mensaje + "Celular: " + this.getNota2() + "\n";
        mensaje = mensaje + "Edad: " + this.getNota3() + "\n";
        mensaje = mensaje + "\n\n\n";
        return mensaje;
    }
}
