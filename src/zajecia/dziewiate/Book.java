package zajecia.dziewiate;

/**
 * Created by m.losK on 2017-02-11.
 */
public class Book {
    private String title;
    private Author author;
    private int numberOfPages;
    private int realaseDate;
    private String description;
    private String category;
    private String[] contents;

    public Book(String title, Author author, int realaseDate, String[] contents) {
        this.title = title;
        this.author = author;
        this.realaseDate = realaseDate;
        this.contents = contents;
        this.numberOfPages = contents.length;
    }

    public Book(String title, Author author, int realaseDate, String description, String category, String[] contents) {
        this(title, author, realaseDate, contents);
        this.description = description;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getRealaseDate() {
        return realaseDate;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public String[] getContents() {
        return contents;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPage(int index) {
        int actualIndex = index - 1;
        this.numberOfPages = index;
        return (actualIndex >= 0 && actualIndex < this.numberOfPages
                ? contents[actualIndex] : "Niepoprawna liczba strony!");
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", realaseDate=" + realaseDate +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
