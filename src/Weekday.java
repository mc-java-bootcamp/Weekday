import java.util.Scanner;

public class Weekday {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the weekday: ");
        int weekdayNum = input.nextInt();

        if (weekdayNum > 7) {
            System.out.println("Please enter a number equal to or less than 7 and greater than 0");
        } else if (weekdayNum == 7) {
            System.out.println("It is Saturday");
        } else if (weekdayNum == 6) {
            System.out.println("It is Friday");
        } else if (weekdayNum == 5) {
            System.out.println("It is Thursday");
        } else if (weekdayNum == 4) {
            System.out.println("It is Wednesday");
        } else if (weekdayNum == 3) {
            System.out.println("It is Tuesday");
        } else if (weekdayNum == 2) {
            System.out.println("It is Monday");
        } else {
            System.out.println("It is Sunday");
        }
    }
}
