import java.util.Scanner;

class newhello {
    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);
        int height_requirement = 50;
        while (true) {
            System.out.print("Enter height -> ");
            int height = scanner.nextInt();
            if (height < height_requirement) {
                System.out.println("You are too short to ride the ride the roller coaster.");
                break;
            } else {
                System.out.println("You can ride the roller coaster");
                break;
            }

        }

    }
}
