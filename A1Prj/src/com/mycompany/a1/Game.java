package com.mycompany.a1;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.Label;
import com.codename1.ui.TextField;
import com.codename1.ui.events.ActionEvent;
import java.lang.String;
import com.codename1.ui.Form;

public class Game extends Form {

	private GameWorld gw;
	private boolean quit = false;
	
	public void qConfirm()
	{
		System.out.println( "Are you sure you want to quit? press Y to confirm");
	}
	
	public Game(){
		gw = new GameWorld();
		gw.init();
		play();
	}
	
	private void play() 
	{
		System.out.println("Welcome to the Game!");
	    Label myLabel = new Label("Enter a Command:");
	    this.addComponent(myLabel);
	    final TextField myTextField = new TextField();
	    this.addComponent(myTextField);
	    this.show();
	    myTextField.addActionListener(new ActionListener() {

	            public void actionPerformed(ActionEvent evt) {

	                String sCommand = myTextField.getText().toString();
	                myTextField.clear();
	                if(quit) {
	                	switch(sCommand.charAt(0)){
	                	case 'Y' : System.exit(0); break;
	                	default: quit = false; break;
	                	}
	                }
	                else {
	                	switch(sCommand.charAt(0)) {
	                	case 'a':
	                	gw.addNewAsteroid();
	                	break;
	                	case 'b':
	                	gw.addNewStation();
	                	break;
	                	case 'c':
		                gw.crashed();
		                break;
	                	case 'd':
			            gw.decreaseAcceleration();
			            break;
	                	case 'e':
			            gw.eliminated();
			            break;
	                	case 'E':
			            gw.exploded();
			            break;
	                	case 'f':
			            gw.fireMissile();
			            break;
	                	case 'h':
			            gw.hit();
			            break;
	                	case 'i':
			            gw.increaseAcceleration();
			            break;
	                	case 'I':
			            gw.impacted();
			            break;
	                	case 'j':
	                    gw.jump();
		                break;
	                	case 'k':
		                gw.KilledAsteroid();
		                break;
	                	case 'l':
		                gw.leftTurn();
		                break;
	                	case 'L':
		                //gw.Map();
		                break;
	                	case 'm':
		                gw.Map();
		                break;
	                	case 'n':
		                gw.newSupply();
		                break;
	                	case 'p':
		                gw.print();
		                break;
	                	case 'q':
		                quit = true;
		                qConfirm();
		                break;
	                	case 'r':
		                gw.rightTurn();
		                break;
	                	case 's':
		                gw.newPlayerShip();
		                break;
	                	case 't':
		                gw.tick();
		                break;
	                	case 'x':
		                gw.exterminate();
		                break;
	                	case 'y':
		                gw.addNewNonPlayerShip();
		                break;
	                	case '>':
	                	
		                //
		                break;
		                default:
		                System.out.println("Sorry that is an invalid input");
	                	}
	                   // case 'e':
	                     //   gw.eliminate();
	                       // break;
	                        //add code to handle rest of the commands 
	                } //switch 
	            } //actionPerformed 
	        } //new ActionListener()  
	    ); //addActionListener
	} //play
		
}