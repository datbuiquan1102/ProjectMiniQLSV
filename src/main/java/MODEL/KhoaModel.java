package MODEL;

public class KhoaModel {
	private long makhoa;
	private String tenkhoa;
	private String dienthoai;
	
	public KhoaModel() {
		
	}
	public KhoaModel(Long makhoa, String tenkhoa, String dienthoai) {
		this.makhoa = makhoa;
		this.tenkhoa = tenkhoa;
		this.dienthoai = dienthoai;
	}
	
	public long getMakhoa() {
		return makhoa;
	}
	public void setMakhoa(long makhoa) {
		this.makhoa = makhoa;
	}
	public String getTenkhoa() {
		return tenkhoa;
	}
	public void setTenkhoa(String tenkhoa) {
		this.tenkhoa = tenkhoa;
	}
	public String getDienthoai() {
		return dienthoai;
	}
	public void setDienthoai(String dienthoai) {
		this.dienthoai = dienthoai;
	}
	@Override
	public String toString() {
		return "KhoaModel [makhoa=" + makhoa + ", tenkhoa=" + tenkhoa + ", dienthoai=" + dienthoai + "]";
	}
	
	
	
	
}
