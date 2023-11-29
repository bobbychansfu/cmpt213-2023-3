public class RetailItemFactory {
    public static RetailItem getRetailItem(String item) {
        if (item.equals("CD")){
            return new CompactDisc();
        }
        else if (item.equals("DVD")){
            return new DvdMovie();
        }
        else {
            return new RetailItem();
        }
    }
}
