public class RealN extends ComplexN{
  
  private double real;
  private double temp;
  
  public RealN(double real){
    super(real,0);
  }
  /**
   * Returns a string representation of the real number.
   * @return a string representation of the real number
   */
  @Override
  public String toString(){
    return String.valueOf(getRealPart());
  }
  
  /**
   * Determines if this rational number is equal to another object.
   * @param o the other object to compare
   * @return true if the other object is a rational number with the same numerator and denominator, false otherwise
   */
  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (!(o instanceof RealN)) {
      return false;
    }
    RealN r = (RealN) o;
    return Double.compare(real, r.real) == 0;
  }
  
}
