package books.table;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by user on 05.01.2016.
 */
@Entity
@Table(name = "book_authors")
public class BookAuthor implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @JoinColumn(name = "book_id")
    @ManyToOne
    private Book book;
    @JoinColumn(name = "author_id")
    @ManyToOne
    private Author author;

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
