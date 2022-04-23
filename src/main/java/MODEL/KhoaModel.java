package MODEL;

public class KhoaModel {
	private long makhoa;
	private String tenkhoa;
	
	public KhoaModel() {
		
	}
	public KhoaModel(Long makhoa, String tenkhoa) {
		this.makhoa = makhoa;
		this.tenkhoa = tenkhoa;
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
	@Override
	public String toString() {
		return "KhoaModel [makhoa=" + makhoa + ", tenkhoa=" + tenkhoa + "]";
	}
	
	
	
	
}
