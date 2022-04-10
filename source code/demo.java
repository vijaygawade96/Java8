import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Java");

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

        for(int i=0;i<5;i++){
            System.out.println("i="+i);
        }

        int num[]={5,7,56,28};
        for (int i : num) {
            System.out.println("num arr="+i);
        }
    }
}