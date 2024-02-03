//Implemente uma classe Livro em Java que tenha os seguintes atributos públicos: 
//titulo, autor e anoDePublicacao. Em seguida, na função main, crie um objeto dessa 
//classe e atribua valores a esses atributos. Imprima os valores desses atributos na tela.


class Book {
    
    public String Title;
    public String Author;
    public int yearofpublication;


    public Book(String Title, String Author, int yearofpublication) {
       this.Title = Title;
       this.Author = Author;
       this.yearofpublication = yearofpublication;
    }

    public static void main(String[] args) {
        
        Book myBook = new Book ("Titanic","Rupert Matthews",1898);

        System.out.println("Title of book: " + myBook.Title); //Tem que imprimir Titanic
        System.out.println("Author of Book: " + myBook.Author); //Tem que imprimir Rupert Matthews
        System.out.println("Year of Publication " + myBook.yearofpublication); //Tem que imprimir 1898
    }
}
