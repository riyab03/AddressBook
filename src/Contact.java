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


    public String getMail() {
        return email;
    }

    public void setFirstname(String s) {
        this.firstName=s;
    }

    public void setLastname(String next) {
        this.lastname=next;
    }
    public void setCity(String next) {
        this.city=next;
    }

    public void setState(String next) {
        this.state=next;
    }

    public void setEmail(String next) {
        this.email=next;
    }
    public void setPhone(int next) {
        this.phone=next;
    }

    public void setZip(int next) {
        this.zip=next;
    }

    public String getFirstname() {
        return firstName;
    }
}
