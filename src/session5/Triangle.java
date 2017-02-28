/* USE OF ABSTRACT CLASS AND 
performiing calculation of areas of different shape
TRIANGLE class contain main body
*/
package session5;

//use of scanner class for input of dimensions
import java.util.Scanner;

public class Triangle extends Figure {
	// calculate area of triangle
	void findArea() {
		// entering height and base of triangle
		Scanner o = new Scanner(System.in);
		System.out.println("for area of triangle  ");
		System.out.println("enter base and height of triangle ");
		double area, base, height;
		base = o.nextDouble();
		height = o.nextDouble();
		area = 0.5 * base * height;
		System.out.println("the area of triangle is " + area);
	}

	void findPerimeter() {
		// formula to calculate perimeter of triangle
		Scanner o = new Scanner(System.in);
		System.out.println("for perimeter of triangle  ");
		System.out.println("enter sides  of triangle  ");
		double side1, side2, side3, peri;
		side1 = o.nextDouble();
		side2 = o.nextDouble();
		side3 = o.nextDouble();
		peri = side1 + side2 + side3;
		System.out.println("perimeter of triangle is  " + peri);

	}

	public static void main(String[] args) {
		Triangle obj = new Triangle();
		obj.findArea();
		obj.findPerimeter();
		Rectangle obj1 = new Rectangle();
		obj1.findArea();
		obj1.findPerimeter();
		Circle obj2 = new Circle();
		obj2.findArea();
		obj2.findPerimeter();
	}
}
