//Suponha que você esteja desenvolvendo um programa para representar um carro. 
//Escreva uma classe Carro que tenha um método ligar() que simplesmente imprime "Vrum vrum!".

class Car {
    
    public void Turnon(){ //Método Ligar
        System.out.println("Vrum Vrum!");
    }

    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.Turnon();
    }
}
