package ru.apache_maven;

//import static org.junit.Assert.assertTrue;

//import org.junit.Test;
import org.junit.Assert;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
    /**
     * Rigorous Test :-)
     */
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }	
	public AppTest( String testName ){
        super( testName );
    }

    public static Test suite(){
        return new TestSuite( AppTest.class );
    }

    public void testApp(){
        assertTrue( false );
    }
    
    public void testFailed2(){
        assertTrue( false );
    }
    
    public void testFailed3(){
        assertTrue( false );
    }
    
    public void testFailed4(){
        assertTrue( false );
    }

    public void testFailed5(){
        assertTrue( false );
    }
    
    public void testFailed6(){
        assertTrue( false );
    }

    public void testFailed7(){
        assertTrue( true );
    }
    
    public void testFailed8(){
        assertTrue( false );
    }    
   public void testAssert() {
		 String message = new AppBean("Maven 2").sayHello();
         Assert.assertEquals("Test Hello Machine", "Hello Maven 2", message);
    }
    
  public void testAssert2() {
		 String message2 = "Test Sec";
         Assert.assertEquals("Second Test", "Test Sec", message2);
    }
}
