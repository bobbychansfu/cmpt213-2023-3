
/**
   Compact Disc class
*/

public class CompactDisc extends RetailItem
{
   private String title;       // The CD's title
   private String artist;      // The CD's artist
   private double retailPrice; // The CD's retail price

   public CompactDisc(){
      retailPrice = 0.0;
   }

   public CompactDisc(String cdTitle, String cdArtist, 
              double cdPrice)
   {
      title = cdTitle;
      artist = cdArtist;
      retailPrice = cdPrice;
   }

   public String getTitle()
   {
      return title;
   }

   public String getArtist()
   {
      return artist;
   }

   @Override
   public double getRetailPrice()
   {
      return retailPrice * 1.3;
   }

}