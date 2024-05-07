package vehiculo;

public class Autobus extends Vehiculo {
   // atributes
   private int numero;
   private int numParadas;

   // constructor
   public Autobus(String marca, String modelo, String bastidor, int puertas, int numero, int numParadas) {
      super(marca, modelo, bastidor, puertas);

      this.numero = numero;
      this.numParadas = numParadas;
   }

   public int getNumero() {
      return numero;
   }

   public void setNumero(int numero) {
      this.numero = numero;
   }

   public int getNumParadas() {
      return numParadas;
   }

   public void setNumParadas(int numParadas) {
      this.numParadas = numParadas;
   }

   @Override
   public String toString() {
      return (super.toString() + "; Numero:" + this.numero + "; Numero de paradas:" + this.numParadas);
   }

}
