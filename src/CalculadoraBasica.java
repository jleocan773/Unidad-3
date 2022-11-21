public class CalculadoraBasica {
    Integer suma(Integer a, Integer b) {
        return a+b;
    }
    Float suma(Integer a, Integer b, Float  c){return suma(a,b)+c;}; //Sobrecarga de método, mismo nombre con otros parámetros
    Integer resta(Integer a, Integer b) {return a-b;}
    Integer multiplicar(Integer a, Integer b) {return a*b;}
    Integer division(Integer a, Integer b) {return a/b;}
}
