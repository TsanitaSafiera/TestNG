package class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation {

    @Test
    public void AFirstTestCase(){
        System.out.println("Hello i am the first test case");
    }
    @Test
    public  void BSecondTestCase(){
        System.out.println("I am second test case");
    }
    @Test
    public  void CThirdTestCase(){
        System.out.println("i am the third test case");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("i am before method");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("i am after method");
    }
}
