package triangle2;

public class line {
	point p1, p2;
	double slope;
	double yint;
	public line() {
		point temp = new point(0, 0);
		slope = 0;
		yint = 0;
		this.p1 = temp;
		this.p2 = temp;
	}
	public line(point temp1, point temp2) {
		p1 = new point(temp1.getX(), temp1.getY());
		p2 = new point(temp2.getX(), temp2.getY());
		if (p1.x != p2.x) {	
		slope = (p1.y - p2.y)/(p1.x - p2.x);
		yint = p1.y - (p1.y - p2.y)/(p1.x - p2.x) * p1.coorx;

		}
			
		}
	public double distance() {
		int x1 = p1.getX();
		int x2 = p2.getX();
		int y1 = p1.getY();
		int y2 = p2.getY();
		
		int xx = x2 - x1;
		int yy = y2 - y1;
		double d = Math.sqrt((xx*xx) +(yy*yy));
		return d;
		
	}
	public point getP1() {
		return p1;
	}
	public void setP1(point p1) {
		this.p1 = p1;
	}
	public point getP2() {
		return p2;
	}
	public void setP2(point p2) {
		this.p2 = p2;
	}
	public double getSlope() {
		return slope;
	}
	public void setSlope(double slope) {
		this.slope = slope;
	}
	public double getYint() {
		return yint;
	}
	public void setYint(double yint) {
		this.yint = yint;
	}
	public String tostring2() {
		String s = p1.tostring1() + ";" + p2.tostring1();
		return s;
	}
}
