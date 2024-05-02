package calc;

import java.io.*;
import java.awt.*;

class Display extends Panel{
	private String data;
	private boolean clear;
	private TextField displayField;
	
	/* Class Constructor */
	public Display(){

		data = new String("0.");
		//data.setAlignment(Component.RIGHT_ALIGNMENT);
		clear = true;
		/* To make this as AWT */
		displayField = new TextField();
		displayField.setText(data);
		setLayout(new GridLayout(1,1));
		add(displayField);
	} // Constructor
	
	public void addData(String theData){
	  if(!clear)	  		// test if the clear 
	    data += theData;	// is set before
	  else
	    data = theData;  // start new data
	  displayField.setText(data);	
	  clear = false;
	}
	
	public String getData(){
		return data;
	}
	public void setClear(boolean status){
	  clear = status;	
	}
	public boolean getClear(){
		return clear;
	}
} // class Display