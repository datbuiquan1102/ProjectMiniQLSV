package MODEL;

public class HuongDanModel {
	private int masv;
	private String hotensv;
	private String tendt;
	private String noithuctap;
	private double ketqua;
	
	public HuongDanModel() {
		
	}
	public HuongDanModel(int masv, String hotensv, String tendt, String noithuctap, double ketqua) {
		this.masv = masv;
		this.hotensv = hotensv;
		this.tendt =tendt;
		this.noithuctap = noithuctap;
		this.ketqua = ketqua;
	}
	public int getMasv() {
		return masv;
	}
	public void setMasv(int masv) {
		this.masv = masv;
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
		return "HuongDanModel [masv=" + masv + ", hotensv=" + hotensv + ", tendt=" + tendt + ", noithuctap="
				+ noithuctap + ", ketqua=" + ketqua + "]";
	}
	
	
}

