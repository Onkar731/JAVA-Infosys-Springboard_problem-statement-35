import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // accepting input from the user
        int number = sc.nextInt();

        // printing the table of given number using printTable() method of PrintTable class
        PrintTable.printTable(number);

        // closing resource
        sc.close();
    }
}