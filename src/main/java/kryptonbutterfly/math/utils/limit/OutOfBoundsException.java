package kryptonbutterfly.math.utils.limit;

public class OutOfBoundsException extends RuntimeException
{
	private static final long	serialVersionUID		= 7533890917054854372L;
	private static final String	messageTemplateDouble	= "%s is %f but has to be between %f and %f.";
	private static final String	messageTemplateInteger	= "%s is %d but has to be between %d and %d.";
	
	public OutOfBoundsException(double min, double value, double max, String valueName)
	{
		this(String.format(messageTemplateDouble, valueName, value, min, max));
	}
	
	public OutOfBoundsException(long min, long value, long max, String valueName)
	{
		this(String.format(messageTemplateInteger, valueName, value, min, max));
	}
	
	public OutOfBoundsException(String msg)
	{
		super(msg);
	}
}