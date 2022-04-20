package MODEL;

public class GiangVienModel {
	private long magv;
	private String hoten;
	private double luong;
	private long makhoa;
	
	public GiangVienModel() {
		
	}
	public GiangVienModel(long magv, String hoten, double luong) {
		this.magv = magv;
		this.hoten = hoten;
		this.luong = luong;
	}



	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public double getLuong() {
		return luong;
	}

	public void setLuong(double luong) {
		this.luong = luong;
	}



	public long getMagv() {
		return magv;
	}
	public void setMagv(long magv) {
		this.magv = magv;
	}
	public long getMakhoa() {
		return makhoa;
	}
	public void setMakhoa(long makhoa) {
		this.makhoa = makhoa;
	}
	@Override
	public String toString() {
		return "GiangVienModel [magv=" + magv + ", hoten=" + hoten + ", luong=" + luong + ", makhoa=" + makhoa + "]";
	}
	
	
	
}
