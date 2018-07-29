package iterator;

public class Client {
    public static void main(String[] args) {
        BooksCollection booksCollection = new BooksCollection();
        Iterator bookIterator = booksCollection.iterator();
        while (bookIterator.hasNext())
            System.out.println(bookIterator.next());
    }
}
