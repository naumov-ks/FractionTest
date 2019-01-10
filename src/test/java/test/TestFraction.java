package test;

import org.junit.Assert;
import org.junit.Test;

import Main.Fraction;

public class TestFraction {

	@Test
	public void testFractionIntInt() {
		Fraction a = new Fraction(1, 3);
		Assert.assertNotNull(a);
	}

	@Test
	public void testFractionInt() {
		Fraction a = new Fraction(5);
		Assert.assertNotNull(a);
	}

	@Test
	public void testPlusNumerator() {
		Fraction a = new Fraction(1, 4);
		Fraction b = new Fraction(25, 100);
		Fraction res = a.plus(b);
		Assert.assertEquals(1, res.getNumerator());
	}

	@Test
	public void testPlusDenominator() {
		Fraction a = new Fraction(1, 4);
		Fraction b = new Fraction(25, 100);
		Fraction res = a.plus(b);
		Assert.assertEquals(2, res.getDenominator());
	}

	@Test
	public void testMinusNumerator() {
		Fraction a = new Fraction(2, 4);
		Fraction b = new Fraction(25, 100);
		Fraction res = a.minus(b);
		Assert.assertEquals(1, res.getNumerator());
	}

	@Test
	public void testMinusDenominator() {
		Fraction a = new Fraction(2, 4);
		Fraction b = new Fraction(25, 100);
		Fraction res = a.minus(b);
		Assert.assertEquals(4, res.getDenominator());
	}

	@Test
	public void testMultiplyNumerator() {
		Fraction a = new Fraction(2, 4);
		Fraction b = new Fraction(25, 100);
		Fraction res = a.multiply(b);
		Assert.assertEquals(1, res.getNumerator());
	}

	@Test
	public void testMultiplyDenominator() {
		Fraction a = new Fraction(2, 4);
		Fraction b = new Fraction(25, 100);
		Fraction res = a.multiply(b);
		Assert.assertEquals(8, res.getDenominator());
	}

	@Test
	public void testDivideNumerator() {
		Fraction a = new Fraction(2, 4);
		Fraction b = new Fraction(25, 100);
		Fraction res = a.divide(b);
		Assert.assertEquals(2, res.getNumerator());
	}

	@Test
	public void testDivideDenominator() {
		Fraction a = new Fraction(2, 4);
		Fraction b = new Fraction(25, 100);
		Fraction res = a.divide(b);
		Assert.assertEquals(1, res.getDenominator());
	}

}
