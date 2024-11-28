public class Contact {
    String firstName;
    String lastname;
    String city;
    String state;
    String email;
    int phone;
    int zip;

    public Contact(String firstName, String lastname, String city, String state, String email, int phone, int zip) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.city = city;
        this.state = state;
        this.email = email;
        this.phone = phone;
        this.zip = zip;
    }

    public String toString(){
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastname + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", zip=" + zip +
                '}';
    }



}
