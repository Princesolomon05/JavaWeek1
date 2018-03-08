import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		Treasure Gold = new Treasure(2,0);
		
		Treasure Silver = new Treasure (4,3);
		
		
		Player Player1 = new Player(1) ;
		
		
		
int [][] grid = new int [5][5]; 
	
grid [2][2] = Player1.player1;
grid [Gold.xLocation][Gold.yLocation] = 2;

		
		for (int i = 0; i < grid.length; i++ ) {
			
			for (int j = 0; j < grid.length; j++ ) {	
				System.out.print(grid [i][j]);
					}
			System.out.println();
		

	
			}
	
		}
	}
public static void Movement(Player p, String direction){
	
	if (direction.equalsIgnoreCase("Up")) {
		
		
	}
}