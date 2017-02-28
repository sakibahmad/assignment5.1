/* USE OF ABSTRACT CLASS AND 
performiing calculation of areas of different shape*/
package session5;

//use of scanner class for input of dimensions
import java.util.Scanner;

//Circle class extending figure class
public class Circle extends Figure {
	// overriding find area of Figure class
	void findArea() {
		// taking radius by user
		Scanner o = new Scanner(System.in);
		System.out.println("for area of circle Enter radius ");

		double radius, area;
		radius = o.nextDouble();
		// formula to calculate area of circle
		area = 3.14 * radius * radius;
		System.out.println("area of circle is" + area);
	}

	// formula to calculate perimeter of circle
	void findPerimeter() {
		double peri, radius, length;
		Scanner o = new Scanner(System.in);
		System.out.println("for perimeter of rectangle Enter radius and length ");
		radius = o.nextDouble();
		length = o.nextDouble();
		peri = 3.14 * radius * length;
		System.out.println(peri);

	}

}