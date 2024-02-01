class Quadrado {

    private int lado;

    Quadrado (int lado){
        this.lado = lado;
    }
//Metodo para definir o lado do quadrado
    public int getlado(){
        return lado;
    }
//Metodo para definir o lado do quadrado
    public void setLado(int lado){
        this.lado = lado;
    }
//Metodo para calcular a area do quadrado
    public double calcularArea (){
        return lado * lado;
    }

    public static void main(String[] args) {
//teste da classe do quadrado
       Quadrado quadrado1 = new Quadrado(25);//criando um quadrado 
       System.out.println("Valor do lado do quadrado: "  + quadrado1.getlado());//Deve imprimir 25
       System.out.println("Área do quadrado: " + quadrado1.calcularArea());//Deve imprimir 625
       
       quadrado1.setLado(23);
       System.out.println("Novo lado do quadrado: " + quadrado1.getlado()); //Deve imprimir 23
       System.out.println("Nova área do quadrado " + quadrado1.calcularArea()); //Deve imprimir 529
}

}
