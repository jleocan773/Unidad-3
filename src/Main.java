import java.lang.management.OperatingSystemMXBean;
public class Main {
    final static Integer a = 2;
    final static Integer b = 3;
    final static Float c = 2.5F;
    final static String OP = "suma";
    /**enum Operacion {
        suma, resta, division, multiplicar
     }
    */

    public static void main(String[] args) {
        CalculadoraBasica basica = new CalculadoraBasica();
     // Operacion operacionSeleccionada = Operacion.suma;

         if (OP == "suma") {
            System.out.println("La suma de " + a + " + " + b + " + " + c +" = " + basica.suma(a,b,c));
        } else if (OP == "resta") {
            System.out.println("La suma de " + a + " - " + b + " = " + basica.resta(a, b));
        } else if (OP == "division") {
            System.out.println("La suma de " + a + " / " + b + " = " + basica.division(a, b));
        } else if (OP == "multiplicar") {
            System.out.println("La suma de " + a + " * " + b + " = " + basica.multiplicar(a, b));
        }

        /** switch (operacionSeleccionada) {
            case suma:
                System.out.println("La suma de " + a + " + " + b + " = " + basica.suma(a, b));
                break;
            case resta:
                System.out.println("La suma de " + a + " - " + b + " = " + basica.resta(a, b));
                break;
            case division:
                System.out.println("La suma de " + a + " / " + b + " = " + basica.division(a, b));
                break;
            case multiplicar:
                System.out.println("La suma de " + a + " * " + b + " = " + basica.multiplicar(a, b));
                break;
        }
         */
    }
}
