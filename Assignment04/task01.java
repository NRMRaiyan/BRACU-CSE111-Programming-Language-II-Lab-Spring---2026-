//Triangle Class
public class Triangle{
  public int side1;
  public int side2;
  public int side3;
  public int perimeter;
  public String triangleType;
  public String str;
  
  public Triangle(int s1, int s2, int s3){
    this.side1 = s1;
    this.side2 = s2;
    this.side3 = s3;
    this.perimeter = side1 + side2 + side3;
    
    if(s1 == s2 && s2 == s3){
      triangleType = "Equilateral";
    }else if(s1 == s2 || s2 == s3 || s3 == s1){
      triangleType = "Isosceles";
    }else{
      triangleType = "Scalene";
    }
  }
  
  public void triangleDetails(){
    System.out.println("Three sides of the triangle are: " + side1 + ", " + side2 + ", " + side3);
    System.out.println("Perimeter: " + this.perimeter);
  }
  
  public String printTriangleType(){
    if(triangleType == "Equilateral" || triangleType == "Isosceles"){
      str = "This is an " + triangleType + " Triangle.";
    }else{
      str = "This is a " + triangleType + " Triangle.";
    }
    return str;
  }
  
  public void compareTriangles(Triangle obj){
    if(this == obj){
      System.out.println("These two triangle objects have the same address.");
    }else{
      if(this.perimeter == obj.perimeter){
        System.out.println("Only the perimeter of both triangle is equal.");
      }else if(this.side1 == obj.side1 && this.side2 == obj.side2 && this.side3 == obj.side3){
        System.out.println("Addresses are different but the sizes of the triangles are equal.");
      }else{
        System.out.println("Addresses, length of the sides and perimeter all are different.");
      }
    }
  }
}

//TriangleTester Class
public class TriangleTester{
 public static void main(String args[]){
   Triangle t1 =  new Triangle(4, 4, 4);
   Triangle t2 =  new Triangle(4, 5, 6);
   Triangle t3 =  new Triangle(4, 5, 6);
   Triangle t4 =  new Triangle(5, 4, 6);

   t1.triangleDetails();
   System.out.println("--------1--------");
   System.out.println(t1.printTriangleType());
   System.out.println("--------2--------");
   t3.triangleDetails();
   System.out.println(t3.printTriangleType());
   System.out.println("--------3--------");
   t4.triangleDetails();
   System.out.println(t4.printTriangleType());
   System.out.println("--------4--------");
   t2.compareTriangles(t3);
   System.out.println("--------5--------");
   t1.compareTriangles(t2);
   System.out.println("--------6--------");
   t1 = t2;
   t1.compareTriangles(t2);
   System.out.println("--------7--------");
   t3.compareTriangles(t4);
 }
}
