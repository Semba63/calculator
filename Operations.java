package calc;

import java.io.*;
import java.awt.*;
import java.awt.event.*;

class Operation extends Panel implements ActionListener{
	private Display myDisplay;
	private String value1;
	private String value2;
	private String result;
	private String opt;
	/* values used to hold temporary numbers */
	double v1;
	double v2;
	double rst;

	/* For AWT layout */
	private Button addB;
	private Button subtractB;
	private Button divideB;
	private Button multiplyB;
	private Button equalsB;
	
	public Operation(Display disp){
		myDisplay = disp;
		value1 = new String("");
		value2 = new String("");
		opt = new String("");
		
		/* For AWT Layout */
		setLayout(new GridLayout(5,1));
		addB = new Button("+");
		addB.addActionListener(this);
		add(addB);
		
		subtractB = new Button("-");
		subtractB.addActionListener(this);
		add(subtractB);
		
		multiplyB = new Button("*");
		multiplyB.addActionListener(this);
		add(multiplyB);
		
		divideB = new Button("/");
		divideB.addActionListener(this);
		add(divideB);
		
		equalsB = new Button("=");
		equalsB.addActionListener(this);
		add(equalsB);
	}
	
	public void actionPerformed(ActionEvent e){
		String cmd = e.getActionCommand();
	  	if(cmd.equals("+"))
	  	  add();
	  	if(cmd.equals("-"))
	  	  subtract();
	  	if(cmd.equals("*"))
	  	  multiply();
	  	if(cmd.equals("/"))
	  	  divide();
	  	if(cmd.equals("="))
	  	  equals();
		
	}
	
	/* The follwoings from Version 1 */
	public void add(){
		/* save the first value */
		value1 = myDisplay.getData();
		opt = "+";
		/* clear for next time */
		myDisplay.setClear(true);
	}
	public void subtract(){
		/* save the first value */
		value1 = myDisplay.getData();
		opt = "-";
		/* clear for next time */
		myDisplay.setClear(true);
	}
	public void multiply(){
		/* save the first value */
		value1 = myDisplay.getData();
		opt = "*";
		/* clear for next time */
		myDisplay.setClear(true);
	}
	public void divide(){
		/* save the first value */
		value1 = myDisplay.getData();
		opt = "/";
		/* clear for next time */
		myDisplay.setClear(true);
	}
	public void equals(){
		/* Save value2 */
		value2 = myDisplay.getData();
		/* convert value1 and value2 
		   Using an instance of Double class
		   and use the instance dobleValue
		   method. There is no static way to do it */
		Double tempV = new Double(value1);
		v1 = tempV.doubleValue();
		tempV = new Double(value2);
		v2 = tempV.doubleValue();
		/* This method works in as the followings:
		   1. check and carry out the operation
		   2. send the result back to the reasult */
		   
		/* addition operation */
		if(opt.equals("+")){
			myDisplay.setClear(true);
			rst = v1 + v2;
			result = ""+ rst;
			myDisplay.addData(result);
			myDisplay.setClear(true);
		} 
		/* subtraction operation */
		if(opt.equals("-")){
			myDisplay.setClear(true);
			rst = v1 - v2;
			result = ""+ rst;
			myDisplay.addData(result);
			myDisplay.setClear(true);
		}
		/* multiplication operation */
		if(opt.equals("*")){
			myDisplay.setClear(true);
			rst = v1 * v2;
			result = ""+ rst;
			myDisplay.addData(result);
			myDisplay.setClear(true);
		}
		/* division operation */
		if(opt.equals("/")){
			/* Extra attention is require for v2 */
			if(v2 != 0 ){
			  myDisplay.setClear(true);
			  rst = v1 + v2;
			  result = ""+ rst;
			  myDisplay.addData(result);
		   } // testing divide by zero
		   else 
		   myDisplay.addData("Error divide by zero");
		   /* Clear next time in all cases */
		   myDisplay.setClear(true);		   
		}
	}
} // Operations