
public class Run {
public static void main (String[] args) {
	Seat s1 = new Seat(1,100,120);
	Seat.addSeat(s1);
	Seat s2 = new Seat(2,297,90);
	Seat.addSeat(s2);
	Seat s3 = new Seat(3,66,110);
	Seat.addSeat(s3);
	Seat s4 = new Seat(4,257,113);
	Seat.addSeat(s4);
	Seat s5 = new Seat(5,276,191);
	Seat.addSeat(s5);
	Seat s6 = new Seat(6,280,129);
	Seat.addSeat(s6);
	Seat s7 = new Seat(7,219,163);
	Seat.addSeat(s7);
	Seat s8 = new Seat(8,254,193);
	Seat.addSeat(s8);
	Seat s9 = new Seat(9,86,153);
	Seat.addSeat(s9);
	Seat s10 = new Seat(10,206,147);
	Seat.addSeat(s10);
	Seat s11 = new Seat(11,71,137);
	Seat.addSeat(s11);
	Seat s12 = new Seat(12,104,40);
	Seat.addSeat(s12);
	Seat s13 = new Seat(13,238,137);
	Seat.addSeat(s13);
	Seat s14 = new Seat(14,52,146);
	Seat.addSeat(s14);
	Seat s15 = new Seat(15,129,197);
	Seat.addSeat(s15);
	//You get the point
	
	for (Seat seatNum : Seat.seats) {
		if (seatNum.weight >= 100 && seatNum.temperature <= 80) {
			System.out.println("Seat " + seatNum.seatNum + " is just right!");
		}
	}
}
}
