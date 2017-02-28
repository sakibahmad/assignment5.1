/* USE OF ABSTRACT CLASS AND 
performiing calculation of areas of different shape*/
package session5;

//use of scanner class for input of dimensions
import java.util.Scanner;

public class Rectangle extends Figure {
	// using scanner class for providing user input
	void findArea() {
		Scanner o = new Scanner(System.in);
		System.out.println("for area of rectangle Enter base and height ");
		double length, breath, area;
		length = o.nextDouble();
		breath = o.nextDouble();
		area = length * breath;
		System.out.println("the area of rectangle  is " + area);

	}

	// logic to calculate logic for perimeter of rectangle
	void findPerimeter() {
		double peri, length, breath;
		Scanner o = new Scanner(System.in);
		System.out.println("for perimeter of rectangle Enter base and height ");
		length = o.nextDouble();
		breath = o.nextDouble();
		peri = 2 * (length * breath);
		System.out.println("perimeter of rectangle is " + peri);
	}
}
