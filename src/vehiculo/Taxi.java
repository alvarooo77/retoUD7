package vehiculo;

public class Taxi extends Turismo implements Calculable, Iniciable {
   // attibutes
   private static final double IMPORTE_INICIO = 2;
   private double kmRecorridos;
   private double importeKm;

   public Taxi(String marca, String modelo, String bastidor, int puertas, Asientos tipoAsiento,
         double kmRecorridos, double importeKm) {

      super(marca, modelo, bastidor, puertas, tipoAsiento);

      this.kmRecorridos = kmRecorridos;
      this.importeKm = importeKm;
   }

   public static double getImporteInicio() {
      return IMPORTE_INICIO;
   }

   public double getKmRecorridos() {
      return kmRecorridos;
   }

   public void setKmRecorridos(double kmRecorridos) {
      this.kmRecorridos = kmRecorridos;
   }

   public double getImporteKm() {
      return importeKm;
   }

   public void setImporteKm(double importeKm) {
      this.importeKm = importeKm;
   }

   @Override
   public String toString() {
      return super.toString()+"; Importe Km:"+this.importeKm+"; KmRecorridos:"+this.kmRecorridos+"Coste del trayecto:"s;
   }

   

   
}
