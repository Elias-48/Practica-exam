public class Coche implements Vehiculo {
 private int velocidad;
 public Coche() {
 this.velocidad = 0;
 }
 @Override
 public void acelerar(int incremento) {
 velocidad += incremento;
 System.out.println("Coche acelerado a " + velocidad + " km/h");
 }
 @Override
 public void frenar(int decremento) {
 velocidad -= decremento;
 if (velocidad < 0) velocidad = 0;
 System.out.println("Coche frenado a " + velocidad + " km/h");
 }
 @Override
 public int obtenerVelocidad() {
 return velocidad;
 }
}
