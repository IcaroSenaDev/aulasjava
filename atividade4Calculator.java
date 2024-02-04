//Você está criando uma calculadora básica. Escreva uma classe Calculadora 
//que tenha um método somar(int a, int b) que retorna a soma dos dois números 
///passados como parâmetro.

class Calculator {
    
    public int Sum ( int a, int b){ //Um metodo que vai retornar a soma de A + B
        return a + b;
    }

    public static void main(String[] args) {
        
        Calculator calculator = new Calculator();

        int result = calculator.Sum(4, 5);//Adicionando o metodo resultado para armazenar o metodo somar
        System.out.println("Result of Sum: " + result); //Terá que imprimir 9
    }

}
