package kryptonbutterfly.math.utils.range.utils;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import kryptonbutterfly.math.utils.range.Range;

public abstract class ARange<A, IE> implements Iterable<IE>
{
	protected final A		array;
	protected final Range	range;
	
	protected ARange(A array, Range range)
	{
		this.array	= array;
		this.range	= range;
	}
	
	public final Stream<IE> stream()
	{
		return StreamSupport.stream(spliterator(), false);
	}
	
	/**
	 * @return The amount of steps this range requires to traverse or -1 if it takes
	 *         an infinite amount of steps.
	 */
	public final int steps()
	{
		return this.range.steps();
	}
}
