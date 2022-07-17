package UZ.WAXA.HomeTask.contact.data;

import java.util.ArrayList;
import java.util.List;

public class Contact {
    private String name;
    private String number;
    private List<String> otherNumbers=new ArrayList<>();

    public Contact(String number) {
        this.number = number;
    }

    public Contact() {
    }

    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public Contact(List<String > otherNumbers) {
        this.otherNumbers = otherNumbers;
    }

    public Contact(String name, List<String > otherNumbers) {
        this.name = name;
        this.otherNumbers = otherNumbers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public List<String> getOtherNumbers() {
        return otherNumbers;
    }

    public void setOtherNumbers(List<String > otherNumbers) {
        this.otherNumbers = otherNumbers;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "number='" + number + '\'' +
                ", OtherNumbers=" + otherNumbers +
                '}';
    }
}
