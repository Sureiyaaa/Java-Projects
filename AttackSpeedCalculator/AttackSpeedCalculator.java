import java.util.Scanner;
import java.text.DecimalFormat;
public class AttackSpeedCalculator {
    public static void main(String[] args) {

        int number_males, number_females; 
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of males: ");
        number_males = scan.nextInt();
        System.out.println("Enter the number of females: ");
        number_females = scan.nextInt();
        int total_students = number_females + number_males;
        System.out.println("Number of students = " + total_students);

        double male_percentage = (Double.valueOf(number_males)/Double.valueOf(total_students)) * 100, female_percentage = (Double.valueOf(number_females)/Double.valueOf(total_students)) * 100;

        System.out.println("Male = " + df.format(male_percentage) + "%");
        System.out.println("Female = " + df.format(female_percentage) + "%");
    }
}
