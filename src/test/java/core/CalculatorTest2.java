package core;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runners.MethodSorters;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.Ignore;

@FixMethodOrder(MethodSorters.NAME_ASCENDING) //(MethodSorters.JVM) //(MethodSorters.DEFAULT)
public class CalculatorTest2 {
	
	@BeforeClass  
	public static void beforeClass() {System.out.println("Start");}
	@AfterClass 
	public static void afterClass() {System.out.println("Finish");}

	@Test(timeout=1000) //@Ignore
	public void test_01_add_2() {System.out.println("Test # 01: Add 2 params");
		assertEquals("The result of addition isn't correct", Calculator.add(200.0, 150.0), 350.0, 0.09);}
	@Test(timeout=1000) //@Ignore
	public void test_02_add_2() {System.out.println("Test # 02: Add 2 params");
		assertEquals("The result of addition isn't correct", Calculator.add(222.0, 150.0), 372.0, 0.09);}
	@Test(timeout=1000) //@Ignore
	public void test_03_add_3() {System.out.println("Test # 03: Add 3 params");
		assertEquals("The result of addition isn't correct", Calculator.add(8.0, 5.0, 7.0), 20.0, 0.09);}
	@Test(timeout=1000) //@Ignore
	public void test_04_add_3() {System.out.println("Test # 04: Add 3 params");
		assertEquals("The result of addition isn't correct", Calculator.add(80.0, 5.0, 7.0), 92.0, 0.09);}
	@Test(timeout=1000) //@Ignore
	public void test_05_add_4() {System.out.println("Test # 05: Add 4 params");
		assertEquals("The result of addition isn't correct", Calculator.add(183.3, 0.7, 10.0, 74.0), 268.0, 0.09);}
	@Test(timeout=1000) //@Ignore
	public void test_06_add_4() {System.out.println("Test # 06: Add 4 params");
		assertEquals("The result of addition isn't correct", Calculator.add(183.3, 0.7, 10.0, 75.0), 269.0, 0.09);}
	@Test(timeout=1000) //@Ignore
	public void test_07_add_5() {System.out.println("Test # 07: Add 5 params");
		assertEquals("The result of addition isn't correct", Calculator.add(183.3, 0.7, 10.0, 75.0, 5.0), 274.0, 0.09);}
	@Test(timeout=1000) //@Ignore
	public void test_08_add_5() {System.out.println("Test # 08: Add 5 params");
		assertEquals("The result of addition isn't correct", Calculator.add(183.3, 0.7, 10.0, 75.0, 10.0), 279.0, 0.09);}
	
	@Test(timeout=1000) //@Ignore
	public void test_09_divide_2() {System.out.println("Test # 09: Divide 2 params");
		assertEquals("The result of division isn't correct", Calculator.divide(90.0, 30.0), 3.0, 0.09);}
	@Test(timeout=1000) //@Ignore
	public void test_10_divide_2() {System.out.println("Test # 10: Divide 2 params");
		assertEquals("The result of division isn't correct", Calculator.divide(90.0, 45.0), 2.0, 0.09);}
	@Test(timeout=1000) //@Ignore
	public void test_11_divide_3() {System.out.println("Test # 11: Divide 3 params");
		assertEquals("The result of division isn't correct", Calculator.divide(400.0, 2.0, 2.0), 100.0, 0.09);}
	@Test(timeout=1000) //@Ignore
	public void test_12_divide_3() {System.out.println("Test # 12: Divide 3 params");
		assertEquals("The result of division isn't correct", Calculator.divide(500.0, 0.5, 2.0), 500.0, 0.09);}
	@Test(timeout=1000) //@Ignore
	public void test_13_divide_4() {System.out.println("Test # 13: Divide 4 params");
		assertEquals("The result of division isn't correct", Calculator.divide(600.0, 50.0, 4.0, 2.0), 1.5, 0.09);}
	@Test(timeout=1000) //@Ignore
	public void test_14_divide_4() {System.out.println("Test # 14: Divide 4 params");
		assertEquals("The result of division isn't correct", Calculator.divide(100.0, 50.0, 1.0, 2.0), 1.0, 0.09);}
	@Test(timeout=1000) //@Ignore
	public void test_15_divide_5() {System.out.println("Test # 15: Divide 5 params");
		assertEquals("The result of division isn't correct", Calculator.divide(100.0, 50.0, 1.0, 2.0, 0.5), 2.0, 0.09);}
	@Test(timeout=1000) //@Ignore
	public void test_16_divide_5() {System.out.println("Test # 16: Divide 5 params");
		assertEquals("The result of division isn't correct", Calculator.divide(20.0, 20.0, 2.0, 2.0, 0.5), 0.5, 0.09);}
	
	@Test(timeout=1000) //@Ignore
	public void test_17_multiply_2() {System.out.println("Test # 17: Multiply 2 params");
		assertEquals("The result of multiplication isn't correct", Calculator.multiply(9.0, 5.0), 45.0, 0.09);}
	@Test(timeout=1000) //@Ignore
	public void test_18_multiply_2() {System.out.println("Test # 18: Multiply 2 params");
		assertEquals("The result of multiplication isn't correct", Calculator.multiply(20.0, 5.0), 100.0, 0.09);}
	@Test(timeout=1000) //@Ignore
	public void test_19_multiply_3() {System.out.println("Test # 19: Multiply 3 params");
		assertEquals("The result of multiplication isn't correct", Calculator.multiply(20.0, 5.0, 16.0), 1600.0, 0.09);}
	@Test(timeout=1000) //@Ignore
	public void test_20_multiply_3() {System.out.println("Test # 20: Multiply 3 params");
		assertEquals("The result of multiplication isn't correct", Calculator.multiply(20.0, 5.0, 4.0), 400.0, 0.09);}
	@Test(timeout=1000) //@Ignore
	public void test_21_multiply_4() {System.out.println("Test # 21: Multiply 4 params");
		assertEquals("The result of multiplication isn't correct", Calculator.multiply(24.0, 4.0, 10.0, 5.0), 4800.0, 0.09);}
	@Test(timeout=1000) //@Ignore
	public void test_22_multiply_4() {System.out.println("Test # 22: Multiply 4 params");
		assertEquals("The result of multiplication isn't correct", Calculator.multiply(24.0, 4.0, 10.0, 1.0), 960.0, 0.09);}
	
	@Test(timeout=1000) //@Ignore
	public void test_23_subtract_2() {System.out.println("Test # 23: Subtract 2 params");
		assertEquals("The result of subtraction isn't correct", Calculator.subtract(28.0, 14.0), 14.0, 0.09);}
	@Test(timeout=1000) //@Ignore
	public void test_24_subtract_2() {System.out.println("Test # 24: Subtract 2 params");
		assertEquals("The result of subtraction isn't correct", Calculator.subtract(30.0, 29.0), 1.0, 0.09);}
	@Test(timeout=1000) //@Ignore
	public void test_25_subtract_3() {System.out.println("Test # 25: Subtract 3 params");
		assertEquals("The result of subtraction isn't correct", Calculator.subtract(220.0, 20.0, 120.0), 80.0, 0.09);}
	@Test(timeout=1000) //@Ignore
	public void test_26_subtract_3() {System.out.println("Test # 26: Subtract 3 params");
		assertEquals("The result of subtraction isn't correct", Calculator.subtract(220.0, 120.0, 50.0), 50.0, 0.09);}
	@Test(timeout=1000) //@Ignore
	public void test_27_subtract_4() {System.out.println("Test # 27: Subtract 4 params");
		assertEquals("The result of subtraction isn't correct", Calculator.subtract(400.0, 150.0, 50.0, 45.0), 155.0, 0.09);}
	@Test(timeout=1000) //@Ignore
	public void test_28_subtract_4() {System.out.println("Test # 28: Subtract 4 params");
		assertEquals("The result of subtraction isn't correct", Calculator.subtract(100.0, 50.0, 25.0, 5.0), 20.0, 0.09);}
	
	@Test(timeout=1000) //@Ignore
	public void test_29_reminder() {System.out.println("Test # 29: Reminder 2 params");
		assertEquals("The reminder of division isn't correct", Calculator.reminder(5, 2), 1.0, 0.09);}
		
}


