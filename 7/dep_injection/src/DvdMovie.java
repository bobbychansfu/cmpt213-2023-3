
/**
   DvdMovie class
*/

public class DvdMovie extends RetailItem
{
   private String title;       // The DVD's title
   private int runningTime;    // Running time in minutes
   private double retailPrice; // The DVD's retail price

   public DvdMovie(){
      retailPrice = 0.0;
   }

   public DvdMovie(String dvdTitle, int runTime,
                                double dvdPrice)
   {
      title = dvdTitle;
      runningTime = runTime;
      retailPrice = dvdPrice;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public void setRunningTime(int runningTime) {
      this.runningTime = runningTime;
   }

   public void setRetailPrice(double retailPrice) {
      this.retailPrice = retailPrice;
   }

   public String getTitle()
   {
      return title;
   }

   public int getRunningTime()
   {
      return runningTime;
   }

   @Override
   public double getRetailPrice()
   {
      return retailPrice;
   }
}