package MODEL;

public class KhoaModel {
	private Long makhoa;
	private String tenkhoa;
	private String dienthoai;
	
	public KhoaModel() {
		
	}
	public KhoaModel(Long makhoa, String tenkhoa, String dienthoai) {
		this.makhoa = makhoa;
		this.tenkhoa = tenkhoa;
		this.dienthoai = dienthoai;
	}
	public Long getMakhoa() {
		return makhoa;
	}
	public void setMakhoa(Long makhoa) {
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
