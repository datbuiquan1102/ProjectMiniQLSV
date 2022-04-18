package MODEL;

public class HDModul {
	private Long svmasv;
	private Long hdmasv;
	
	public HDModul(Long svmasv, Long hdmasv) {
		this.svmasv = svmasv;
		this.hdmasv = hdmasv;
	}

	public Long getSvmasv() {
		return svmasv;
	}

	public void setSvmasv(Long svmasv) {
		this.svmasv = svmasv;
	}

	public Long getHdmasv() {
		return hdmasv;
	}

	public void setHdmasv(Long hdmasv) {
		this.hdmasv = hdmasv;
	}

	@Override
	public String toString() {
		return "HDModul [svmasv=" + svmasv + ", hdmasv=" + hdmasv + "]";
	}
	
	
}
