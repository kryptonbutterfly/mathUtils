package kryptonbutterfly.math.utils.range.bool;

import java.util.Iterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import kryptonbutterfly.math.utils.Max;
import kryptonbutterfly.math.utils.Min;
import kryptonbutterfly.math.utils.range.Range;

public final class BoolArrayRange
{
	private BoolArrayRange()
	{}
	
	public static final BoolIndexArrayRange range(boolean[] array)
	{
		return new BoolIndexArrayRange(array, Range.range(0, array.length));
	}
	
	public static final BoolIndexArrayRange rRange(boolean[] array)
	{
		return new BoolIndexArrayRange(array, Range.rRange(0, array.length));
	}
	
	public static final BoolIndexArrayRange range(int start, boolean[] array)
	{
		return new BoolIndexArrayRange(array, Range.range(Max.max(0, start), array.length));
	}
	
	public static final BoolIndexArrayRange range(boolean[] array, int stop)
	{
		return new BoolIndexArrayRange(array, Range.range(0, Min.min(array.length, stop)));
	}
	
	public static final BoolIndexArrayRange range(int start, int stop, boolean[] array)
	{
		return new BoolIndexArrayRange(array, Range.range(start, Min.min(array.length, stop)));
	}
	
	public static final class IndexArrayRange implements Iterable<Integer>
	{
		private final boolean[]	array;
		private final Range		range;
		
		private IndexArrayRange(boolean[] array, Range range)
		{
			this.array	= array;
			this.range	= range;
		}
		
		@Override
		public Iterator<Integer> iterator()
		{
			return this.range.iterator();
		}
		
		public ElementArrayRange element()
		{
			return new ElementArrayRange(array, range);
		}
		
		public BoolIndexArrayRange iElem()
		{
			return new BoolIndexArrayRange(array, range);
		}
		
		public IndexArrayRange reverse()
		{
			return new IndexArrayRange(array, range);
		}
		
		public Stream<Integer> stream()
		{
			return StreamSupport.stream(spliterator(), false);
		}
		
		/**
		 * @return The amount of steps this range requires to traverse or -1 if it takes
		 *         an infinite amount of steps.
		 */
		public int steps()
		{
			return this.range.steps();
		}
	}
	
	public static final class ElementArrayRange implements Iterable<Boolean>
	{
		private final boolean[]	array;
		private final Range		range;
		
		private ElementArrayRange(boolean[] array, Range range)
		{
			this.array	= array;
			this.range	= range;
		}
		
		@Override
		public Iterator<Boolean> iterator()
		{
			return new Iterator<Boolean>()
			{
				Iterator<Integer> iterator = range.iterator();
				
				@Override
				public boolean hasNext()
				{
					return iterator.hasNext();
				}
				
				@Override
				public Boolean next()
				{
					return array[iterator.next()];
				}
			};
		}
		
		public BoolIndexArrayRange iElem()
		{
			return new BoolIndexArrayRange(array, range);
		}
		
		public IndexArrayRange index()
		{
			return new IndexArrayRange(array, range);
		}
		
		public ElementArrayRange reverse()
		{
			return new ElementArrayRange(array, range.reverse());
		}
		
		public Stream<Boolean> stream()
		{
			return StreamSupport.stream(spliterator(), false);
		}
		
		/**
		 * @return The amount of steps this range requires to traverse or -1 if it takes
		 *         an infinite amount of steps.
		 */
		public int steps()
		{
			return this.range.steps();
		}
	}
	
	public static final class BoolIndexArrayRange implements Iterable<IndexBool>
	{
		private final boolean[]	array;
		private final Range		range;
		
		private BoolIndexArrayRange(boolean[] array, Range range)
		{
			this.array	= array;
			this.range	= range;
		}
		
		@Override
		public Iterator<IndexBool> iterator()
		{
			return new Iterator<IndexBool>()
			{
				Iterator<Integer> iterator = range.iterator();
				
				@Override
				public boolean hasNext()
				{
					return iterator.hasNext();
				}
				
				@Override
				public IndexBool next()
				{
					return new IndexBool(iterator.next(), array);
				}
			};
		}
		
		public IndexArrayRange index()
		{
			return new IndexArrayRange(array, range);
		}
		
		public ElementArrayRange element()
		{
			return new ElementArrayRange(array, range);
		}
		
		public BoolIndexArrayRange reverse()
		{
			return new BoolIndexArrayRange(array, range.reverse());
		}
		
		public Stream<IndexBool> stream()
		{
			return StreamSupport.stream(spliterator(), false);
		}
		
		/**
		 * @return The amount of steps this range requires to traverse or -1 if it takes
		 *         an infinite amount of steps.
		 */
		public int steps()
		{
			return this.range.steps();
		}
	}
}
