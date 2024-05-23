package universidad.maraton;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del equipo:");
        String nombreEquipo = scanner.nextLine();
        
        System.out.println("Ingrese la universidad:");
        String universidad = scanner.nextLine();
        
        System.out.println("Ingrese el lenguaje de programación:");
        String lenguajeProgramacion = scanner.nextLine();
        
        EquipoProgramacion equipo = new EquipoProgramacion(nombreEquipo, universidad, lenguajeProgramacion, 0);
        
        try {
            for (int i = 0; i < EquipoConstantes.MAX_PROGRAMADORES; i++) {
                System.out.println("Ingrese el nombre del programador " + (i + 1) + ":");
                String nombre = scanner.nextLine();
                System.out.println("Ingrese el apellido del programador " + (i + 1) + ":");
                String apellido = scanner.nextLine();
                equipo.anadirProgramador(nombre, apellido);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Equipo creado: " + equipo);
        System.out.println("Programadores en el equipo:");
        for (String programador : equipo.listarProgramadores()) {
            System.out.println(programador);
        }

        scanner.close();
    }
}
