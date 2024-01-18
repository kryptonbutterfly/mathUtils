package kryptonbutterfly.math.utils;

import static kryptonbutterfly.math.utils.range.Range.*;

public class Min
{
	public static byte min(byte a, byte b)
	{
		return a > b ? b : a;
	}
	
	public static short min(short a, short b)
	{
		return a > b ? b : a;
	}
	
	public static char min(char a, char b)
	{
		return a > b ? b : a;
	}
	
	public static int min(int a, int b)
	{
		return a > b ? b : a;
	}
	
	public static long min(long a, long b)
	{
		return a > b ? b : a;
	}
	
	public static float min(float a, float b)
	{
		return a > b ? b : a;
	}
	
	public static double min(double a, double b)
	{
		return a > b ? b : a;
	}
	
	public static byte min(byte first, byte... vals)
	{
		for (int i : range(vals.length))
			first = first < vals[i] ? first : vals[i];
		return first;
	}
	
	public static short min(short first, short... vals)
	{
		for (int i : range(vals.length))
			first = first < vals[i] ? first : vals[i];
		return first;
	}
	
	public static char min(char first, char... vals)
	{
		for (int i : range(vals.length))
			first = first < vals[i] ? first : vals[i];
		return first;
	}
	
	public static int min(int first, int... vals)
	{
		for (int i : range(vals.length))
			first = first < vals[i] ? first : vals[i];
		return first;
	}
	
	public static long min(long first, long... vals)
	{
		for (int i : range(vals.length))
			first = first < vals[i] ? first : vals[i];
		return first;
	}
	
	public static float min(float first, float... vals)
	{
		for (int i : range(vals.length))
			first = first < vals[i] ? first : vals[i];
		return first;
	}
	
	public static double min(double first, double... vals)
	{
		for (int i : range(vals.length))
			first = first < vals[i] ? first : vals[i];
		return first;
	}
}