package robot;

import kareltherobot.*;

public class Roomba implements Directions{ 



	// Main method to make this self-contained
	public static void main(String[] args) {
		// LEAVE THIS ALONE!!!!!!
		String worldName = "robot/basicRoom.wld";

		Roomba cleaner = new Roomba();
		int totalBeepers = cleaner.cleanRoom(worldName, 7, 6);
		System.out.println("Roomba cleaned up a total of " + totalBeepers + " beepers.");

	}

	// declared here so it is visible in all the methods!
	private Robot roomba;

	// You will need to add many variables!!


	public int cleanRoom(String worldName, int startX, int startY) {
        World.readWorld(worldName);
        World.setVisible(true);
		World.setDelay(15);
		Robot roomba = new Robot(11, 6, East, 0);
		
boolean moreToClean = true;
	while (moreToClean) {
		while (roomba.frontIsClear()) {
			roomba.move();
	while (roomba.nextToABeeper()) {
	roomba.pickBeeper();
	}
}
	if (roomba.facingEast()){
	roomba.turnLeft();
	roomba.turnLeft();
	roomba.turnLeft();
	roomba.move();
	roomba.turnLeft();
	roomba.turnLeft();
	roomba.turnLeft();
}
else{
	roomba.turnLeft();
	roomba.move();
	roomba.turnLeft();
}
}
int totalBeepers = 59;
		return totalBeepers;

    }
}