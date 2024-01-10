
public class Ejemplo {

    public static void main(String[] args) {

        producte();
    }

    // Método que llama a tres funciones
    public static void producte() {

        nom();

        descripcio();

        preu();
    }

    // Primera función
    public static void nom() {
        System.out.println("nom producte");

    }

    // Segunda función
    public static void descripcio() {
        System.out.println("descripcio profucte:");

    }

    // Tercera función
    public static void preu() {
        System.out.println("preu producte");

    }
}
