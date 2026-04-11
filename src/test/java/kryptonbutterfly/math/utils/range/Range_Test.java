package kryptonbutterfly.math.utils.range;

import static kryptonbutterfly.math.utils.range.Range.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;

public final class Range_Test
{
	@Test
	public void testRangeIterator()
	{
		final var range = range(10);
		
		var it = range.iterator();
		for (; it.hasNext(); it.next());
		
		assertThrows(NoSuchElementException.class, () -> it.next());
	}
	
	@Test
	public void testRangeIteratorNoSteps()
	{
		final var range = range(0, 0);
		
		var it = range.iterator();
		for (; it.hasNext(); it.next());
		
		assertThrows(NoSuchElementException.class, () -> it.next());
	}
	
	@Test
	public void testRangeIteratorInfSteps()
	{
		final int	start	= 0;
		final var	range	= range(start, 0, 0);
		
		var it = range.iterator();
		assertTrue(it.hasNext());
		assertEquals(start, it.next());
		assertEquals(-1, range.steps());
	}
	
	@Test
	public void testRangeIteratorReverse()
	{
		final var range = rRange(0, 10);
		
		var it = range.iterator();
		for (; it.hasNext(); it.next());
		
		assertThrows(NoSuchElementException.class, () -> it.next());
	}
	
	@Test
	public void testRangeCountSteps()
	{
		range(0, 10, 2);
	}
	
	@Test
	public void testRangeReverseCountSteps()
	{
		range(0, 10, 2).reverse();
	}
	
	@Test
	public void testRangeInvalid()
	{
		assertThrows(IllegalStateException.class, () -> range(0, 10, -2));
	}
	
	@Test
	public void testRangeReverseInvalid()
	{
		assertThrows(IllegalStateException.class, () -> range(10, 0, 2));
	}
}
