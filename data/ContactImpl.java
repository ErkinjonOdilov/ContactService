package UZ.WAXA.HomeTask.contact.data;

import UZ.WAXA.HomeTask.contact.Main;
import UZ.WAXA.HomeTask.contact.service.ContactService;


import java.util.*;

public class ContactImpl implements ContactService {
    private Scanner scanner = new Scanner(System.in);
    private Map<String, Contact> map = new HashMap<>();

    @Override
    public void add() {
        System.out.print("Contact Name: ");
        scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.print("Phone Number: ");
        scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        Contact c1 = new Contact(number);
        map.put(name, c1);
        System.out.println("Successfully added");
    }

    @Override
    public void otherNumbers() {
        System.out.print("Contact Name: ");
        scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        if (map.containsKey(name)) {
            System.out.print("Other Phone Number: ");
            scanner = new Scanner(System.in);
            String number = scanner.nextLine();
            Contact c1 = map.get(name);
            c1.getOtherNumbers().add(number);
            System.out.println("Successfully added another Number");
        } else {
            System.out.println("Not Found");
        }
    }

    @Override
    public void edit() {
        System.out.print("Contact Name: ");
        scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        if (map.containsKey(name)) {
            Contact c1=map.get(name);
            System.out.println("1->Edit Name\n2->Edit number\n3->Edit Other Number");
            int n=scanner.nextInt();
            switch (n){
                case 1->{
                    System.out.print("New Name: ");
                    scanner = new Scanner(System.in);
                    String newName = scanner.nextLine();
                    map.put(newName,c1);
                    map.remove(name);
                    System.out.println("Successfully edited");
                }
                case 2->{
                    System.out.print("New Number: ");
                    scanner = new Scanner(System.in);
                    String newNumber = scanner.nextLine();
                    c1.setNumber(newNumber);
                    System.out.println("Successfully edited");
                }
                case 3->{
                    System.out.print("New Other Phone Number: ");
                    scanner = new Scanner(System.in);
                    String number = scanner.nextLine();
                    Contact c2 = map.get(name);
                    c2.getOtherNumbers().clear();
                    c2.getOtherNumbers().add(number);
                    System.out.println("Successfully added another Number");
                }
            }
        }
    }

    @Override
    public void remove() {
        System.out.print("Contact Name: ");
        scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        if (map.containsKey(name)) {
            map.remove(name);
        }else {
            System.out.println("Not found");
        }
    }

    @Override
    public void list() {
        Set<String> strings = map.keySet();
        for (String s : strings) {
            System.out.println(s+" -> "+map.get(s));
        }

    }
}
