//ComplexNumberTester Class
public class ComplexNumberTester {
    public static void main(String[] args) {
        ComplexNumber cn1 = new ComplexNumber();
        System.out.println(cn1.details());
        System.out.println("----------------");
        ComplexNumber cn2 = new ComplexNumber(5.0, 7.0);
        System.out.println(cn2.details());
    }
}

//RealNumber Class
public class RealNumber {
    public double realValue;
    public RealNumber() {
        this(0.0);
    }
    public RealNumber(double realValue) {
        this.realValue = realValue;
    }
    public String getReal(){
        return "RealPart: " + realValue;
    }
}

//ComplexNumber Class
public class ComplexNumber extends RealNumber{
  public double imaginary;
  
  public ComplexNumber(){
    super(1.0);
    this.imaginary = 1.0;
  }
  
  public ComplexNumber(double real, double imaginary){
    super(real);
    this.imaginary = imaginary;
  }
  
  public String details(){
    return super.getReal() + "\nImaginaryPart: " + imaginary;
  }
}
