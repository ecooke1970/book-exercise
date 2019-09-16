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
    private int pages;
    private String refNumber;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
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
     * Returns the number of pages
     */
    public int getPages()
    {
        return pages;
    }
    
    /**
     * Prints the author
     */
    public void printAuthor()
    {
        System.out.println("Author: " + author);
    }
    
    /**
     * Prints the title
     */
    public void printTitle()
    {
        System.out.println("Title: " + title);
    }
    
    /**
     * Prints out detailed information about the book
     */
    public void printDetails()
    {
        if (refNumber.length() > 0)
        {
        System.out.println("Title: " + title + ", Author: " + author + " , Pages: " + pages + " , Reference #: " + refNumber);
        }
        else
        {
        System.out.println("Title: " + title + ", Author: " + author + " , Pages: " + pages + " , Reference #: zzz");
        }
    }
    
    /**
     * Mutator that sets the refNumber variable
     */
    public void setRefNumber(String ref)
    {
        refNumber = ref;
    }
    
    /**
     * Returns the value of refNumber
     */
    public String getRefNumber()
    {
        return refNumber;
    }
    
}
