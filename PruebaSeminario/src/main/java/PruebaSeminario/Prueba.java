package PruebaSeminario;

public class Prueba {
    public Prueba() {
        super();
    }
    
    public static String saludar(String nombre){
        return "Hola " + nombre;    
    }

    public static void main(String[] args) {
        Prueba prueba = new Prueba();
        System.out.print(saludar("Rubén"));
    }
}
