package javaPrograms;

 class Cube{
	int length;
	int breadth;
	int height;
	
	public int getCubeVolume(){
		return(length*breadth*height);
	}
	//Cube() is default constructor of cube class
	Cube(){
		length = 10;
		breadth = 10;
		height = 10;
	}
	//provide multiple constructors and constructor overloading by passing parameters
	Cube(int l,int b,int h){ 
	   	length = l;
	    breadth = b;
	    height = h ;
	}
}
public class MyConstructor {

	public static void main(String[] args) {
		Cube c1 = new Cube();
		Cube c2 = new Cube(10,20,30);
		System.out.println(c1.getCubeVolume());
		System.out.println(c2.getCubeVolume());
			}

}
