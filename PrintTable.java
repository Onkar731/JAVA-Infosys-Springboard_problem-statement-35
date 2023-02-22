public class PrintTable {
    public static void printTable(int number) {
        // logic to print table of given number
        for(int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + number + " = " + (i*number));
        }
    }
}