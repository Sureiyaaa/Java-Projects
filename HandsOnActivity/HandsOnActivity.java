import java.util.Scanner;
import java.text.DecimalFormat;
public class HandsOnActivity {
    public static void main(String[] args) {
        DecimalFormat formatter = new DecimalFormat("0.00");
        Scanner scan = new Scanner(System.in);
        String employee_name;
        char job_type;

		System.out.println("Enter employee name: ");
        
        employee_name = scan.nextLine();

        while(true){
        System.out.println("Press F for Full Time or P for Part Time: ");
        job_type = scan.next().charAt(0);

        if(Character.toUpperCase(job_type) == 'F'){
            System.out.println("--- Full Time Employee ---");
            break;
        }else if(Character.toUpperCase(job_type) == 'P'){
            System.out.println("--- Part Time Employee ---");         
            break;   
        }else{
            System.out.println("[Error]: Please enter a valid job type.");
        }
    }
        if(Character.toUpperCase(job_type) == 'P'){
        int hours_worked, overtime, extraHours;
        double rate_per_hour, basicPay, overtimePay, grossPay;


        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("Enter rate per hour: ");
        rate_per_hour = scan.nextDouble();
        System.out.println("Enter no. of hours worked: ");
        hours_worked = scan.nextInt();
        System.out.println("Enter no. of overtime: ");
        overtime = scan.nextInt();
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        basicPay =  rate_per_hour * hours_worked; 
        overtimePay = (overtime * (rate_per_hour * 1.25));
        
        grossPay = (basicPay + overtimePay);
        System.out.println("Employee Name: " + employee_name);
        System.out.println("Basic Pay: " + formatter.format(basicPay));
        System.out.println("Overtime Pay: " + formatter.format(overtimePay));
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("Gross pay: " +  formatter.format(grossPay));
        }else if(Character.toUpperCase(job_type) == 'F'){
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        double basicPay;
        System.out.println("Enter Basic Pay:");
        basicPay = scan.nextDouble();
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("Employee Name: " + employee_name);
        System.out.println("Basic Pay: " + formatter.format(basicPay));
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("Gross Pay: " + formatter.format(basicPay));
        }
	}
}
