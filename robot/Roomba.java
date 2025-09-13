package robot;

import kareltherobot.*;

public class Roomba implements Directions
{ 



	// Main method to make this self-contained
	public static void main(String[] args) 
	{
		// LEAVE THIS ALONE!!!!!!
		String worldName = "robot/basicRoom.wld";

		Roomba cleaner = new Roomba();
		int totalBeepers = cleaner.cleanRoom(worldName, 11, 6);
		int beeperCount = cleaner.cleanRoom(worldName, 11, 6);

	}

	public int cleanRoom(String worldName, int startX, int startY) 
	{
        int sizeOfPile = 0;
		int stepsTaken = 0;
		int totalBeepers = 0;
		
		World.readWorld(worldName);
        World.setVisible(true);
		World.setDelay(7);
		Robot roomba = new Robot(11, 6, East, 0);
		boolean moreToClean = true;
		while (moreToClean) 
		{
			while (roomba.frontIsClear()) 
			{
				roomba.move();
				stepsTaken++;
				int beeperCount = 0;
				while (roomba.nextToABeeper())
				{
					roomba.pickBeeper();
					beeperCount++;
					System.out.println("beeperCount is "+ beeperCount);
					if (sizeOfPile < beeperCount)
					{
						sizeOfPile = beeperCount;
						System.out.println("The latest largest pile roomba picked up is "+ sizeOfPile + " beepers");
					}
					
					totalBeepers++;
			
				}
			}
			if (roomba.facingEast())
			{
				roomba.turnLeft();
				roomba.turnLeft();
				roomba.turnLeft();
				if (roomba.frontIsClear())
				{
				roomba.move();
				roomba.turnLeft();
				roomba.turnLeft();
				roomba.turnLeft();
				}
				else
				{
					moreToClean = false;
				}
			}
			else
			{
				roomba.turnLeft();
				roomba.move();
				roomba.turnLeft();
			}
			
    	}
		System.out.println("Roomba cleaned up a total of " + totalBeepers + " beepers.");
		System.out.println("The largest pile roomba picked up is "+ sizeOfPile + " beepers");
		System.out.println("Roomba took a total of "+stepsTaken+" steps");
		return stepsTaken;

	}
}