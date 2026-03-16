package br.com.alura.screenmatch.desafiosObjetosDistintos.desafio2;

public class PrincipalDesafio2 {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("Canis lupus", "Pug", "João", 2);
        Cachorro cachorro2 = new Cachorro("Canis lupus", "Beagle", "Fifi", 4);
        Cachorro cachorro3 = new Cachorro("Canis lupus", "Pug", "tom", 3);

        if (cachorro1 instanceof Cachorro cachorro){
            Animal animal = (Animal) cachorro1;

            System.out.println("Fazendo casting: " +  animal);
        }



    }
}
