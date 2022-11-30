public class Persona {
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private Integer edad;
    public String esMayorEdad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
        if (edad >= 18) {
            this.esMayorEdad = "Sí";
        } else this.esMayorEdad = "No";
    }
    Persona(){
        nombre = "Anónimo";
        primerApellido = "Fulanito";
        segundoApellido = "Fulanito";
        edad = 18;
    }
    Persona(String nombre, String primerApellido){
        this.nombre = "Francisco";
        this.primerApellido = "Gómez";
    }
    public void NombreCompleto(){
        System.out.println(nombre + " " + primerApellido + " " + segundoApellido);
    }
    public void NombreIniciales(){
        System.out.println(nombre.charAt(0) + " " + primerApellido.charAt(0) + " " + segundoApellido.charAt(0));
    }
}


