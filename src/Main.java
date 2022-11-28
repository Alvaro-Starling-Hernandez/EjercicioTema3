public class Main {
    public static void main(String[] args) {
        sumar(10,5,9);
        Coche miCoche = new Coche();
        miCoche.sumarPuertas();
        System.out.println(miCoche.numeroPuertas);
    }

    public static void sumar(int a,int b, int c){
        System.out.println(a+b+c);
    }
}

class Coche {
    int numeroPuertas = 0;

    public void sumarPuertas(){
        this.numeroPuertas++;
    }
}