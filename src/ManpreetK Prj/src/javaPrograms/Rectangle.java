package javaPrograms;

class Area{
	  int length;
	  int width;
	void insertval (int l , int w){
		length = l;
		width = w;
		}
	void calArea(){
		System.out.println("Area of Rectangle=" + length* width );
	}
}

public class Rectangle {

	public static void main(String[] args) {
		
  Area a1 = new Area();
  Area a2 = new Area();
  a1.insertval(5, 8);
  a2.insertval(3, 5);
  a1.calArea();
  a2.calArea();
	}

}
