package chap6.section2;

class Person implements Cloneable {
    private String firstName;
    private String lastName;
    private int age;
    private Address address;

    public Person(final String firstName, final String lastName, final int age, final Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(String country, String province, String city, String street, String postcode) {
        address.setCountry(country);
        address.setProvince(province);
        address.setCity(city);
        address.setStreet(street);
        address.setPostcode(postcode);
    }

//    default shallow clone
//    @Override
//    public Person clone() throws CloneNotSupportedException {
//        return (Person) super.clone();
//    }
    // deep clone
    @Override
    public Person clone() throws CloneNotSupportedException {
        Person cloned = (Person) super.clone();
        cloned.address = address.clone();
        return cloned;
    }
    @Override
    public String toString() {
        return getClass().getName() + "[firstName=" + firstName
                + ",lastName=" + lastName + ",age=" + age + ",address=" + address + ']';
    }
}
