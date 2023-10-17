import java.util.Date;


public class Booking {
    private String bookingID;
    private String[] productID;
    private String userID;
    private String fromDate;
    private String toDate;
    private double price;


    public Booking(String bookingID, String productID[], String userID, String fromDate, String toDate, double price) {
        this.bookingID = bookingID;
        this.productID = productID;
        this.userID = userID;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.price = price;
    }
 // you might not need to add these in yet
    public String getBookingID() {
            return bookingID;
        }


        public String[] getProductID() {
            return productID;
        }


        public String getUserID() {
            return userID;
        }


        public String getFromDate() {
            return fromDate;
        }


        public String getToDate() {
            return toDate;
        }


        public double getPrice() {
            return price;
        }
    }

