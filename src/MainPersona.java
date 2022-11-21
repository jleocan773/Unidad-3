import java.sql.SQLOutput;

public class MainPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();

        persona1.setNombre("Manuel");
        System.out.println("Nombre: " + persona1.getNombre());
        persona1.setPrimerApellido("Perez");
        System.out.println("Primer Apellido: "  + persona1.getPrimerApellido());
        persona1.setSegundoApellido("Rodriguez");
        System.out.println("Segundo Apellido: " + persona1.getSegundoApellido());
        persona1.setEdad(22);
        System.out.println("Edad: " + persona1.getEdad());
        System.out.println("¿Es mayor de edad?: " + persona1.esMayorEdad + "\n");

        System.out.println("Nombre: " + persona2.getNombre());
        System.out.println("Primer Apellido: "  + persona2.getPrimerApellido());
        System.out.println("Segundo Apellido: " + persona2.getSegundoApellido());
        persona2.setEdad(15);
        System.out.println("Edad: " + persona2.getEdad());
        System.out.println("¿Es mayor de edad?: " + persona2.esMayorEdad + "\n");

        Persona persona3 = new Persona("Fran", "Gomez");

        System.out.println("Nombre: " + persona3.getNombre());
        System.out.println("Primer Apellido: "  + persona3.getPrimerApellido());
        System.out.println("Segundo Apellido: " + persona3.getSegundoApellido());
        persona3.setEdad(18);
        System.out.println("Edad: " + persona3.getEdad());
        System.out.println("¿Es mayor de edad?: " + persona3.esMayorEdad + "\n");

        Persona persona4 = new Persona("Fran", "Gomez");

        System.out.println("Nombre: " + persona4.getNombre());
        System.out.println("Primer Apellido: "  + persona4.getPrimerApellido());
        System.out.println("Segundo Apellido: " + persona4.getSegundoApellido());
        persona4.setEdad(20);
        System.out.println("Edad: " + persona4.getEdad());
        System.out.println("¿Es mayor de edad?: " + persona4.esMayorEdad);
        }
    }

