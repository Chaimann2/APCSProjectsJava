package district;

import java.text.DecimalFormat;

abstract public class Student {
	String fname, lname;
	int sc1, sc2, sc3;
	int gdLevel, idnum;
	static int idpl = 606475;
	int fee;
	static int totalStus = 0;
	static int totalFees = 0;
	public Student(String n, String ln, int gl, int s1, int s2, int s3) {
		this.fname = n;
		this.lname = ln;
		this.gdLevel = gl;
		sc1 = s1;
		sc2 = s2; 
		sc3 = s3;
		this.idnum = idpl;
		
		idpl++;
	}
	abstract public double getAvg();
	public Student() {
		fname = " "; 
		lname = " ";
		gdLevel = 0;
		sc1 = 0;
		sc2 = 0;
		sc3 = 0;
		idnum = 0;
	}
	public String getFname() {
		return fname;
	}
	public String getSchool() {
		String gdasdf = "";
		if (this.gdLevel < 13 && this.gdLevel > 8) {
			gdasdf = "High School";
		}
		else if (this.gdLevel < 9 && this.gdLevel > 5) {
			gdasdf = "Middle School";
		}
		else {
			gdasdf = "Elementary School";
			
		}
		return gdasdf;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getSc1() {
		return sc1;
	}
	public void setSc1(int sc1) {
		this.sc1 = sc1;
	}
	public int getSc2() {
		return sc2;
	}
	public void setSc2(int sc2) {
		this.sc2 = sc2;
	}
	public int getSc3() {
		return sc3;
	}
	public void setSc3(int sc3) {
		this.sc3 = sc3;
	}
	public int getGdLevel() {
		return gdLevel;
	}
	public void setGdLevel(int gdLevel) {
		this.gdLevel = gdLevel;
	}
	public int getIdnum() {
		return idnum;
	}
	public void setIdnum(int idnum) {
		this.idnum = idnum;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public String toString() {
		String s = "";
		String gdasdf = "";
		String name = fname + " " + lname;
		DecimalFormat df = new DecimalFormat("###.###");
		if (this.gdLevel < 13 && this.gdLevel > 8) {
			gdasdf = "High School";
		}
		else if (this.gdLevel < 9 && this.gdLevel > 5) {
			gdasdf = "Middle School";
		}
		else {
			gdasdf = "Elementary School";
		}
		s = idnum + "\n" + gdLevel + "\n" + name + "\n" +  sc1 + "," + sc2 + "," + sc3 + " Avg: " + df.format(this.getAvg()) + "\n\n";
		return s;
		
	}
}
