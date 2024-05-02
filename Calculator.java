package calc;

import java.io.*;
import java.awt.*;
import java.awt.event.*;

class Calculator extends Frame implements ActionListener{
	static private Display disp;
	static private Operation ope;
	static private Keypad keys;
	private MenuBar calMenuBar;
	private Menu fileMenu;
	private MenuItem fileMenuItem;
	private Menu helpMenu;
	private MenuItem helpMenuItem;
	
	public Calculator(){
	  super("Simple Calc");
	  /* the next line for version 1 */
	     disp = new Display();
	     ope = new Operation(disp);
	     keys = new Keypad(disp);
	  /* Next line is for AWT */
	  setLayout(new BorderLayout());
	  setSize(300,300);
	  setVisible(true);
	  add(disp,"North");
	  add(ope,"East");
	  add(keys,"Center");
	  /* to add action window closing */
	  addWindowListener(new ClsoeWindow());
	  
	  /* More Decorating */
	  fileMenu = new Menu("File");
	  calMenuBar = new MenuBar();
	  calMenuBar.add(fileMenu);
	  fileMenuItem = new MenuItem("Exit");
	  fileMenuItem.addActionListener(this);
	  fileMenu.add(fileMenuItem);
	  helpMenu = new Menu("Help");
	  //calMenuBar.setHelpMenu(helpMenu);
	  helpMenu = new Menu("Help");
	  calMenuBar.add(helpMenu);
	  helpMenuItem = new MenuItem("Get Help");
	  helpMenuItem.addActionListener(this);
	  helpMenu.add(helpMenuItem);
	  fileMenu.add(fileMenuItem);
	  setMenuBar(calMenuBar);
	} // main
	/* Use window Adapter rather thatn WindowListener */
	class ClsoeWindow extends WindowAdapter{
	  public void windowClosing(WindowEvent e){
		System.exit(0);
	  }
    }
    
    public void actionPerformed(ActionEvent e){
    	String cmd = e.getActionCommand();
	  	if(cmd.equals("Exit"))
	  	  System.exit(0);
    }
    
	public static void main(String args[]){
		Calculator myCalc = new Calculator();
		myCalc.show();
    } // main
} // Calculator