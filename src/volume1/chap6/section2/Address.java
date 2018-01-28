package chap6.section2;

class Address implements Cloneable {
    private String country;
    private String province;
    private String city;
    private String street;
    private String postcode;

    public Address(String country, String province, String city, String street, String postcode) {
        this.country = country;
        this.province = province;
        this.city = city;
        this.street = street;
        this.postcode = postcode;
    }

    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getProvince() {
        return province;
    }
    public void setProvince(String province) {
        this.province = province;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getPostcode() {
        return postcode;
    }
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    @Override
    public Address clone() throws CloneNotSupportedException {
        Address cloned = (Address) super.clone();
        return cloned;
    }
    @Override
    public String toString() {
        return getClass().getName() + "[country=" + country + ",province=" + province
                + ",city=" + city + ",street=" + street + ",postcode=" + postcode + ']';
    }
}
