package usuarioscesde;

public class Estudiante  extends  Usuario{
    private String carrera;

    // Constructores
    public Estudiante(){

    }

    public Estudiante(int id, String nombre, String apellido, String correo, String contraseña, String direccion, String telefono, String carrera) {
        super(id, nombre, apellido, correo, contraseña, direccion, telefono);
        this.carrera = carrera;
    }
    //gett and settl


    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
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
        this.apellido= sc.next();
        System.out.println("Ingrese su correo: ");
        this.correo=sc.next();
        System.out.println("Ingrese su contraseña: ");
        this.contraseña=sc.next();
        System.out.println("Ingrese su direccion: ");
        this.direccion= sc.next();
        System.out.println("Ingrese su telefono: ");
        this.telefono= sc.next();
        System.out.println("Ingrese la carrera de su interes");
        this.carrera=sc.nextLine();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void iniciarSesion() {
        super.iniciarSesion();
    }
}
