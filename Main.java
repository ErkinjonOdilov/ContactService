package UZ.WAXA.HomeTask.contact;



import UZ.WAXA.HomeTask.contact.data.Contact;
import UZ.WAXA.HomeTask.contact.data.ContactImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactImpl c1=new ContactImpl();
        boolean isTrue=true;
        while (isTrue){
            System.out.println("1->Add Contact\n2->Add Another Number\n3->Edit Contact\n4->Remove Contact\n5->List Contacts\n0->Exit");
            int n=scanner.nextInt();
            switch (n){
                case 0->{isTrue=false;}
                case 1->{c1.add();}
                case 2->{c1.otherNumbers();}
                case 3->{c1.edit();}
                case 4->{c1.remove();}
                case 5->{c1.list();}
            }
        }

    }
}
