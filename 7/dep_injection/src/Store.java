

public class Store {

    public static void main(String[] args)
    {
        // Create a CompactDisc object.
        // CompactDisc cd = new CompactDisc();
        RetailItem cd = RetailItemFactory.getRetailItem("CD");

        // Create a DvdMovie object.
        // DvdMovie movie = new DvdMovie();
        RetailItem movie = RetailItemFactory.getRetailItem("DVD");

        // Display the CD.
        showPrice(cd);

        // Display the DVDs.
        showPrice(movie);
    }

    private static void showPrice(RetailItem item)
    {
        System.out.printf("Price: $%,.2f\n", item.getRetailPrice());
    }
}
