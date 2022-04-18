package MODEL;

import java.sql.Date;

public class SinhVienModel {
	private Long masv;
	private String hotensv;
	private Long makhoa;
	private Date namsinh;
	private String quequan;
	private int is_active;
	
	public SinhVienModel() {
		
	}
	public SinhVienModel(Long masv, String hotensv, Long makhoa, Date namsinh, String quequan) {
		this.masv =masv;
		this.hotensv = hotensv;
		this.makhoa = makhoa;
		this.namsinh = namsinh;
		this.quequan = quequan;
	}

	public Long getMasv() {
		return masv;
	}

	public void setMasv(Long masv) {
		this.masv = masv;
	}

	public String getHotensv() {
		return hotensv;
	}

	public void setHotensv(String hotensv) {
		this.hotensv = hotensv;
	}

	public Long getMakhoa() {
		return makhoa;
	}

	public void setMakhoa(Long makhoa) {
		this.makhoa = makhoa;
	}

	public Date getNamsinh() {
		return namsinh;
	}

	public void setNamsinh(Date namsinh) {
		this.namsinh = namsinh;
	}

	public String getQuequan() {
		return quequan;
	}

	public void setQuequan(String quequan) {
		this.quequan = quequan;
	}

	@Override
	public String toString() {
		return "SinhVienModel [masv=" + masv + ", hotensv=" + hotensv + ", makhoa=" + makhoa + ", namsinh=" + namsinh
				+ ", quequan=" + quequan + ", is_active=" + is_active + ", toString()=" + super.toString() + "]";
	}
	public int getIs_active() {
		return is_active;
	}

	public void setIs_active(int is_active) {
		this.is_active = is_active;
	}
	
	
	
}
