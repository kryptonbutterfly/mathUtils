package kryptonbutterfly.math.utils.range.bool;

import java.util.function.IntPredicate;

public record IndexBool(int index, boolean bool)
{
	public IndexBool(int index, IntPredicate source)
	{
		this(index, source.test(index));
	}
	
	public IndexBool(int index, boolean[] source)
	{
		this(index, source[index]);
	}
	
	@Override
	public String toString()
	{
		return "@%d : %b".formatted(index, bool);
	}
}
