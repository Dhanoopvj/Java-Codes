package stringmethods;

import java.util.Scanner;

public class Areaoftrianglerectanglecirclesquare {

	public static void main(String[] args) {
		// Area of rectangle triangle circle and square
		Scanner areas=new Scanner(System.in);
		//triangle 0.5*b*h
		System.out.println("Enter the base of the triangle:");
		double base =areas.nextDouble();
		
		System.out.println("Enter the height of the triangle:");
		double height=areas.nextDouble();
		
		double trianglearea=calctriarea(base,height);
		System.out.println("The area of the triangle: "+trianglearea);
		//circle =3.14*r*r
		System.out.println("Enter the radius of the circle:");
		double radius=areas.nextDouble();
		
		double circlearea=calccirclearea(radius);
		System.out.println("The area of the circle:"+circlearea);
		
		//square=a*a
		System.out.println("Enter the sides of the square:");
		double sides=areas.nextDouble();
		
		double squarearea=calcsqarea(sides);
		System.out.println("The area of the square:"+squarearea);
		//rectangle=l*b
		System.out.println("enter the length of the rectangle:");
		double l=areas.nextDouble();
		System.out.println("enter the breadth of the rectangle:");
		double b=areas.nextDouble();
		double rectanglearea=calcrectarea(l,b);
		System.out.println("The area of the rectangle:"+rectanglearea);
	
		areas.close();

	}
public static double calctriarea(double base,double height) {
	return 0.5*base*height;
}
public static double calccirclearea(double radius) {
	return 3.144*radius*radius;}
public static double calcsqarea(double sides) {
	return sides*sides;
}
public static double calcrectarea(double l,double b) {
	return l*b;

}

}
