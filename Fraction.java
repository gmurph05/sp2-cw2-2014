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
	
	// Start of add method
	public Fraction add(Fraction other) {
		// TODO Auto-generated method stub
		int num = this.getNumerator() * other.getDenominator() + other.getNumerator()*this.getDenominator();
        int denom = this.getDenominator() * other.getDenominator();
        return new Fraction(num, denom);
	}//end of add method

	
	// start of subtract method
	public Fraction subtract(Fraction other) {
		// TODO Auto-generated method stub
        Fraction x = this.add(other.negate());
		return x;
	}// end of subtract method

	// start of negate method - negates the sign of any fraction
	public Fraction negate() {
		// TODO Auto-generated method stub
		int num = this.getNumerator();
		int denom = this.getDenominator();
		
		if(num < 0){
			if(denom < 0){
				denom = denom * -1;
				return new Fraction(num,denom);
			}
			num = num * -1;
			return new Fraction(num,denom);
		}
		if(denom < 0){
			denom = denom * -1;
			return new Fraction(num,denom);
		}
		num = num * -1;
	    return new Fraction(num,denom);
	    
	}// end of negate method
	
	// Start of reciprocal method to invert a fraction
	public Fraction reciprocal(){
		Fraction x = new Fraction(this.getDenominator(),this.getNumerator());
		return x;
	}

	// start of absValue method to return the absolute value of a fraction
	/*public Fraction absValue() {
		// TODO Auto-generated method stub
		int num = numerator;
		int denom = denominator;
		if(this.getNumerator() < 0){
			num = negate(this.getNumerator());
		}
		else{
			num = this.getNumerator();
		}
			
	    if(this.getDenominator() < 0){
	    	denom = negate(this.getDenominator());
	    }
	    else{
	    	denom = this.getDenominator();
	    }
	    
	    return new Fraction(num,denom);
	}// end of absValue method
*/

	public Fraction divide(Fraction other) {
		// TODO Auto-generated method stub
		Fraction x = this.multiply(other.reciprocal());
		return x;
	}
}
