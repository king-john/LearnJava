package junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestJava {  
	  
    @Test  
    public void testMain() {  
        fail("Not yet implemented");  
    }  
  
    @Test  
    public void testTest() {  
        System.out.println("@Test");//调用自己要测试的方法  
    }  
      
    @Test  
    public void testAssert() {  
        assertEquals("chenleixing","chenleixing");  
    }  
      
    @Test(timeout=20)  
    public void testTimeout() {  
        System.out.println("超时测试");  
    }  
  
    @Before  
    public void testBefore(){  
        System.out.println("@Before");  
    }  
      
    @BeforeClass  
    public static void testBeforeClass(){//必须为静态方法  
        System.out.println("@BeforeClass");  
    }  
      
    @After  
    public void testAfter(){  
        System.out.println("@After");  
    }  
      
    @AfterClass  
    public static void testAfterClass(){//必须为静态方法  
        System.out.println("@AfterClass");  
    }  
      
    @Ignore  
    public void testIgnore(){  
        System.out.println("@Ignore");  
    }  
}  