//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Genre fiction = new Genre("Fiction");
        Genre nonFiction = new Genre("Non-Fiction");

        //add books
        fiction.addBook("The Great Gatsby","F. Scott Fitzgerald");
        fiction.addBook("The Lord of the rings","J.R.R. Tolkien");
        fiction.addBook("The Hobbit", "J.R.R. Tolkien");
        nonFiction.addBook("Oppenheimer");
        fiction.addBook("Jane Eyre", "Charlotte Bronte");
        nonFiction.addBook("Becoming","Michelle Obama");
        nonFiction.addBook("Purple Hibiscus","Chimamanda Aditchie");
        nonFiction.addBook("Outliers","Malcolm Gladwell");

        fiction.listAllBook();
        nonFiction.listAllBook();
        fiction.removeBooks("The Great Gatsby");
        nonFiction.removeBooks("Becoming");
        fiction.removeBooks("Oppenheimereee");
        nonFiction.removeBooks("Becomingeeee");

    }
}