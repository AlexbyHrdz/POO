package usuarioscesde;

import java.util.Scanner;

public class Programa {
    Scanner sc = new Scanner(System.in);

    private  int idPrograma;
    private String nombrePrograma;
    private int duracionPrograma;
    private String registroGo;
    private String escuela;
   //constructores
    public Programa(){}

    public Programa(Scanner sc, int idPrograma, String nombrePrograma, int duracionPrograma, String registroGo, String escuela) {
        this.sc = sc;
        this.idPrograma = idPrograma;
        this.nombrePrograma = nombrePrograma;
        this.duracionPrograma = duracionPrograma;
        this.registroGo = registroGo;
        this.escuela = escuela;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public int getIdPrograma() {
        return idPrograma;
    }

    public void setIdPrograma(int idPrograma) {
        this.idPrograma = idPrograma;
    }

    public String getNombrePrograma() {
        return nombrePrograma;
    }

    public void setNombrePrograma(String nombrePrograma) {
        this.nombrePrograma = nombrePrograma;
    }

    public int getDuracionPrograma() {
        return duracionPrograma;
    }

    public void setDuracionPrograma(int duracionPrograma) {
        this.duracionPrograma = duracionPrograma;
    }

    public String getRegistroGo() {
        return registroGo;
    }

    public void setRegistroGo(String registroGo) {
        this.registroGo = registroGo;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }
    //metodos

    public void crearPrograma(){
        System.out.println("Ingrese ID Programa: ");
        idPrograma=sc.nextInt();
        System.out.println("Ingrese Nombre del programa: ");
        nombrePrograma=sc.next();
        System.out.println("Ingrese Duraccion del programa: ");
        duracionPrograma=sc.nextInt();
        System.out.println("Ingrese el registro gov: ");
        registroGo=sc.next();
        System.out.println("Ingrese la escuela ");
        escuela=sc.next();
    }

    public void imprimirPrograma(){
        System.out.println("Id de programa: " +idPrograma+ "\n" +
                "Nombre de programa: " +nombrePrograma+"\n" +
                "Duraccion de programa: "+duracionPrograma+"\n" +
                "El registrogov :"+registroGo + "\n" +
                "Escuela: " +escuela+ "\n");
    }
}
