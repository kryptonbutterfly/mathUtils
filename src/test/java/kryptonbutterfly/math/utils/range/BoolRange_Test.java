package kryptonbutterfly.math.utils.range;

import static kryptonbutterfly.math.utils.range.Range.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public final class BoolRange_Test
{
	final Random rand = new Random();
	
	@TestFactory
	Stream<DynamicTest> test()
	{
		return IntStream.range(0, 10)
			.mapToObj(this::generate)
			.map(a -> DynamicTest.dynamicTest("range(boolean[%s])".formatted(a.length), () ->
			{
				final var range = range(a);
				assertEquals(a.length, range.steps());
				
				final var it = range.iterator();
				for (int i = 0; i < a.length; i++)
				{
					assertTrue(it.hasNext());
					final var ie = it.next();
					
					assertEquals(a[i], ie.element());
					assertEquals("@%d : %b".formatted(i, a[i]), ie.toString());
				}
				assertFalse(it.hasNext());
				assertThrows(NoSuchElementException.class, () -> it.next());
				
			}));
	}
	
	@TestFactory
	Stream<DynamicTest> testReverse()
	{
		return IntStream.range(0, 10)
			.mapToObj(this::generate)
			.map(a -> DynamicTest.dynamicTest("rRange(boolean[%s])".formatted(a.length), () ->
			{
				final var range = rRange(a);
				assertEquals(a.length, range.steps());
				
				final var it = range.iterator();
				for (int i = 0; i < a.length; i++)
				{
					assertTrue(it.hasNext());
					
					boolean value = a[a.length - i - 1];
					assertEquals(value, it.next().element());
				}
				assertFalse(it.hasNext());
				assertThrows(NoSuchElementException.class, () -> it.next());
			}));
	}
	
	private boolean[] generate(int length)
	{
		final var array = new boolean[length];
		for (int i : range(length))
			array[i] = rand.nextBoolean();
		return array;
	}
}
