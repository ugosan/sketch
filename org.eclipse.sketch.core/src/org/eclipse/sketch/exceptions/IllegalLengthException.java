package org.eclipse.sketch.exceptions;

/**
 * Used when the length of a string is 
 * @author Olivier Bourdoux <olivier.bourdoux@gmail.com>
 *
 */
public class IllegalLengthException extends Exception 
{
	private int length; 
	public IllegalLengthException(int l)
	{
		length = l;
	}
	
	public int getLength()
	{return length;}
	
	public String toString()
	{
		return super.toString() + "("+length+")";
	}
}
