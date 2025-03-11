package Interface_Animal;

public class MainAnimal {

    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        Pato pato = new Pato();
        Galo galo = new Galo();
        
        System.out.println("Cachorro: " + cachorro.emitirSom() + " - " + cachorro.comer());
        System.out.println("Gato: " + gato.emitirSom() + " - " + gato.comer());
        System.out.println("Pato: " + pato.emitirSom() + " - " + pato.comer());
        System.out.println("Galo: " + galo.emitirSom() + " - " + galo.comer());
    }
}

