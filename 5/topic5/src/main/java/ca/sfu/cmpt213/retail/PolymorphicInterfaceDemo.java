package ca.sfu.cmpt213.retail;

public class PolymorphicInterfaceDemo
{
   public static void main(String[] args)
   {
      System.out.println(DvdMovie.owner);

      // Create a CompactDisc object.
      CompactDisc cd =
              new CompactDisc("Love Yourself", "BTS", 26.95);
      // Create a DvdMovie object.
      DvdMovie movie =
              new DvdMovie("Avengers Endgame", 195, 19.95);

      // Display the CD.
      System.out.println("Item #1: " + cd.getTitle());
      showPrice(cd);
      
      // Display the DVD's.
      System.out.println("Item #2: " + movie.getTitle());
      showPrice(movie);

   }

   /**
      The showPrice method displays the price
      of a RetailItem object.
      @param item A reference to a RetailItem object.
   */
   
   private static void showPrice(RetailItem item)
   {
      System.out.printf("Price: $%,.2f\n", item.getRetailPrice());
   }
}
