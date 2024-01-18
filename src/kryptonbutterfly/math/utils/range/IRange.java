package kryptonbutterfly.math.utils.range;

public interface IRange<T, E extends IRange<T, E>> extends Iterable<T>
{
	public E reverse();
}