package usuarioscesde;

public class Estudiante  extends  Academico {
    private String programa;

    // Constructores
    public Estudiante() {

    }

    public Estudiante(int id, String nombre, String apellido, String correo, String contraseña, String direccion, String telefono, String programa) {
        super(id, nombre, apellido, correo, contraseña, direccion, telefono);
        this.programa = programa;
    }
    //gett and settl


    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }
    //metodos

    @Override
    public void registrarUsuario() {
        System.out.println("soy el estudiante ");
        System.out.println("Ingrese su ID: ");
        this.id = sc.nextInt(); // this es un operador que hace referencia a las variables
        System.out.println("Ingrese su Nombre : ");
        this.nombre = sc.next();
        System.out.println("Ingrese su apellido: ");
        this.apellido = sc.next();
        System.out.println("Ingrese su correo: ");
        this.correo = sc.next();
        System.out.println("Ingrese su contraseña: ");
        this.contraseña = sc.next();
        System.out.println("Ingrese su direccion: ");
        this.direccion = sc.next();
        System.out.println("Ingrese su telefono: ");
        this.telefono = sc.next();
        System.out.println("Ingrese la carrera de su interes");
        this.programa = sc.next();
    }


    @Override
    public void imprimirUsuario() {
        super.imprimirUsuario();

    }
}
