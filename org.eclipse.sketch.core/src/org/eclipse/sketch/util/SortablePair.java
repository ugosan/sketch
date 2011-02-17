package org.eclipse.sketch.util;

/**
 * Implements a pair of objects that can be sorted by value first.
 * 
 * The ordering between pairs is defined as such :
 * 	IF (values are different)
 * 		RETURN comparison(values);
 * 	ELSE
 * 		RETURN comparison(keys);
 *
 * @param <KEY> the key of the pair.
 * @param <VALUE> the value.
 * 
 * @author Olivier Bourdoux <olivier.bourdoux@gmail.com>
 */
public class SortablePair<KEY extends Comparable<KEY>,VALUE extends Comparable<VALUE>>
implements Comparable<SortablePair<KEY,VALUE>> 
{
	private KEY key;
	private VALUE value;
	
	public KEY key()	   {return key;}
	public VALUE value() {return value;}
	
	public SortablePair(KEY k, VALUE v)
	{
		key=k;
		value=v;
	}
	
	@Override
	public int compareTo(SortablePair<KEY, VALUE> o)
	{
		int a = value.compareTo(o.value);
		
		if (a==0)
			return key.compareTo(o.key); 
		return a;
	}
	
	public String toString()
	{
		return '('+key.toString()+','+value.toString()+')';
	}

}
