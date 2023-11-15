package ca.sfu.cmpt213.retail;

/**
   RetailItem interface
*/

public interface RetailItem {
   public String owner = "steve";
   public default double getRetailPrice() {
      return 0.0;
   }
}
