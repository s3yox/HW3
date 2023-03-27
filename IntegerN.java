
public class IntegerN extends RationalN {
  private int intn;
  
  /**
   * 
   * Constructs an {@code IntegerN} object with the given integer value.
   * @param intn the integer value
   */
  public IntegerN(int intn){
    super(intn,1);
    this.intn = intn;
  }
  
  /**
   * 
   *Returns the integer value of this object.
   *@return the integer value of this object
   */
  public int getInt(){
    return intn;
  }
  
  /**
   * 
   Returns a string of this object.
   @return a string of this object
   */
  @Override
  public String toString(){
    return String.valueOf(getInt());
  }
  
  /**
   * 
   Determines if this object is equal to another object.
   @param o the other object to compare
   @return true if the other object is an {@code IntegerN} with the same integer value, false otherwise
   */
  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (!(o instanceof IntegerN)) {
      return false;
    }
    IntegerN n = (IntegerN) o;
    return intn == n.intn;
  }
}