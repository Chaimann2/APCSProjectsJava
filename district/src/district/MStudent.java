package district;

public class MStudent extends Student{

	public MStudent(String n, String ln, int g, int s1, int s2, int s3) {
		super(n, ln, g, s1, s2, s3);
		super.fee = 100;
		super.totalFees += fee;
		super.totalStus += 1;
	}
	public MStudent() {
		super();
	}
	public MStudent(MStudent t) {
		this.setFname(t.getFname());
		this.setLname(t.getLname());
		this.setGdLevel(t.getGdLevel());
		this.setSc1(t.getSc1());
		this.setSc2(t.getSc2());
		this.setSc3(t.getSc3());
		this.setIdnum(t.getIdnum());
		this.setFee(t.getFee());
	}
	public void set(MStudent t) {
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
		avg = (sc1*.4) + (sc2*.35) + (sc3*.25);
		return avg;
	}
}
