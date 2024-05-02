package calc;

import java.io.*;
import java.awt.*;
import java.awt.event.*;

class Keypad extends Panel implements ActionListener{
	private Display myDisplay;
	/* To use AWT */
	private Button oneB;
	private Button twoB;
	private Button threeB;
	private Button fourB;
	private Button fiveB;
	private Button sixB;
	private Button sevenB;
	private Button eightB;
	private Button nineB;
	private Button zeroB;
	private Button decimalB;
	private Button clearB;
	
	public Keypad(Display disp){
	  myDisplay = disp;	
	  /* For AWT */
	  setLayout(new GridLayout(3,4));
	  oneB = new Button("1");
	  oneB.addActionListener(this);
	  add(oneB);
	  
	  twoB = new Button("2");
	  twoB.addActionListener(this);
	  add(twoB);
	  
	  threeB = new Button("3");
	  threeB.addActionListener(this);
	  add(threeB);
	  
	  fourB = new Button("4");
	  fourB.addActionListener(this);
	  add(fourB);
	  
	  fiveB = new Button("5");
	  fiveB.addActionListener(this);
	  add(fiveB);
	  
	  sixB = new Button("6");
	  sixB.addActionListener(this);
	  add(sixB);
	  
	  sevenB = new Button("7");
	  sevenB.addActionListener(this);
	  add(sevenB);
	  
	  eightB = new Button("8");
	  eightB.addActionListener(this);
	  add(eightB);
	  
	  nineB = new Button("9");
	  nineB.addActionListener(this);
	  add(nineB);
	  
	  zeroB = new Button("0");
	  zeroB.addActionListener(this);
	  add(zeroB);
	  
	  decimalB = new Button(".");
	  decimalB.addActionListener(this);
	  add(decimalB);
	  
	  clearB = new Button("C");
	  clearB.addActionListener(this);
	  add(clearB);
	}
	
	public void actionPerformed(ActionEvent e){
	  	String cmd = e.getActionCommand();
	  	if(cmd.equals("1"))
	  	  one();
	  	if(cmd.equals("2"))
	  	  two();
	  	if(cmd.equals("3"))
	  	  three();
	  	if(cmd.equals("4"))
	  	  four();
	  	if(cmd.equals("5"))
	  	  five();
	  	if(cmd.equals("6"))
	  	  six();
	  	if(cmd.equals("7"))
	  	  seven();
	  	if(cmd.equals("8"))
	  	  eight();
	  	if(cmd.equals("9"))
	  	  nine();
	  	if(cmd.equals("0"))
	  	  zero();
	  	if(cmd.equals("."))
	  	  decimal();
	  	if(cmd.equals("C"))
	  	  clear();
	}
	/* The next lines codes are from version 1 */
		public void one(){
		myDisplay.addData("1");
	}
	public void two(){
		myDisplay.addData("2");
	}
	public void three(){
		myDisplay.addData("3");
	}
	public void four(){
		myDisplay.addData("4");
	}
	public void five(){
		myDisplay.addData("5");
	}
	public void six(){
		myDisplay.addData("6");
	}
	public void seven(){
		myDisplay.addData("7");
	}
	public void eight(){
		myDisplay.addData("8");
	}
	public void nine(){
		myDisplay.addData("9");
	}
	public void zero(){
		myDisplay.addData("0");
	}
	public void clear(){
		myDisplay.setClear(true);
		myDisplay.addData("0.");
		myDisplay.setClear(true);
	}
	public void decimal(){
		myDisplay.addData(".");
	}
	
} // class Keypad