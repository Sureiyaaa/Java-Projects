import java.util.Scanner;

public class KineticEnergy {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mass, velocity, kineticEnergy;
        System.out.println("Enter mass in kilograms: ");
        mass = scan.nextDouble();
        System.out.println("Enter velocity in meters per second: ");
        velocity = scan.nextDouble();
        kineticEnergy = (mass * (.5) * (Math.pow(velocity, 2)));
        System.out.printf("The object's kinetic energy is: %.2f", kineticEnergy);
        System.out.println(" J.");
	}   
}
