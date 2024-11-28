import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    List<Contact>addBook= new ArrayList<>();
//    public void addContact(Contact c1){
//        addBook.add(c1);
//        System.out.println("Contact is added");
//    }

    public void display() {
        System.out.println(addBook);
    }
    public void createContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("first name");
        String firstname = sc.next();
        System.out.println("Last name");
        String lastname = sc.next();
        System.out.println("city name");
        String city = sc.next();
        System.out.println("state name");
        String state = sc.next();
        System.out.println("email");
        String email = sc.next();
        System.out.println("phone");
        int phone = sc.nextInt();
        System.out.println("zip");
        int zip = sc.nextInt();
        Contact c1 = new Contact(firstname, lastname, city, state, email, phone, zip);
        addBook.add(c1);
    }
}
