import java.util.Scanner;

public class SimplePhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert a phone book entry: ");
        String[] line = scanner.nextLine().split(" ");

        String first = line[0], last = line[1];
        String[] phone = line[2].split("-");

        String countryCode = phone[0], areaCode = phone[1], number = phone[2];

        System.out.print("Name: " + first + "\t\t");
        System.out.print("Lastname: " + last + "\t\t");
        System.out.print("Phone: " + line[2] + "\t\t");
        System.out.println();
        System.out.println("Phone details:");
        System.out.print("country: " + countryCode + "\t\t\t");
        System.out.print("area: " + areaCode + "\t\t\t");
        System.out.print("number: " + number + "\t\t\t");
    }
}
