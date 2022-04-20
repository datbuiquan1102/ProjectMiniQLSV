package MODEL;

public class DeTaiModel {
	private Long madt;
	private String tendt;
	private int kinhphi;
	private String noithuctap;
	private int is_active;
	
	
	public DeTaiModel() {
		
	}
	public DeTaiModel(Long madt, String tendt, int kinhphi, String noithuctap) {
		this.madt = madt;
		this.tendt = tendt;
		this.kinhphi = kinhphi;
		this.noithuctap = noithuctap;
	}


	public Long getMadt() {
		return madt;
	}


	public void setMadt(Long madt) {
		this.madt = madt;
	}


	public String getTendt() {
		return tendt;
	}


	public void setTendt(String tendt) {
		this.tendt = tendt;
	}


	public int getKinhphi() {
		return kinhphi;
	}


	public void setKinhphi(int kinhphi) {
		this.kinhphi = kinhphi;
	}


	public String getNoithuctap() {
		return noithuctap;
	}


	public void setNoithuctap(String noithuctap) {
		this.noithuctap = noithuctap;
	}


	public int getIs_active() {
		return is_active;
	}


	public void setIs_active(int is_active) {
		this.is_active = is_active;
	}
	@Override
	public String toString() {
		return "DeTaiModel [madt=" + madt + ", tendt=" + tendt + ", kinhphi=" + kinhphi + ", noithuctap=" + noithuctap
				+ ", is_active=" + is_active + "]";
	}
	
	

	
}
