package org.ieslosremedios.daw1.prog.util;

public class CalculadoraBasica {
    public static Integer suma(Integer a, Integer b) {
        return a+b;
    }
    public static Float suma(Integer a, Integer b, Float  c){return suma(a,b)+c;}; //Sobrecarga de método, mismo nombre con otros parámetros
    public static Integer resta(Integer a, Integer b) {return a-b;}
    public static Integer multiplicar(Integer a, Integer b) {return a*b;}
    public static Integer division(Integer a, Integer b) {return a/b;}
    public static Integer mayor (Integer a, Integer b){
        if (a > b) return a;
        else return b;
    }
    public static Integer mayor (Integer a, Integer b, Integer c) {
        if (a > b && a > c) return a;
        else if (b > a && b > c) return b;
        else return c;
    }
}
