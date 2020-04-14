package asdf;

import java.awt.Component;
import java.awt.Image;

import javax.swing.*;

public class Book {
	String Author, Title;
	int tot = 0, TOT1 = 0;
	double avg = 0;
	ImageIcon i;
	public Book() {
		Author = "";
		Title = "";
		i = null;
	}
	public void settot(int a) {
		tot += a;
		

	}
	public int getTot() {
		return tot;
	}
	public void settot1(int a) {
		tot += a;
		

	}
	public int getTot1() {
		return tot;
	}
	public void setavg(int a) {

		avg = ((double)this.tot) / a;
	}
	public double getAvg() {
		return avg;
	}
	public Book(String a, String t) {
		Author = a;
		Title = t;
		i = new ImageIcon(t + ".jpg");
	}
	public ImageIcon getI() {
		return i;
	}
	public void setI(ImageIcon i) {
		this.i = i;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	
}
