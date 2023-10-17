public class Vacation extends Services {

	private String country;
    private String city;
    private String season;


    public Vacation(String country, String city, String season) {
        this.country = country;
        this.city = city;
        this.season = season;
    }


    public String getCountry() {
        return country;
    }


    public String getCity() {
        return city;
    }


    public String getSeason() {
        return season;
    }
}


