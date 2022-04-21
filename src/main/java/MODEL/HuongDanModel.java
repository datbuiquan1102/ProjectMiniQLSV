package MODEL;

public class HuongDanModel {
	private long masv;
	private long madt;
	private long magv;
	private String tengv;
	private String hotensv;
	private String tendt;
	private String noithuctap;
	private double ketqua;

	public HuongDanModel() {

	}

	public HuongDanModel(int masv, String tengv, String hotensv, String tendt, String noithuctap, double ketqua) {
		this.masv = masv;
		this.tengv = tengv;
		this.hotensv = hotensv;
		this.tendt = tendt;
		this.noithuctap = noithuctap;
		this.ketqua = ketqua;
	}

	public HuongDanModel(long masv, long madt, long magv, String tengv, String hotensv, String tendt, String noithuctap, double ketqua) {
		this.masv = masv;
		this.madt = madt;
		this.magv = magv;
		this.tengv = tengv;
		this.hotensv = hotensv;
		this.tendt = tendt;
		this.noithuctap = noithuctap;
		this.ketqua = ketqua;
	}

	public long getMasv() {
		return masv;
	}

	public void setMasv(long masv) {
		this.masv = masv;
	}

	public long getMadt() {
		return madt;
	}

	public void setMadt(long madt) {
		this.madt = madt;
	}

	public long getMagv() {
		return magv;
	}

	public void setMagv(long magv) {
		this.magv = magv;
	}

	public String getTengv() {
		return tengv;
	}

	public void setTengv(String tengv) {
		this.tengv = tengv;
	}

	public String getHotensv() {
		return hotensv;
	}

	public void setHotensv(String hotensv) {
		this.hotensv = hotensv;
	}

	public String getTendt() {
		return tendt;
	}

	public void setTendt(String tendt) {
		this.tendt = tendt;
	}

	public String getNoithuctap() {
		return noithuctap;
	}

	public void setNoithuctap(String noithuctap) {
		this.noithuctap = noithuctap;
	}

	public double getKetqua() {
		return ketqua;
	}

	public void setKetqua(double ketqua) {
		this.ketqua = ketqua;
	}

	@Override
	public String toString() {
		return "HuongDanModel [masv=" + masv + ", madt=" + madt + ", magv=" + magv + ", tengv=" + tengv + ", hotensv="
				+ hotensv + ", tendt=" + tendt + ", noithuctap=" + noithuctap + ", ketqua=" + ketqua + "]";
	}

	

}
