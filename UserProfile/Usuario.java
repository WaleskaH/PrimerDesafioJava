package UserProfile;

import java.time.LocalDate;
import java.time.Period;


public class Usuario {

    //Almacenamos los datos de los usuarios en las variables en atributos

    private String nombre;
    private String género;
    private  String trabajo;
    private String nacionalidad;
    private String sangreTipo;
    private LocalDate fechaNacimiento;

    //Se crea el constructor para que estos atributos puedan ser llamados por el main.

    public Usuario(String nombre, String género, String trabajo, String nacionalidad, String sangreTipo, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.género = género;
        this.trabajo = trabajo;
        this.nacionalidad = nacionalidad;
        this.sangreTipo = sangreTipo;
        this.fechaNacimiento = fechaNacimiento;
    }


    //Método para calcular edad

public int calcularEdad (){
        LocalDate hoy = LocalDate.now();
        return java.time.Period.between(fechaNacimiento, hoy).getYears();
    }


        //Creamos los métodos de comportamiento
        public void mostrarInformacion() {
            System.out.println("\n--DATOS DE USUARIO--");
            System.out.println("Nombre: " + nombre);
            System.out.println("Género: " + género);
            System.out.println("Trabajo: " + trabajo);
            System.out.println("Nacionalidad: " + nacionalidad);
            System.out.println("Tipo de Sangre: " + sangreTipo);
            System.out.println("Edad: " + calcularEdad() + " años");
        }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGénero() {
        return género;
    }

    public void setGénero(String género) {
        this.género = género;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getSangreTipo() {
        return sangreTipo;
    }

    public void setSangreTipo(String sangreTipo) {
        this.sangreTipo = sangreTipo;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}


