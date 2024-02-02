package ie.atu.productv4;

public class ProductDB {

     public static Product getProduct(String productCode) {
    // In a more realistic application, this code would get the data for the product from a file or database
    // For now, this code just uses if/else statements to return the correct product data
       Product p = null;
        if (productCode.equalsIgnoreCase("java")) {
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
            p = myBook;        }

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

         if (productCode.equalsIgnoreCase("tv1")) {
             Tv myTv = new Tv();
             myTv.setCode(productCode);
             myTv.setDescription("Visual Studios");
             myTv.setPrice(57.50);
             myTv.setscreenSize("16 inch");
             myTv.setmanufacture("Dell");
             p = myTv;
         } else if (productCode.equalsIgnoreCase("tv2")) {
             Tv myTv = new Tv();
             myTv.setCode(productCode);
             myTv.setDescription("Build Java apps");
             myTv.setPrice(57.50);
             myTv.setscreenSize("18 inch");
             myTv.setmanufacture("Sony");
             p = myTv;
         } else if (productCode.equalsIgnoreCase("tv3")) {
             Tv myTv = new Tv();
             myTv.setCode(productCode);
             myTv.setDescription("Latest MySQL");
             myTv.setPrice(54.50);
             myTv.setscreenSize("12 inch");
             myTv.setmanufacture("LG");
             p = myTv;
         }

         if (productCode.equalsIgnoreCase("song1")) {
             Music myMusic = new Music();
             myMusic.setCode(productCode);
             myMusic.setDescription("banger 2");
             myMusic.setPrice(57.50);
             myMusic.setLabel("idk");
             myMusic.setArtist("Braincoats");
             p = myMusic;
         } else if (productCode.equalsIgnoreCase("song2")) {
             Music myMusic = new Music();
             myMusic.setCode(productCode);
             myMusic.setDescription("bop");
             myMusic.setPrice(57.50);
             myMusic.setLabel("idk either");
             myMusic.setArtist("Blur");
             p = myMusic;
         } else if (productCode.equalsIgnoreCase("The last song")) {
             Music myMusic = new Music();
             myMusic.setCode(productCode);
             myMusic.setDescription("banger");
             myMusic.setPrice(54.50);
             myMusic.setLabel("havent a clue");
             myMusic.setArtist("Foo Fighters");
             p = myMusic;
         }

        return p;
    //We need all the book and software objects, but what kind of object do we return?
    }
}

