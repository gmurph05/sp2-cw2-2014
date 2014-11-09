package FractionCalculator;

public class Fraction {
	
    private int numerator;
    private int denominator;
	
	public Fraction(int num, int denom) {
		if (denom == 0) {
			//System.out.println("Invalid fraction with denominator 0");
			// this should use exceptions
			throw new IllegalArgumentException("Invalid fraction with denominator 0");
            //return;
		}
		int gcd = myGcd(num, denom);
        setNumerator(num / gcd);
        setDenominator(denom / gcd);
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
        return "" + getNumerator() + '/' + getDenominator();
    }

	/**
	 * @return the numerator
	 */
	public int getNumerator() {
		return numerator;
	}

	/**
	 * @param numerator the numerator to set
	 */
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	/**
	 * @return the denominator
	 */
	public int getDenominator() {
		return denominator;
	}

	/**
	 * @param denominator the denominator to set
	 */
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	
	

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		//int result = 1;
		int result = numerator;
		result = prime * result + denominator;
		return result;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		/*if (getClass() != obj.getClass()) {
			return false;
		}*/
		
		Fraction other = (Fraction) obj;

		if (getDenominator() != other.getDenominator()) { 
			return false;
		}
	
		if (getNumerator() != other.getNumerator()){
			return false;
		}
		return true;
	}

	
	// Multiply method to multiply fractions
	public Fraction multiply(Fraction other) {
		// TODO Auto-generated method stub
		int num = this.getNumerator() * other.getNumerator();
        int denom = this.getDenominator() * other.getDenominator();
        return new Fraction(num, denom);
	}
	
	//Greatest Common Divisor
	private int myGcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
	
	public Fraction add(Fraction other) {
		// TODO Auto-generated method stub
		int num = this.getNumerator() * other.getDenominator() + other.getNumerator()*this.getDenominator();
        int denom = this.getDenominator() * other.getDenominator();
        return new Fraction(num, denom);
	}


	public Fraction subtract(Fraction other) {
		// TODO Auto-generated method stub
		return null;
	}

	public Fraction negate() {
		// TODO Auto-generated method stub
		int num = this.getNumerator() * -1;
	    int denom = this.getDenominator();
	    return new Fraction(num,denom);

	}
}
