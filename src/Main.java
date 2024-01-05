import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        contactManager contactManager = new contactManager();
        Scanner scanner = new Scanner(System.in);
        while(true)
        {
            System.out.println("0 : Back");
            System.out.println("1 : Add");
            System.out.println("2 : remove");
            System.out.println("3 : search");
            System.out.println("4 : update");
            System.out.println("5 : Show");
            System.out.println("Enter number :");
            int choix = scanner.nextInt();

            switch (choix)
            {
                case 0:
                    System.out.println("Good Bye");
                    System.exit(0);
                    break;
                case 1:
                    contactManager.add();
                    break;
                case 2:
                    contactManager.remove();
                    break;
                case 3:
                    contactManager.search();
                    break;
                case 4:
                    contactManager.update();
                    break;
                case 5:
                    contactManager.show();
                    break;
                default:
                    System.out.println("Incorrect choice");
            }
        }












































       /* contactManager contactManager = new contactManager();
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            System.out.println("1 : If u want add contact");
            System.out.println("2 : If u want remove contact");
            System.out.println("3 : If u want update contact");
            System.out.println("4 : If u want show contacts");
            System.out.println("5 : If u want search contacts");
            System.out.println("0 : If u want show quitter");
            System.out.println("Enter the number :");
            int choix = scanner.nextInt();

            switch(choix){

                case 1:
                    contactManager.add();
                    break;

                case 2:
                    contactManager.remove();
                    break;

                case 3:
                    contactManager.update();
                    break;
                case 4:
                    contactManager.show();
                    break;
                case 5:
                    contactManager.search();
                    break;
                case 0:
                    System.out.println("Exiting the program ,Good Bye");
                    System.exit(0);
                default:
                    System.out.println("Choix incorrect");
                    break;
            }

        }*/

    }
}
