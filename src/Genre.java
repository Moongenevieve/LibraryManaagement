import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Genre {
    private String name;
    private Map<String, Book> books;
    public Genre(String name){
        this.name = name;
        this.books = new HashMap<>();
    }
//add a book without author
    public void addBook(String bookname) {
        String author = "Unkwnown";
        if(!books.containsKey(bookname)) {
            books.put(bookname,new Book(bookname,author));
            System.out.println("You have added "+bookname+" to the "+ name + " genre.");
        }
        else {
            System.out.println("This book, " + bookname + ", already exists in the Library, genre: " + name);
        }
    }


    //add a book
    public void addBook(String bookname, String author) {
        if(!books.containsKey(bookname)) {
            books.put(bookname,new Book(bookname,author));
            System.out.println("You have added "+bookname+" to the "+ name + " genre.");
        }
        else {
            System.out.println("This book, " + bookname + ", already exists in the Library, genre: " + name);
        }
    }

    //remove book
    public void removeBooks(String bookname) {
        if(books.remove(bookname) != null) {
            System.out.println("You have removed "+bookname+" from the "+ name + " genre.");
        }
        else{
            System.out.println("We could not find "+bookname+" in the "+ name + " genre.");
        }
    }

    //listbooks
    public void listAllBook(){
        System.out.println("Books in "+ name +";");
        if(books.isEmpty()){
            System.out.println("Sorry, there are no books in this genre");
        } else {
            for(Book book: books.values()) {
                System.out.println("-------"+ book);
            }
        }
    }
}

/*
 books = new HashMap<>();
    for(Genre genre : Genre.values()) {
        books.put(genre,new ArrayList<>());
    }

*/