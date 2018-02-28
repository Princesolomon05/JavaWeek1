import java.util.ArrayList;

public class Seat {
int weight;
int temperature;
int seatNum;

public static ArrayList<Seat> seats = new ArrayList<Seat>();

public static void addSeat(Seat s) {
	seats.add(s); 
}


public Seat(int seatNum, int weight, int temperature){
	this.weight = weight;
	this.temperature = temperature;
	this.seatNum = seatNum;
	
}
}
