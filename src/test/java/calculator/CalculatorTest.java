package calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator objCalcUnderTest;

    @Before
    public void setUp() throws Exception {
        //Arrange
        objCalcUnderTest = new Calculator();
    }

    @Test
    public void factorial() {
        int n=5;
        int expect=120;
        //Act
        long fact = objCalcUnderTest.Factorial(n);
        //Assert
        Assert.assertEquals(expect, fact);
    }

    @Test
    public void main() {
    }
}