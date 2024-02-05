class Carro {

        private String brand;
        private String model;
        private int yearofmanufacture;
        private int speedCar;

    Carro (String brand, String model, int yearofmanufacture, int speedCar){
        this.brand = brand;
        this.model = model;
        this.yearofmanufacture = yearofmanufacture;
        this.speedCar = speedCar;
    }

    void TurnOnCar(){
        System.out.println("CARRO LIGADO");
    }
    void TurnOffCar(){
        System.out.println("CARRO DESLIGADO");
    }
    void SpeedUpCar(int acceleration){
        speedCar += acceleration;
    }
    void BrakeCar(int brake){
        speedCar -= brake;
    }
    public String HonkCar(){
        return ("Bi bi!");
    }

    public static void main(String[] args) {
        
        Carro car = new Carro ("Porshe", "911", 2023, 250);

        System.out.println("Brand of Car: " + car.brand); //Deverá imprimir Porshe
        System.out.println("Model of Car: " + car.model); //Deverá imprimir 911
        System.out.println("Year of manufacture: " + car.yearofmanufacture); //Deverá imprimir 2023
        
        car.BrakeCar(50); // COMANDO PARA O CARRO FREIAR
        System.out.println("Speed of Car: " + car.speedCar + " KM/H"); //Deverar Imprimir 200

        car.SpeedUpCar(100); // COMANDO PARA O CARRO ACELERAR
        System.out.println("Speed of Car: " + car.speedCar + " KM/H"); // DEVERAR IMPRIMIR 300

        car.TurnOnCar(); //Deverá Imprimir CARRO LIGADO
        car.TurnOffCar(); //Deverá Imprimir CARRO DESLIGADO
        System.out.println(car.HonkCar()); //DEVERÁ IMPRIMIR BI BI!
    }
}
