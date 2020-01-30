package Work2;

public class Novel extends Book
{
    public Novel(String title, int pages, String author, String datePublished, String hasPictures)
    {
        super(title, pages, author, datePublished, hasPictures);
    }

    //toString method
    public String toString()
    {
        String output = "Type of Book: Novel\n" + super.toString();

        return output;
    }
}
