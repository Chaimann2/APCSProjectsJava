package triangle2;

public class triangle {
	line l1, l2, l3;
	

	
	public triangle(){
		l1 = new line();
		l2 = new line();
		l3 = new line(); 
	}
	public triangle(point p1, point p2, point p3) {
		l1 = new line(p1, p2);
		l2 = new line(p2, p3);
		l3 = new line(p3, p1);
	}
	public boolean isTri() {
		boolean isT = false;
		if (l1.distance() >= l2.distance() + l3.distance() || l2.distance() >= l3.distance() + l1.distance() || l3.distance() >= l2.distance() + l1.distance()) {
			isT = false;
		}
		else {
			isT = true;
		}
		
		return isT;
	}
	public double area() {
		double s = (l1.distance() + l2.distance() + l3.distance()) /2;
		double a = Math.sqrt(s * (s - l1.distance()) * (s - l2.distance()) * (s - l3.distance()));
		return a;
	}
	public double perimeter() {
		double p = l1.distance() + l2.distance() + l3.distance();
		return p;
	}
	public String type() {
		String t = "";
		if (l1.distance() == l2.distance() && l2.distance() == l3.distance()) {
			t= "Equilateral";
		}
		else if(l1.distance() == l2.distance() || l2.distance() == l3.distance() || l1.distance() == l3.distance()) {
			t = "Isosceles";
		}
		else {
			t = "Scalene";
		}
		double ad, bd, cd = 0;
		double aa = l1.distance() * l1.distance();
		double bb = l2.distance() * l2.distance();
		double cc = l3.distance() * l3.distance();
		cd = Math.acos(((aa+ bb - cc)) / (2 * l1.distance() * l2.distance()));
		ad = Math.acos(((bb+ cc - aa)) / (2 * l2.distance() * l3.distance()));
		bd = Math.acos(((cc+ aa - bb)) / (2 * l3.distance() * l1.distance()));
		cd = cd * 180 / Math.PI;
		ad = ad * 180 / Math.PI;
		bd = bd * 180 / Math.PI;
		if (cd == 90 || ad == 90 || bd == 90) {
			t= t + " Right";
		}
		else if (cd > 90 || ad > 90 || bd > 90) {
			t = t + " Obtuse";
		}
		else {
			t = t + "Acute";
		}
		return t;
	}
	public String tostring() {
		String s = l1.tostring2() + l1.tostring2() + l3.tostring2() + Double.toString(area()) + Double.toString(perimeter()) + type();
		return s;
	}
}
