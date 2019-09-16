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
    private int borrowed;

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
        borrowed = 0;
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
        System.out.println("Title: " + title + ", Author: " + author + " , Pages: " + pages + " , Times borrowed: " + borrowed + " , Reference #: " + refNumber);
        }
        else
        {
        System.out.println("Title: " + title + ", Author: " + author + " , Pages: " + pages + " , Times borrowed: " + borrowed + " , Reference #: zzz");
        }
    }
    
    /**
     * Mutator that sets the refNumber variable
     */
    public void setRefNumber(String ref)
    {
        if(ref.length() > 2)
        {
            refNumber = ref;
        }
        else
        {
            System.out.println("The reference number must be at least 3 characters");
        }
    }
    
    /**
     * Returns the value of refNumber
     */
    public String getRefNumber()
    {
        return refNumber;
    }
    
    /**
     * Increments the borrowed field
     */
    public void borrow()
    {
        borrowed ++;
    }
    
    /**
     * Returns the value of borrowed
     */
    public int getBorrowed()
    {
        return borrowed;
    }
    
}
