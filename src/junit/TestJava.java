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
        System.out.println("@Test");//�����Լ�Ҫ���Եķ���  
    }  
      
    @Test  
    public void testAssert() {  
        assertEquals("chenleixing","chenleixing");  
    }  
      
    @Test(timeout=20)  
    public void testTimeout() {  
        System.out.println("��ʱ����");  
    }  
  
    @Before  
    public void testBefore(){  
        System.out.println("@Before");  
    }  
      
    @BeforeClass  
    public static void testBeforeClass(){//����Ϊ��̬����  
        System.out.println("@BeforeClass");  
    }  
      
    @After  
    public void testAfter(){  
        System.out.println("@After");  
    }  
      
    @AfterClass  
    public static void testAfterClass(){//����Ϊ��̬����  
        System.out.println("@AfterClass");  
    }  
      
    @Ignore  
    public void testIgnore(){  
        System.out.println("@Ignore");  
    }  
}  