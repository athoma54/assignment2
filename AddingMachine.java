/*Alisha Thomas
 * 1212688371
 * Dr. Calliss
 * CSE360 Wednesday 70642
 * Assignment 2
 * Description: The code for this assignment is creating an Adding Machine which is able
 * 				to concatenate the values that's being passed into the parameters of the add
 * 				and the subtract methods. 
 */

package cse360assign2;
public class AddingMachine 
{
	private int total;
	private String history = "0";
	public AddingMachine () 
	{
		total = 0;  // not needed - included for clarity
	}
	
	//this method returns the total of a method and depends on 
	//if the method is adding or subtracting the value from
	//the total
		public int getTotal () 
	{
		return total;
	}
	
	//this methods adds the value to the total by setting it to 
	//total and then it concatenates it by storing the value of 
	//history into history with appropriate signs and the value
	//that is being passed into the parameters of the method
	public void add (int value) 
	{
		total = total + value;
		history = history + " " + "+" + " " + value;
	}
	
	//this method subtracts the value to the total by setting it
	//to total and then it concatenates it by storing the value 
	//of history into history with the right signs and the value
	//that is being passed into the parameters of the method
	public void subtract (int value) 
	{
		total = total - value;
		history = history.concat(" " + "-" + " " + value);
	}
	
	//this method returns history which is concatenating either 
	//the subtract or add method
	public String toString () 
	{
		return history;
	}
	
	//sets total and history to 0 after its gone through the functions
	//and have returned both the total and the history
	public void clear() 
	{
		total  = 0;
		history = "0";
	}
}
