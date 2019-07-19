import java.util.*;
import java.util.Random;
public class mainclass {
	public static void main (String[]args) {
		
    //For simplicity we are allowing only the 3 words below to be given as input
      String [] computer = {"rock","paper","scissors"};
      System.out.println("Please pick between rock/paper/scissors!");
        
	//Your call on rock/paper/scissors
      Nomain el = new Nomain(); 

	  for(int i =0 ; i<5;i++) {
      Scanner sc = new Scanner(System.in);
	  String game = sc.nextLine();
	 
	       if(game.equals(computer[0])||game.equals(computer[1])||game.equals(computer[2])) {
	    	   System.out.println("Your choice is "+ game);
	       }
	       else {
	    	   System.out.println("You have selected an answered which is irrelevant to the game , thats an error!");
	       }
	 //Computer RNG on rock/paper/scissors
	   Random ran = new Random();
	   int x = ran.nextInt(2);
	   System.out.println("Computer picks " + computer[x]);
	   
	 //Game rules
	   if(game.equals(computer[x])) {
		   System.out.println("The game ends in a draw because u both picked the same sign .");
	   }
	   else if((game.equals("rock")&&computer[x].equals("scissors"))||(game.equals("scissors")&&computer[x].equals("paper"))||game.equals("paper")&&computer[x].equals("rock")) {
		   System.out.println("You won!");
	   }
	   else {
		   System.out.println("Computer won");
	   }
	   System.out.println(" ");
	     el.enQueue(game);
	  el.show();
	   System.out.println(" ");
	    
	}
	  }
}
