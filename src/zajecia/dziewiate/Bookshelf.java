package zajecia.dziewiate;

import zajecia.osme.Zajecia8;

import java.util.ArrayList;

/**
 * Created by m.losK on 2017-02-11.
 */
public class Bookshelf {
    private ArrayList<Book> books;

    public Bookshelf() {
        this.books = new ArrayList<>();
    }

    public Book get(int index) {
        if (index >= 0 && index < books.size()) {
            return books.get(index);
        }
        return null;

    }

    public void add(Book book) {
        this.books.add(book);
    }

    public ArrayList<Book> getBooksOf(String author) {
        author = author.toLowerCase();
        ArrayList<Book> booksTmp = new ArrayList<>();
        for (Book book : books) {
            Author authorOfBook = book.getAuthor();
            String firstNameAuthorOfBook = authorOfBook.getFirstName().toLowerCase();
            String lastNameAuthorOfBook = authorOfBook.getLastName().toLowerCase();

            boolean searchRequirement =
                    firstNameAuthorOfBook.startsWith(author) ||
                            lastNameAuthorOfBook.startsWith(author) ||
                            (lastNameAuthorOfBook + " " + firstNameAuthorOfBook).startsWith(author) ||
                            authorOfBook.toString().toLowerCase().startsWith(author);       //if FirstName + " " + lastName

            if (searchRequirement) {
                booksTmp.add(book);
            }
        }
        return booksTmp;
    }

    public ArrayList<Book> getBooksFrom(int realaseDate) {
        ArrayList<Book> booksTmp = new ArrayList<>();
        for (Book book : books) {
            if (book.getRealaseDate() == realaseDate) {
                booksTmp.add(book);
            }
        }
        return booksTmp;
    }

    public ArrayList<Book> getBooksSince(int realaseDate) {
        ArrayList<Book> booksTmp = new ArrayList<>();
        for (Book book : books) {
            if (book.getRealaseDate() >= realaseDate) {
                booksTmp.add(book);
            }
        }
        return booksTmp;
    }

    public ArrayList<Book> getBooksLongerThan(int numberOfPages) {
        ArrayList<Book> booksTmp = new ArrayList<>();
        for (Book book : books) {
            if (book.getNumberOfPages() >= numberOfPages) {
                booksTmp.add(book);
            }
        }
        return booksTmp;
    }
}
