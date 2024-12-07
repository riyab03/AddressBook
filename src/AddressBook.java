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

    public void edit() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first name of employee you want to change detail ");
        String s1=sc.next();
        addBook.stream().filter(t->t.getMail().equalsIgnoreCase(s1))
                .map(t->{
                    System.out.println("Contact found:");
                    System.out.println("What would you like to edit? Press 1) first name \n2) for last name \n 3) for city \n 4) for state \n 5) for email \n 6)Phone \n 7) zip code");
                    int c=sc.nextInt();
                    switch (c){
                        case 1-> t.setFirstname(sc.next());
                        case 2-> t.setLastname(sc.next());
                        case 3-> t.setCity(sc.next());
                        case 4-> t.setState(sc.next());
                        case 5-> t.setEmail(sc.next());
                        case 6-> t.setPhone(sc.nextInt());
                        case 7-> t.setZip(sc.nextInt());
                        default -> System.out.println("Invalid");
                    }
                    System.out.println("Contact updated");
                    return t;
                }).findFirst();
    }


    public void deleteByName() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first name of employee you want to delete detail ");
        String s1=sc.next();
        Contact c=addBook.stream().filter(t->t.getFirstname().equalsIgnoreCase(s1)).findFirst().get();
        addBook.remove(c);
    }
}
