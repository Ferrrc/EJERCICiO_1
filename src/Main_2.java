public class Main_2 {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.AgregarPuerta();
        miCoche.AgregarPuerta();
        System.out.println(miCoche.puerta);
    }
}

class Coche {
    public int puerta = 4;

    public void AgregarPuerta() {
        this.puerta++;
    }
}