package productv4;


public class ProductDB {

    public static Product getProduct(String productCode) {
        // In a more realistic application, this code would
        // get the data for the product from a file or database
        // For now, this code just uses if/else statements
        // to return the correct product data

        Product p = null;

        if (productCode.equalsIgnoreCase("java"))
        {
           Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("ATU Java Programming");
            myBook.setPrice(57.50);
            myBook.setAuthor("Joe Brown");
            p = myBook;
        } else if (productCode.equalsIgnoreCase("jsp")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Java Servlets and JSP");
            myBook.setPrice(57.50);
            myBook.setAuthor("Mike White");
            p = myBook;
        } else if (productCode.equalsIgnoreCase("mysql")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Lennon's MySQL");
            myBook.setPrice(54.50);
            myBook.setAuthor("Jim Lennon");
            p = myBook;
        }


        if (productCode.equalsIgnoreCase("studios")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Visual Studios");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Microsoft 1.1");
            p = mySoftware;
        } else if (productCode.equalsIgnoreCase("eclipse")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Build Java apps");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Eclipse Neon");
            p = mySoftware;
        } else if (productCode.equalsIgnoreCase("oracle")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Latest MySQL");
            mySoftware.setPrice(54.50);
            mySoftware.setVersion("Oracle 3.0");
            p = mySoftware;
        }

        if (productCode.equalsIgnoreCase("Drill")) {
            Music myMusic= new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Female ginger drill artist");
            myMusic.setPrice(57.50);
            myMusic.setArtist(" Ice Spice");
            p = myMusic;
        }
        else if (productCode.equalsIgnoreCase("Rap")) {
            Music myMusic= new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Male english rapper");
            myMusic.setPrice(75.00);
            myMusic.setArtist(" Central Cee");
            p = myMusic;
        }
        else if (productCode.equalsIgnoreCase("Pop")) {
            Music myMusic= new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Female american Pop singer");
            myMusic.setPrice(92.50);
            myMusic.setArtist(" Taylor Swift");
            p = myMusic;
        }
        if (productCode.equalsIgnoreCase("Apple")) {
            Tv myTv = new Tv();
            myTv.setCode(productCode);
            myTv.setDescription("Freeview HD Ready Smart TV");
            myTv.setPrice(155.97);
            myTv.setManufacturer(" 32 Inch");
            p = myTv;
        }
        else if (productCode.equalsIgnoreCase("Sony")) {
            Tv myTv = new Tv();
            myTv.setCode(productCode);
            myTv.setDescription("4K Smart TV with Freeview Play");
            myTv.setPrice(619.97);
            myTv.setManufacturer(" 65 Inch");
            p = myTv;
        }

        else if (productCode.equalsIgnoreCase("Samsung")) {
            Tv myTv = new Tv();
            myTv.setCode(productCode);
            myTv.setDescription("4K HDR Smart TV with Alexa");
            myTv.setPrice(269.97);
            myTv.setManufacturer(" 43 inch");
            p = myTv;
        }


        return p;
    }
}

