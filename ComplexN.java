public class ComplexN extends Arithmetic {
  private double realPart;
  private double imaginaryPart;
  
  /**
   * 
   * Constructs a new ComplexN object representing a complex number with a given real and imaginary part.
   * @param realPart the real part of the complex number
   * @param imaginaryPart the imaginary part of the complex number
   */
  public ComplexN(double realPart, double imaginaryPart) {
    this.realPart = realPart;
    this.imaginaryPart = imaginaryPart;
  }
  
  /**
   * 
   * Returns the real part of the complex number.
   * @return the real part of the complex number
   */
  public double getRealPart() {
    return realPart;
  }
  /**
   * 
   * Returns the imaginary part of the complex number.
   * @return the imaginary part of the complex number
   */ 
  public double getImaginaryPart() {
    return imaginaryPart;
  }
  
  /**
   * 
   * Returns a string representation of the complex number in the form "realPart + imaginaryParti".
   * @return a string representation of the complex number
   */
  @Override
  public String toString() {
    return String.valueOf(getRealPart() + " + " + getImaginaryPart() + "i");
  }
  
  /**
   * 
   * Determines if this complex number is equal to another object.
   * @param o the other object to compare
   * @return true if the other object is a complex number with the same real and imaginary parts, false otherwise
   */
  @Override
  public boolean equals(Object o) {
    if (o instanceof ComplexN) {
      ComplexN c = (ComplexN) o;
      return realPart == c.realPart && imaginaryPart == c.imaginaryPart;
    }
    return false;
  }
}
