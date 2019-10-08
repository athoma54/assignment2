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
	public int getTotal () 
	{
		return total;
	}
	public void add (int value) 
	{
		total = total + value;
		history = history + " " + "+" + " " + value;
	}
	public void subtract (int value) 
	{
		total = total - value;
		history = history.concat(" " + "-"+ " "+ value);
	}
	public String toString () 
	{
		return history;
	}
	public void clear() 
	{

	}
	public static void main(String [] args )
	{
		AddingMachine calculate = new AddingMachine();
		calculate.add(4);
		calculate.subtract(2);
		calculate.add(5);
		calculate.subtract(9);
		System.out.println(calculate.toString());
	}
}
