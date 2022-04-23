package MODEL;

import java.sql.Date;

public class InformationdDisplayByKhoaModel {
	private KhoaModel khoa;
	private GiangVienModel giangvien;
	private SinhVienModel sinhvien;
	
	public InformationdDisplayByKhoaModel() {
		
	}
	
	public InformationdDisplayByKhoaModel(KhoaModel khoa, GiangVienModel giangvien) {
		this.khoa = khoa;
		this.giangvien = giangvien;
	}
	
	public InformationdDisplayByKhoaModel(KhoaModel khoa, SinhVienModel sinhVien) {
		this.khoa = khoa;
		this.sinhvien = sinhVien;
	}
	
	public InformationdDisplayByKhoaModel(KhoaModel khoa, SinhVienModel sinhvien, GiangVienModel giangvien) {
		this.khoa = khoa;
		this.sinhvien = sinhvien;
		this.giangvien = giangvien;
	}

	public KhoaModel getKhoa() {
		return khoa;
	}

	public void setKhoa(KhoaModel khoa) {
		this.khoa = khoa;
	}

	public GiangVienModel getGiangvien() {
		return giangvien;
	}

	public void setGiangvien(GiangVienModel giangvien) {
		this.giangvien = giangvien;
	}

	public SinhVienModel getSinhvien() {
		return sinhvien;
	}

	public void setSinhvien(SinhVienModel sinhvien) {
		this.sinhvien = sinhvien;
	}

	@Override
	public String toString() {
		return "InformationdDisplayByKhoaModel [khoa=" + khoa + ", giangvien=" + giangvien + ", sinhvien=" + sinhvien
				+ "]";
	}
	
	
	
	
}
