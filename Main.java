import java.time.LocalDate;
import java.util.Scanner;
import UserProfile.Usuario;


public class Main {
    public static void main(String[] args) {


        //Crear la instancia scaneer
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese su Género: ");
        String genero = scanner.nextLine();

        System.out.println("Ingrese su trabajo: ");
        String trabajo = scanner.nextLine();


        System.out.println("Ingrese su Nacionalidad: ");
        String nacionalidad = scanner.nextLine();

        System.out.println("¿Cuál es su tipo de sangre: ");
        String sangreTipo = scanner.nextLine();

        System.out.println("Año de Nacimiento: ");
        int año = scanner.nextInt();

        System.out.println("Mes de Nacimiento (1-12): ");
        int mes = scanner.nextInt();

        System.out.println("Día de Nacimiento: ");
        int dia = scanner.nextInt();
        scanner.nextLine();

        LocalDate fechaNacimiento = LocalDate.of(año, mes, dia);


        Usuario usuario = new Usuario(nombre, genero, trabajo, nacionalidad, sangreTipo, fechaNacimiento);
        usuario.mostrarInformacion();
        usuario.calcularEdad();



    }
}