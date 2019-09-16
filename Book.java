/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Erik Cooke)
 * @version (09/16/2019)
 */
public class Book
{
     // The fields.
    private String author;
    private String title;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
    }
    
    /**
     * Returns the name of the author
     */ 
    public String getAuthor()
    {
        return author;
    }
    
    /**
     * Returns the title of the book
     */ 
    public String getTitle()
    {
        return title;
    }
    
    /**
     * Prints the author
     */
    public void printAuthor()
    {
        System.out.println("The author is: " + author);
    }
    
    /**
     * Prints the title
     */
    public void printTitle()
    {
        System.out.println("The title is: " + title);
    }
}
