package de.tinycodecrank.math.utils;

import static de.tinycodecrank.math.utils.range.Range.*;

public class Max
{
	public static byte max(byte a, byte b)
	{
		return a < b ? b : a;
	}
	
	public static short max(short a, short b)
	{
		return a < b ? b : a;
	}
	
	public static char max(char a, char b)
	{
		return a < b ? b : a;
	}
	
	public static int max(int a, int b)
	{
		return a < b ? b : a;
	}
	
	public static long max(long a, long b)
	{
		return a < b ? b : a;
	}
	
	public static float max(float a, float b)
	{
		return a < b ? b : a;
	}
	
	public static double max(double a, double b)
	{
		return a < b ? b : a;
	}
	
	public static byte max(byte first, byte... vals)
	{
		for (int i : range(vals.length))
			first = first > vals[i] ? first : vals[i];
		return first;
	}
	
	public static short max(short first, short... vals)
	{
		for (int i : range(vals.length))
			first = first > vals[i] ? first : vals[i];
		return first;
	}
	
	public static char max(char first, char... vals)
	{
		for (int i : range(vals.length))
			first = first > vals[i] ? first : vals[i];
		return first;
	}
	
	public static int max(int first, int... vals)
	{
		for (int i : range(vals.length))
			first = first > vals[i] ? first : vals[i];
		return first;
	}
	
	public static long max(long first, long... vals)
	{
		for (int i : range(vals.length))
			first = first > vals[i] ? first : vals[i];
		return first;
	}
	
	public static float max(float first, float... vals)
	{
		for (int i : range(vals.length))
			first = first > vals[i] ? first : vals[i];
		return first;
	}
	
	public static double max(double first, double... vals)
	{
		for (int i : range(vals.length))
			first = first > vals[i] ? first : vals[i];
		return first;
	}
}