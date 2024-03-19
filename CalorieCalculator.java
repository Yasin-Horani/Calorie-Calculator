import java.util.Scanner;

public class CalorieCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("====================Calorie Calculator==================");
        System.out.println("Add Your weight: ");
        int weight = scanner.nextInt();
        System.out.println("Add Your Lingth: ");
        int lingth = scanner.nextInt();
        System.out.println("Add Your age: ");
        int age = scanner.nextInt();
        int resutl = ((weight * 10)+(lingth * 10)-(age * 4 )) - 750;
        System.out.println("Your Calorie for a day: "+ resutl);

    }
}
