//Suponha que você esteja criando um programa para representar um cachorro. 
//Escreva uma classe Cachorro que tenha um método latir() que simplesmente imprime "Au au!".


class Dog {
    
    public void Bark(){ //Método Latir 
        System.out.println("Au Au!");
    }

    public static void main(String[] args) {
        Dog myDog = new Dog();

        myDog.Bark();
    }
}
