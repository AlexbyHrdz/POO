package usuarioscesde;

public class Profesor extends Academico{

    private String curso;

    public Profesor() {
        this.curso = curso;
    }

    public Profesor(int id, String nombre, String apellido, String correo, String contraseña, String direccion, String telefono, String curso) {
        super(id, nombre, apellido, correo, contraseña, direccion, telefono);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public void registrarUsuario() {
        super.registrarUsuario();
        System.out.println("Agregue la escuela: ");
        escuela=sc.next();
        System.out.println("Agregue el curso: ");
        curso = sc.next();
    }

    @Override
    public void imprimirUsuario() {
        super.imprimirUsuario();
        System.out.println("Escuela: "+escuela+"\n" +
                "Curso: "+curso);
    }
}
