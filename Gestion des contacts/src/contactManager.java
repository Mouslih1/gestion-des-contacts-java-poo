import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class contactManager{

    ArrayList<Contact> contacts;
    Scanner scanner;

    public contactManager()
    {
        contacts = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void add()
    {
        System.out.println("Enter id :");
        int id = scanner.nextInt();

        boolean exist = false;
        for (Contact c : contacts)
        {
            if(c.getId() == id)
            {
                exist = true;
                break;
            }
        }

        if(exist)
        {
            System.out.println("This id contact is really exist !");
        }else {
            System.out.println("Enter the name :");
            String name = scanner.next();
            System.out.println("Enter the email :");
            String email = scanner.next();
            System.out.println("Enter the address :");
            String address = scanner.next();
            System.out.println("Enter the age :");
            int age = scanner.nextInt();
            Contact contact = new Contact(id,name,email,address,age);
            contacts.add(contact);
            System.out.println("Contact has been added successfully");
        }
    }

    public Contact search() throws Exception
    {
        System.out.println("Enter id :");
        int id = scanner.nextInt();
        for (Contact c : contacts)
        {
            if(c.getId() == id)
            {
                System.out.println(c.toString());
                return c;
            }
        }

        throw new Exception("Echec de trouve Contact : " + id);
    }

    public void update() throws Exception {
        Contact search = search();
        System.out.println("Enter id:");
        int id = scanner.nextInt();
        boolean exist = false;

        for(Contact c : contacts)
        {
            if(c.getId() == id)
            {
                exist = true;
                break;
            }
        }

        if(exist)
        {
            System.out.println("Enter the name :");
            String name = scanner.next();
            System.out.println("Enter the email :");
            String email = scanner.next();
            System.out.println("Enter the address :");
            String address = scanner.next();
            System.out.println("Enter the age :");
            int age = scanner.nextInt();
            Contact contact = new Contact(id,name,email,address,age);
            id = search.getId();
            contacts.set(id - 1,contact);
            System.out.println("Contact has been updated successfully");
        }else{
            System.out.println("This id contact is not found");
        }

    }

    public void remove() throws Exception {
        Contact contact = search();
        contacts.remove(contact);
    }

    public void show()
    {
        if(contacts.isEmpty())
        {
            System.out.println("la list est vide !");
        }
        for (Contact c : contacts)
        {
            System.out.println(c.toString());
        }
    }
}