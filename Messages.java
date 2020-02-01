//********************************************************************
//  Messages.java       Author: Lewis/Loftus
//
//  Demonstrates the use of an overridden method.
//********************************************************************

public class Messages
{
   //-----------------------------------------------------------------
   //  Instatiates two objects a invokes the message method in each.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      Thought thinking = new Thought();
      Advice speaking = new Advice();

      thinking.message();

      speaking.message();  // overridden
   }
}
