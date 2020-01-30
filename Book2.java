//********************************************************************
//  Book2.java       Author: Lewis/Loftus
//
//  Represents a book. Used as the parent of a dervied class to
//  demonstrate inheritance and the use of the super reference.
//********************************************************************

public class Book2
{
   protected int pages;

   //----------------------------------------------------------------
   //  Sets up the book with the specified number of pages.
   //----------------------------------------------------------------
   public Book2 (int numPages)
   {
      pages = numPages;
   }

   //----------------------------------------------------------------
   //  Prints a message about the pages of this book.
   //----------------------------------------------------------------
   public void pageMessage ()
   {
      System.out.println ("Number of pages: " + pages);
   }
}