package Main;

import java.util.ArrayList;

public class Fraction implements IFraction {

	private int numerator;
	private int denominator;

	public Fraction(int numerator, int denominator) {
		super();
		if (denominator == 0) {
			try {
				throw new Exception("Denominator is null!");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public Fraction(int numerator) {
		this.numerator = numerator;
		this.denominator = 1;
	}

	public Fraction plus(Fraction fraction) {
		Fraction sumFraction = new Fraction(
				this.numerator * fraction.denominator + fraction.numerator * this.denominator,
				this.denominator * fraction.denominator);
		Fraction result = reduction(sumFraction);
		return result;
	}

	public Fraction minus(Fraction fraction) {
		Fraction minusFraction = new Fraction(
				this.numerator * fraction.denominator - fraction.numerator * this.denominator,
				this.denominator * fraction.denominator);
		Fraction result = reduction(minusFraction);
		return result;
	}

	public Fraction multiply(Fraction fraction) {
		Fraction multiplyFraction = new Fraction(this.numerator * fraction.numerator,
				this.denominator * fraction.denominator);
		Fraction result = reduction(multiplyFraction);
		return result;
	}

	public Fraction divide(Fraction fraction) {
		Fraction divideFraction = this.multiply(new Fraction(fraction.denominator, fraction.numerator));
		Fraction result = reduction(divideFraction);
		return result;
	}

	private Fraction reduction(Fraction fraction) {
		while (fraction.getNumerator() % 10 == 0 && fraction.getDenominator() % 10 == 0) {
			fraction.setNumerator(fraction.getNumerator() / 10);
			fraction.setDenominator(fraction.getDenominator() / 10);
		}
		ArrayList<Integer> decompositionNumerator = decomposition(fraction.numerator);
		ArrayList<Integer> decompositioDenominator = decomposition(fraction.denominator);
		ArrayList<Integer> generalNumber;
		if (decompositionNumerator.size() <= decompositioDenominator.size()) {
			decompositionNumerator.retainAll(decompositioDenominator);
			generalNumber = decompositionNumerator;
		} else {
			decompositioDenominator.retainAll(decompositionNumerator);
			generalNumber = decompositioDenominator;
		}
		int nod = 1;
		for (Integer x : generalNumber) {
			nod = nod * x;
		}
		fraction.numerator = fraction.numerator / nod;
		fraction.denominator = fraction.denominator / nod;
		return fraction;
	}

	private ArrayList<Integer> decomposition(int number) {
		ArrayList<Integer> arrayNumerator = new ArrayList();
		int i = 2;
		while (number != 1) {
			int surplus = number % i;
			if (surplus == 0) {
				number = number / i;
				arrayNumerator.add(i);

			} else {
				i++;
			}
		}
		return arrayNumerator;
	}

	public String toString() {
		if (this.numerator <= this.denominator) {
			return this.numerator + "/" + this.denominator;
		} else {
			int unit = this.numerator / this.denominator;
			if (this.numerator % this.denominator == 0) {
				return unit + "";
			} else {
				return unit + " " + this.numerator % this.denominator + "/" + this.denominator;
			}
		}
	}

	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

}
