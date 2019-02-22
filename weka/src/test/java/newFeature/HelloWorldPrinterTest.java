package newFeature;

import org.junit.Test;

import junit.framework.Assert;
import junit.framework.TestCase;

public class HelloWorldPrinterTest {
	
	@Test
	public void getTextReturnsHelloWorld() {
		Assert.assertEquals("Hello world", new HelloWolrdPrinter().getText());
	}
	
}
