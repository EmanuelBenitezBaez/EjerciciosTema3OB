
/*
Primera parte:
Crear una función con tres parámetros que sean números que se suman entre sí.
Llamar a la función en el main y darle valores.
Segunda parte:
Genere una clase coche.
Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
Una función que incremente el número de puertas que tiene el coche.
Generar un objeto miCoche en el main y añadirle una puerta.
Mostrar el número de puertas que tiene el objeto.
 */


public class Main {

    public static void main(String[] args) {
        int resultado;
        resultado=suma(10,10,10);
        System.out.println(resultado);
        Coche miCoche = new Coche();
        miCoche.IncrementarPuertas();
        System.out.println(miCoche.puerta);
}
    public static int suma(int a,int b,int c){
        return a+b+c;
    }


      }


class Coche{
    public int puerta=2;

    public  void IncrementarPuertas(){
        this.puerta++;
    }

}
