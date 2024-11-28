import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    List<Contact>addBook= new ArrayList<>();
    public void addContact(Contact c1){
        addBook.add(c1);
        System.out.println("Contact is added");
    }

}
