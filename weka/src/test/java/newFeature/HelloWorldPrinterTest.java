package newFeature;



import junit.framework.Assert;
import junit.framework.TestCase;

public class HelloWorldPrinterTest extends TestCase {
	private HelloWolrdPrinter printer = new HelloWolrdPrinter();
	  
	
	public void testgetText() {
	    assertEquals("Hello world", printer.getText());
	}
	
}
