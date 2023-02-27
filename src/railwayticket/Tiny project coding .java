package railwayticket;

import java.util.Scanner;

public class RailwayTicket {
	String name;
	String coach;
	Long mobno;
	int amt;
	int totalamt;
	
	void accept () {
		Scanner scanner= new Scanner (System.in);
		System.out.println("Enter name:");
		name = scanner.nextLine();
		System.out.println("Enter coach:");
		coach = scanner.nextLine();
		System.out.println("Enter mobno:");
		mobno = scanner. nextLong();
		System.out.println("Enter amt: ");
		amt= scanner.nextInt();
	}
	void update() {
		if (coach.equals("1Ac")) {
			totalamt=amt+700;
		}else if (coach.equals("2AC")) {
			totalamt = amt+500;
		}else if  (coach.equals("3AC")) {
			totalamt= amt+250;
		}else if (coach.equals("sleeper")) {
			totalamt = amt;
		}
	}
	void display () {
		System.out.println("Name:" + name);
		System.out.println("coach:" +coach);
		System.out.println("Mobile Number:"+ mobno);
		System.out.println("Amount:"+ amt);
		System.out.println("Total Amount:"+totalamt);
	}
	public static void main (String args[]) {
		RailwayTicket railwayTicket = new RailwayTicket();
		railwayTicket.accept();
		railwayTicket.update();
		railwayTicket.display();
	}
}

		
