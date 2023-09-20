package usuarioscesde;

public class Academico extends Usuario {

    //Variables
    protected String escuela;



    //Constructores
    public Academico() {
    }

    public Academico(int id, String nombre, String apellido, String correo, String contraseña, String direccion, String telefono) {
        super(id, nombre, apellido, correo, contraseña, direccion, telefono);
        this.escuela = escuela;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }
}
