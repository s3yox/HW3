public class NaturalN extends IntegerN {
  
  /**
   * 
   *Creates a new NaturalN object with the specified value.
   *@param naturaln the value of the natural number
   *@throws ArithmeticException if the value is negative
   */
  private int naturaln;
  
  public NaturalN(int naturaln){
    super(naturaln);
    if(naturaln > 0)
      this.naturaln = naturaln;
    if(naturaln < 0)
      throw new ArithmeticException("A natural number cannot be negative ");
  }
  
  /**
   * 
   *Returns the value of this natural number.
   *@return the value of this natural number
   */
  public int getNat(){
    return naturaln;
  }
  
  /**
   * 
   *Returns a string representation of this natural number.
   *@return a string representation of this natural number
   */
  @Override
  public String toString(){
    return String.valueOf(getNat());
  }
}