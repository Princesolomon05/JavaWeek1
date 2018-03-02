import java.util.Scanner;

public class GameRunner {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		Treasure Gold = new Treasure(2,0);
		
		
		Players Player1 = new Players(1) ;
		
		
int [][] grid = new int [5][5]; 
	
		
		
		for (int i = 0; i < grid.length; i++ ) {
			System.out.print("[]");
			for (int j = 0; j < grid.length; j++ ) {	
				System.out.print("[]");
					}
			System.out.println();
		
			
			
//System.out.print(grid.length);
	}
	
		
		System.out.println("Play");
		
	}
	
}
