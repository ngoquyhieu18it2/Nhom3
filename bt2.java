package hieu;
public class bt2 {
	String maSach;
	String tenSach;
	String tacgia;
	int sl;
	String namXB;
	public String getMaSach() {
		return maSach;
	}
	public void setMaSach(String maSach) {
		this.maSach = maSach;
	}
	public String getTacGia() {
		return tacgia;
	}
	public void setTacGia(String tacgia) {
		this.tacgia = tacgia;
	}
	public String getTenSach() {
		return tenSach;
	}
	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}
	public int getSl() {
		return sl;
	}
	public void setSl(int sl) {
		this.sl = sl;
	}
	public String getNamXB() {
		return namXB;
	}
	public void setNamXB(String namXB) {
		this.namXB = namXB;
	}
	public bt2() {
		
	}
	public bt2(String maSach,String tenSach,int sl,String namXB) {
		this.maSach=maSach;
		this.tacgia=tacgia;
		this.tenSach=tenSach;
		this.sl=sl;
		this.namXB=namXB;
	}
	}		
