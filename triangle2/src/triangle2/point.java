package triangle2;

public class point {
	int x, y, coorx, coory;
	public point() {
		x = 0;
		y = 0;
		coorx = 0;
		coory = 0;
	}
	public point(int x1, int y1) {
		this.x = x1;
		this.y = y1;
		coorx = 0;
		coory = 0;
		
	}
	public String tostring() {
		String s = "";
		s = "(" + coorx + "," + coory + ")";
		return s;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getCoorx(int width) {
		this.coorx = this.x - (width/2);
		return coorx;
	}
	public void setCoorx(int width) {
		this.coorx = this.x - (width/2);
	}
	public int getCoory(int height) {
		this.coory =  (height/2) - this.y;
		return coory;
	}
	public void setCoory(int height) {
		this.coory = this.y- (height/2);
	}
	public String tostring1() {
		String s = "(" + x + ":" + coorx + "," + y + ":" + coory + ")";
		return s;
	}
	
}
