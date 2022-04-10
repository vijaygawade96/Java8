import java.util.Date;
import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Java");

        C02ImmutableClass obj1 = C02ImmutableClass.getC02ImmutableClass("Vijay R. Gawade", new Date(1996, 10, 21));
        System.out.println("Before: "+obj1);
        tryModification(obj1.getFullName(), obj1.getDob());
        System.out.println("After getDob() : "+obj1);
        tryModification(obj1.getFullName(), obj1.getDob2());
        System.out.println("After getDob2() : "+obj1);

        boolean result = true;
        if (result) {
            System.out.println("Student pass !!!");
        } else {
            System.out.println("Student failed !!!!");
        }

        String day = "FRI";
        switch (day) {
            case "MON":
                System.out.println("Today is Monday.");
                break;
            case "TUE":
                System.out.println("Today is Tuesday.");
                break;
            default:
                System.out.println("Unknown day !!!");
        }

        int cnt = 1;
        System.out.println("2s Table");
        while (cnt <= 10) {
            System.out.format("2 * %d =%d\n", cnt, 2 * cnt++);
        }

        String input = "y";
        System.out.println("********** Greeting App **********");
        do {
            System.out.print("Enter ur Name:");
            input = sc.nextLine();
            System.out.format("Welcome %s to the Greeting app !!!\n", input);

            System.out.print("play again (y/n): ");
            input = sc.nextLine();
        } while (input == "y" || input.contains("Y"));
        sc.close();

        for (int i = 0; i < 5; i++) {
            System.out.println("i=" + i);
        }

        int num[] = { 5, 7, 56, 28 };
        for (int i : num) {
            System.out.println("num arr=" + i);
        }
    }

    private static void tryModification(String fName, Date dob) {
        fName = "Vijay Ramchandra Gawade";
        dob.setDate(10);
    }
}