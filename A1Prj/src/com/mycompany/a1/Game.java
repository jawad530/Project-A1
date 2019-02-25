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
	                	case 'a' : System.exit(0); break;
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
		                // gw.
		                break;
	                	case 'd':
			            gw.decreaseAcceleration();
			            break;
	                	case 'e':
			            // gw.
			            break;
	                	case 'E':
			            // gw.
			            break;
	                	case 'f':
			            // gw.
			            break;
	                	case 'h':
			            // gw.
			            break;
	                	case 'i':
			            // gw.
			            break;
	                	case 'I':
			            // gw.
			            break;
	                	case 'j':
	                    // gw.
		                break;
	                	case 'k':
		                // gw.
		                break;
	                	case 'l':
		                // gw.
		                break;
	                	case 'L':
		                // gw.
		                break;
	                	case 'm':
		                // gw.
		                break;
	                	case 'n':
		                // gw.
		                break;
	                	case 'p':
		                // gw.
		                break;
	                	case 'q':
		                // gw.
		                break;
	                	case 'r':
		                // gw.
		                break;
	                	case 's':
		                // gw.
		                break;
	                	case 't':
		                // gw.
		                break;
	                	case 'x':
		                // gw.
		                break;
	                	case 'y':
		                // gw.
		                break;
	                	case '>':
		                // gw.
		                break;
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