package MODEL;

public class HDModel {
	private Long masv;
	private Long madt;
	private Long magv;
	private double ketqua;
	private String tengv;
	private String tensv;
	private String tendt;
	
	public HDModel() {
		
	}
	public HDModel(Long masv, Long madt, Long magv) {
		this.masv = masv;
		this.madt = madt;
		this.magv = magv;
	}
	
	public HDModel(String tengv, String tensv, String tendt, double ketqua) {
		this.tengv = tengv;
		this.tensv = tensv;
		this.tendt = tendt;
		this.ketqua = ketqua;
	}
	
	public HDModel(Long masv, Long madt, Long magv, String tengv, String tensv, String tendt, double ketqua) {
		this.masv = masv;
		this.madt = madt;
		this.magv = magv;
		this.tengv = tengv;
		this.tensv = tensv;
		this.tendt = tendt;
		this.ketqua = ketqua;
	}
	
	
	public String getTengv() {
		return tengv;
	}
	public void setTengv(String tengv) {
		this.tengv = tengv;
	}
	public String getTensv() {
		return tensv;
	}
	public void setTensv(String tensv) {
		this.tensv = tensv;
	}
	public String getTendt() {
		return tendt;
	}
	public void setTendt(String tendt) {
		this.tendt = tendt;
	}
	public Long getMasv() {
		return masv;
	}
	public void setMasv(Long masv) {
		this.masv = masv;
	}
	public Long getMadt() {
		return madt;
	}
	public void setMadt(Long madt) {
		this.madt = madt;
	}
	public Long getMagv() {
		return magv;
	}
	public void setMagv(Long magv) {
		this.magv = magv;
	}
	public double getKetqua() {
		return ketqua;
	}
	public void setKetqua(double ketqua) {
		this.ketqua = ketqua;
	}
	@Override
	public String toString() {
		return "HDModel [masv=" + masv + ", madt=" + madt + ", magv=" + magv + ", ketqua=" + ketqua + ", tengv=" + tengv
				+ ", tensv=" + tensv + ", tendt=" + tendt + "]";
	}
	
	
	
	
}
