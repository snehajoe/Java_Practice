package april6;

public class Book {
    String name, author, genre;
    int year;
    double price;

    public Book(String name, String author, String genre, int year){
        this.name= name;
        this.author= author;
        this.genre= genre;
        this.year= year;
        price= 500.0;
    }
    public void bookInfo(){
        System.out.println("Name of the book    : "+name);
        System.out.println("Name of the author  : "+author);
        System.out.println("Genre of the book   : "+genre);
        System.out.println("Year of publication : "+year);
        System.out.println("Price of the book   : "+price);
    }
}
