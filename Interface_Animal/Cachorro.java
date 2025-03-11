package Interface_Animal;

public class Cachorro implements Animal{
    public String emitirSom(){
        return "Au au";
    }

    public String comer(){
        return "Ração";
    }
}
