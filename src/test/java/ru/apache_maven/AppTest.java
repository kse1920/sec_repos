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
    /**@Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }*/
	
	public AppTest( String testName ){
        super( testName );
    }

    public static Test suite(){
        return new TestSuite( AppTest.class );
    }

    public void testApp(){
        assertTrue( true );
    }
    
    public void testFalse(){
        assertTrue( false );
    }
    
    public void testFalse2(){
        assertTrue( false );
    }
    
    public void testFalse3(){
        assertTrue( false );
    }
    
    public void testFalse4(){
        assertTrue( false );
    }
    
    public void testFalse4(){
        assertTrue( true );
    }

    public void testAssert() {
		 String message = new AppBean("Maven 2").sayHello();
         Assert.assertEquals("Test Hello Machine", "Hello Maven 2", message);
    }
}
