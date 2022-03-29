import java.util.Scanner;

public class SeatReservation {

	public static void main(String[] args) {
        char[][] seats = new char[10][4];
        Scanner scan = new Scanner(System.in);
        populate(seats);
        while(true){
            try{
        String seatno;
        System.out.println("Bus Seat Reservation:");
        System.out.println("\t\tCol 1\tCol 2\t Col 3\t Col 4");
        for(int i = 0; i < seats.length; i++){
          
                System.out.println("Row " + (i + 1) + "\t\t|" + seats[i][0] + "\t" + seats[i][1] + "\t" + seats[i][2] +"\t" + seats[i][3]);
    
        }
        System.out.println("Enter row and column number to reserve separated by space (Enter a negative number to exit): ");
        seatno = scan.nextLine();

        String[] split = seatno.split(" ");
        if(seats[Integer.parseInt(split[0]) - 1][Integer.parseInt(split[1]) - 1] == 'X'){
            System.out.println("That seat is taken please choose another one.");
        }

        if(Integer.parseInt(split[0]) <= 0){
            System.out.println("Program exit!");
            break;
        }

        if(Integer.parseInt(split[1]) <= 0){
            System.out.println("Program exit!");
            break;
        }

        seats[Integer.parseInt(split[0]) - 1][Integer.parseInt(split[1]) - 1] = 'X'; 
    }catch(Exception err){
        System.out.println("Program exit!");
        break;
    }
    }
	}

    public static char[][] populate(char[][] array) {
   
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                array[i][j] = '*';
            }
        }
		return array;
	 }
}
