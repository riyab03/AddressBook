import javax.script.ScriptContext;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Welcome to Address Book");
        AddressBook A1=new AddressBook();
        int i=1;
        do{
            System.out.println("Enter 1 to create contact");
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    createContact(A1);
                    break;
                default:
                    System.out.println("wrong input");;
            }
            System.out.println("enter 0 to exit");
            i=sc.nextInt();
        }while(i==0);
        System.out.println("thankyiu for using");
    }
    static void createContact(AddressBook a){
        Scanner sc=new Scanner(System.in);
        System.out.println("first name");
        String firstname=sc.next();
        System.out.println("Last name");
        String lastname=sc.next();
        System.out.println("city name");
        String city=sc.next();
        System.out.println("state name");
        String state=sc.next();
        System.out.println("email");
        String email=sc.next();
        System.out.println("phone");
        int phone=sc.nextInt();
        System.out.println("zip");
        int zip=sc.nextInt();
        Contact c1= new Contact(firstname,lastname,city,state,email,phone,zip);
        a.addContact(c1);
    }

}