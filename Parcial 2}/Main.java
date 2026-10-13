import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Registro de Estudiante ");
        System.out.print("Nombre: ");
        String nombreEst = scanner.nextLine();
        System.out.print("Edad: ");
        int edadEst = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Documento: ");
        String docEst = scanner.nextLine();
        System.out.print("Programa: ");
        String progEst = scanner.nextLine();
        System.out.print("Promedio: ");
        double promEst = scanner.nextDouble();
        scanner.nextLine(); 

        Estudiante estudiante = new Estudiante(nombreEst, edadEst, docEst, progEst, promEst);

        System.out.println("\n Registro de Profesor ");
        System.out.print("Nombre: ");
        String nombreProf = scanner.nextLine();
        System.out.print("Edad: ");
        int edadProf = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Documento: ");
        String docProf = scanner.nextLine();
        System.out.print("Area: ");
        String areaProf = scanner.nextLine();
        System.out.print("Salario Base: ");
        double salProf = scanner.nextDouble();
        System.out.print("Horas Catedra: ");
        int horasProf = scanner.nextInt();

        Profesor profesor = new Profesor(nombreProf, edadProf, docProf, areaProf, salProf, horasProf);

        System.out.println("\n Perfil del " + estudiante.getRol() + " ");
        estudiante.mostrarInfo();
        
        System.out.println("\n Perfil del " + profesor.getRol() + " ");
        profesor.mostrarInfo();
        System.out.println("Salario Total Calculado: $" + profesor.calcularSalario());

        scanner.close();
    }
}