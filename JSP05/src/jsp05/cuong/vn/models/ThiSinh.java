package jsp05.cuong.vn.models;

public class ThiSinh {
	private String cmnd,ho,ten;

	public String getCmnd() {
		return cmnd;
	}

	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}

	public String getHo() {
		return ho;
	}

	public void setHo(String ho) {
		this.ho = ho;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	@Override
	public String toString() {
		return "ThiSinh [cmnd=" + cmnd + ", ho=" + ho + ", ten=" + ten + "]";
	}

	public ThiSinh(String cmnd, String ho, String ten) {
		super();
		this.cmnd = cmnd;
		this.ho = ho;
		this.ten = ten;
	}

}
