package kryptonbutterfly.math.utils.range;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Supplier;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import kryptonbutterfly.math.utils.range.ArrayRange.ElementIndexArrayRange;
import kryptonbutterfly.math.utils.range.ListRange.ElementIndexListRange;
import kryptonbutterfly.math.utils.range.bool_.BooleanArrayRange;
import kryptonbutterfly.math.utils.range.bool_.IndexBooleanArrayRange;
import kryptonbutterfly.math.utils.range.byte_.ByteArrayRange;
import kryptonbutterfly.math.utils.range.byte_.IndexByteArrayRange;
import kryptonbutterfly.math.utils.range.char_.CharacterArrayRange;
import kryptonbutterfly.math.utils.range.char_.IndexCharacterArrayRange;
import kryptonbutterfly.math.utils.range.double_.DoubleArrayRange;
import kryptonbutterfly.math.utils.range.double_.IndexDoubleArrayRange;
import kryptonbutterfly.math.utils.range.float_.FloatArrayRange;
import kryptonbutterfly.math.utils.range.float_.IndexFloatArrayRange;
import kryptonbutterfly.math.utils.range.int_.IndexIntegerArrayRange;
import kryptonbutterfly.math.utils.range.int_.IntegerArrayRange;
import kryptonbutterfly.math.utils.range.long_.IndexLongArrayRange;
import kryptonbutterfly.math.utils.range.long_.LongArrayRange;
import kryptonbutterfly.math.utils.range.short_.IndexShortArrayRange;
import kryptonbutterfly.math.utils.range.short_.ShortArrayRange;

public class Range implements Iterable<Integer>
{
	// ----- String
	public static StringRange range(CharSequence str)
	{
		return StringRange.range(str);
	}
	
	public static StringRange rRange(CharSequence str)
	{
		return StringRange.rRange(str);
	}
	
	public static StringRange range(int start, CharSequence str)
	{
		return StringRange.range(start, str);
	}
	
	public static StringRange rRange(int start, CharSequence str)
	{
		return StringRange.rRange(start, str);
	}
	
	public static StringRange range(int start, int stop, CharSequence str)
	{
		return StringRange.range(start, stop, str);
	}
	
	public static StringRange rRange(int start, int stop, CharSequence str)
	{
		return StringRange.rRange(start, stop, str);
	}
	
	// ----- boolean[]
	public static IndexBooleanArrayRange range(boolean[] array)
	{
		return BooleanArrayRange.range(array);
	}
	
	public static IndexBooleanArrayRange rRange(boolean[] array)
	{
		return BooleanArrayRange.rRange(array);
	}
	
	public static IndexBooleanArrayRange range(int start, boolean[] array)
	{
		return BooleanArrayRange.range(start, array);
	}
	
	public static IndexBooleanArrayRange range(boolean[] array, int stop)
	{
		return BooleanArrayRange.range(array, stop);
	}
	
	public static IndexBooleanArrayRange range(int start, int stop, boolean[] array)
	{
		return BooleanArrayRange.range(start, stop, array);
	}
	
	// ----- byte[]
	public static IndexByteArrayRange range(byte[] array)
	{
		return ByteArrayRange.range(array);
	}
	
	public static IndexByteArrayRange rRange(byte[] array)
	{
		return ByteArrayRange.rRange(array);
	}
	
	public static IndexByteArrayRange range(int start, byte[] array)
	{
		return ByteArrayRange.range(start, array);
	}
	
	public static IndexByteArrayRange range(byte[] array, int stop)
	{
		return ByteArrayRange.range(array, stop);
	}
	
	public static IndexByteArrayRange range(int start, int stop, byte[] array)
	{
		return ByteArrayRange.range(start, stop, array);
	}
	
	// ----- char[]
	public static IndexCharacterArrayRange range(char[] array)
	{
		return CharacterArrayRange.range(array);
	}
	
	public static IndexCharacterArrayRange rRange(char[] array)
	{
		return CharacterArrayRange.rRange(array);
	}
	
	public static IndexCharacterArrayRange range(int start, char[] array)
	{
		return CharacterArrayRange.range(start, array);
	}
	
	public static IndexCharacterArrayRange range(char[] array, int stop)
	{
		return CharacterArrayRange.range(array, stop);
	}
	
	public static IndexCharacterArrayRange range(int start, int stop, char[] array)
	{
		return CharacterArrayRange.range(start, stop, array);
	}
	
	// ----- short[]
	public static IndexShortArrayRange range(short[] array)
	{
		return ShortArrayRange.range(array);
	}
	
	public static IndexShortArrayRange rRange(short[] array)
	{
		return ShortArrayRange.rRange(array);
	}
	
	public static IndexShortArrayRange range(int start, short[] array)
	{
		return ShortArrayRange.range(start, array);
	}
	
	public static IndexShortArrayRange range(short[] array, int stop)
	{
		return ShortArrayRange.range(array, stop);
	}
	
	public static IndexShortArrayRange range(int start, int stop, short[] array)
	{
		return ShortArrayRange.range(start, stop, array);
	}
	
	// ----- int[]
	public static IndexIntegerArrayRange range(int[] array)
	{
		return IntegerArrayRange.range(array);
	}
	
	public static IndexIntegerArrayRange rRange(int[] array)
	{
		return IntegerArrayRange.rRange(array);
	}
	
	public static IndexIntegerArrayRange range(int start, int[] array)
	{
		return IntegerArrayRange.range(start, array);
	}
	
	public static IndexIntegerArrayRange range(int[] array, int stop)
	{
		return IntegerArrayRange.range(array, stop);
	}
	
	public static IndexIntegerArrayRange range(int start, int stop, int[] array)
	{
		return IntegerArrayRange.range(start, stop, array);
	}
	
	// ----- float[]
	public static IndexFloatArrayRange range(float[] array)
	{
		return FloatArrayRange.range(array);
	}
	
	public static IndexFloatArrayRange rRange(float[] array)
	{
		return FloatArrayRange.rRange(array);
	}
	
	public static IndexFloatArrayRange range(int start, float[] array)
	{
		return FloatArrayRange.range(start, array);
	}
	
	public static IndexFloatArrayRange range(float[] array, int stop)
	{
		return FloatArrayRange.range(array, stop);
	}
	
	public static IndexFloatArrayRange range(int start, int stop, float[] array)
	{
		return FloatArrayRange.range(start, stop, array);
	}
	
	// ----- long[]
	public static IndexLongArrayRange range(long[] array)
	{
		return LongArrayRange.range(array);
	}
	
	public static IndexLongArrayRange rRange(long[] array)
	{
		return LongArrayRange.rRange(array);
	}
	
	public static IndexLongArrayRange range(int start, long[] array)
	{
		return LongArrayRange.range(start, array);
	}
	
	public static IndexLongArrayRange range(long[] array, int stop)
	{
		return LongArrayRange.range(array, stop);
	}
	
	public static IndexLongArrayRange range(int start, int stop, long[] array)
	{
		return LongArrayRange.range(start, stop, array);
	}
	
	// ----- double[]
	public static IndexDoubleArrayRange range(double[] array)
	{
		return DoubleArrayRange.range(array);
	}
	
	public static IndexDoubleArrayRange rRange(double[] array)
	{
		return DoubleArrayRange.rRange(array);
	}
	
	public static IndexDoubleArrayRange range(int start, double[] array)
	{
		return DoubleArrayRange.range(start, array);
	}
	
	public static IndexDoubleArrayRange range(double[] array, int stop)
	{
		return DoubleArrayRange.range(array, stop);
	}
	
	public static IndexDoubleArrayRange range(int start, int stop, double[] array)
	{
		return DoubleArrayRange.range(start, stop, array);
	}
	
	// ----- T[]
	public static <T> ElementIndexArrayRange<T> range(T[] array)
	{
		return ArrayRange.range(array);
	}
	
	public static <T> ElementIndexArrayRange<T> rRange(T[] array)
	{
		return ArrayRange.rRange(array);
	}
	
	public static <T> ElementIndexArrayRange<T> range(int start, T[] array)
	{
		return ArrayRange.range(start, array);
	}
	
	public static <T> ElementIndexArrayRange<T> range(T[] array, int stop)
	{
		return ArrayRange.range(array, stop);
	}
	
	public static <T> ElementIndexArrayRange<T> range(int start, int stop, T[] array)
	{
		return ArrayRange.range(start, stop, array);
	}
	
	// ----- List<T>
	public static <T> ElementIndexListRange<T> range(List<T> list)
	{
		return ListRange.range(list);
	}
	
	public static <T> ElementIndexListRange<T> range(int start, List<T> list)
	{
		return ListRange.range(start, list);
	}
	
	public static <T> ElementIndexListRange<T> range(List<T> list, int stop)
	{
		return ListRange.range(list, stop);
	}
	
	public static <T> ElementIndexListRange<T> rRange(List<T> list)
	{
		return ListRange.rRange(list);
	}
	
	public static Range range(int stop)
	{
		return new Range(0, stop, 1);
	}
	
	public static Range range(int start, int stop)
	{
		return new Range(start, stop, 1);
	}
	
	/**
	 * @param start
	 * @param stop
	 * @return the same as
	 *         {@linkplain Range#range(int start, int stop)}.{@linkplain #reverse()}
	 */
	public static Range rRange(int start, int stop)
	{
		return new Range(stop - 1, start - 1, -1);
	}
	
	public static Range range(int start, int stop, int step)
	{
		return new Range(start, stop, step);
	}
	
	public final int							start, stop, step;
	private final int							steps;
	private final Supplier<Iterator<Integer>>	iteratorSupplier;
	
	private Range(int start, int stop, int step)
	{
		this.start	= start;
		this.stop	= stop;
		this.step	= step;
		validate();
		this.steps				= countSteps(start, stop, step);
		this.iteratorSupplier	= assignIterator();
	}
	
	public Range reverse()
	{
		return new Range(this.stop - this.step, this.start - this.step, -this.step);
	}
	
	/**
	 * @return The amount of steps this range requires to traverse or -1 if it takes
	 *         an infinite amount of steps.
	 */
	public int steps()
	{
		return steps;
	}
	
	private static int countSteps(int start, int stop, int step)
	{
		if (step == 0)
		{
			return -1;
		}
		else if (start == stop)
		{
			return 0;
		}
		else
		{
			final int adjustor;
			if (step > 1)
			{
				adjustor = step - 1;
			}
			else if (step < -1)
			{
				adjustor = step + 1;
			}
			else
			{
				adjustor = 0;
			}
			return (stop - start + adjustor) / step;
		}
	}
	
	private void validate()
	{
		if (start > stop)
		{
			if (step > 0)
			{
				throw new IllegalStateException("Invalid Range: step must not be positive if start > stop");
			}
		}
		if (start < stop)
		{
			if (step < 0)
			{
				throw new IllegalStateException("Invalid Range: step must not be negative if start < stop");
			}
		}
	}
	
	private Supplier<Iterator<Integer>> assignIterator()
	{
		if (this.step == 0)
		{
			return () -> new Iterator<Integer>()
			{
				
				@Override
				public boolean hasNext()
				{
					return true;
				}
				
				@Override
				public Integer next()
				{
					return start;
				}
				
			};
		}
		if (this.start == this.stop)
		{
			return () -> new Iterator<Integer>()
			{
				
				@Override
				public boolean hasNext()
				{
					return false;
				}
				
				@Override
				public Integer next()
				{
					throw new NoSuchElementException("The range contains no elements!");
				}
			};
		}
		if (this.step > 0)
		{
			return () -> new Iterator<Integer>()
			{
				private int next = start;
				
				@Override
				public boolean hasNext()
				{
					return next < stop;
				}
				
				@Override
				public Integer next()
				{
					if (!hasNext())
						throw new NoSuchElementException("This range contains no more elements!");
					int current = next;
					this.next += step;
					return current;
				}
				
			};
		}
		else
		{
			return () -> new Iterator<Integer>()
			{
				private int next = start;
				
				@Override
				public boolean hasNext()
				{
					return next > stop;
				}
				
				@Override
				public Integer next()
				{
					if (!hasNext())
						throw new NoSuchElementException("This range contains no more elements!");
					int current = next;
					this.next += step;
					return current;
				}
				
			};
		}
	}
	
	@Override
	public Iterator<Integer> iterator()
	{
		return this.iteratorSupplier.get();
	}
	
	public Stream<Integer> stream()
	{
		return StreamSupport.stream(spliterator(), false);
	}
}