package Entities;

public class Booking {

        private String firstname;
        private String lastname;
        private float totalprice;
        private boolean depositpaid;
        private BookingDates bookingdates;
        private String addicionalneeds;


    public Booking(String firstname, String lastname, float totalprice, boolean depositpaid, BookingDates bookingdates, String addicionalneeds) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.totalprice = totalprice;
        this.depositpaid = depositpaid;
        this.bookingdates = bookingdates;
        this.addicionalneeds = addicionalneeds;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public float getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(float totalprice) {
        this.totalprice = totalprice;
    }

    public boolean isDepositpaid() {
        return depositpaid;
    }

    public void setDepositpaid(boolean depositpaid) {
        this.depositpaid = depositpaid;
    }

    public BookingDates getBookingdates() {
        return bookingdates;
    }

    public void setBookingdates(BookingDates bookingdates) {
        this.bookingdates = bookingdates;
    }

    public String getAddicionalneeds() {
        return addicionalneeds;
    }

    public void setAddicionalneeds(String addicionalneeds) {
        this.addicionalneeds = addicionalneeds;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", totalprice=" + totalprice +
                ", depositpaid=" + depositpaid +
                ", bookingdates=" + bookingdates +
                ", addicionalneeds='" + addicionalneeds + '\'' +
                '}';
    }
}
