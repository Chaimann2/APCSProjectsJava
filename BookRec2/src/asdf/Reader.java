package asdf;

public class Reader {
	int s[] = new int[55];
	String name;
	public Reader() {
		for (int i = 0; i <55; i++) {
			s[i] = 0;
			
		}
		name = "";
	}
	public Reader(String n, int k[]) {
		name = n;
		if (k.length == 55) {
			this.s = k;
		}
	}
	
	public Reader(String n, int u, int t) {
		name = n;
		s[u] = t;
	}
	public String toString() {
		String u = this.name + "\n";
		for (int i = 0; i < 55; i++) {
			u += s[i] + " ";
		}
		return u;
	}
	public int best(Reader r) {
		int k = 0;
		
		for (int i = 0; i < 55; i++) {
			k += r.s[i] * s[i];
		}
		
		return k;
	}
	public int[] getS() {
		return s;
	}
	public void setS(int[] s) {
		this.s = s;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
