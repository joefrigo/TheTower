package tower;

import java.util.Random;

public class GameLauncher {

	public static void main(String[] args) {
		Random rn = new Random();
		//create a tower and generate a number of floor
		System.out.println("=====Creating the tower=====");
		Tower tower = new Tower(rn.nextInt(Config.MAX_NB_FLOOR - Config.MIN_NB_FLOOR + 1) + Config.MIN_NB_FLOOR);
		System.out.println("The tower contains a total of " + tower.floors.length + " floor");
		System.out.println("=====End of the creation of the tower=====");
		
		//for each floor generate the maze
		System.out.println("=====Creating floors=====");
		for(int i = 0; i < tower.floors.length;i++){
			Floor f = new Floor(i);
			System.out.println("Creating maze for the floor " + i);
			f.createMaze();
		}
	}

}
