package district;

public class EStudent extends Student {

	public EStudent(String n, String ln, int g, int s1, int s2, int s3) {
		super(n, ln, g, s1, s2, s3);
		super.fee = 50;
		super.totalFees += fee;
		super.totalStus += 1;
	}
	public EStudent() {
		super();
	}
	public EStudent(EStudent t) {
		this.setFname(t.getFname());
		this.setLname(t.getLname());
		this.setGdLevel(t.getGdLevel());
		this.setSc1(t.getSc1());
		this.setSc2(t.getSc2());
		this.setSc3(t.getSc3());
		this.setIdnum(t.getIdnum());
		this.setFee(t.getFee());
	}
	public void set(EStudent t) {
		this.setFname(t.getFname());
		this.setLname(t.getLname());
		this.setGdLevel(t.getGdLevel());
		this.setSc1(t.getSc1());
		this.setSc2(t.getSc2());
		this.setSc3(t.getSc3());
		this.setIdnum(t.getIdnum());
		this.setFee(t.getFee());
	}
	@Override
	public double getAvg() {
		double avg = 0;
		avg = (sc1) + (sc2) + (sc3);
		avg /= 3;
		return avg;
	}
	

}
