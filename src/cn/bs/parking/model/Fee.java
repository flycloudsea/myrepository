package cn.bs.parking.model;

public class Fee {
	private Integer Fid;
	private Integer charge;
	private Integer Tid;
	public Integer getFid() {
		return Fid;
	}
	public void setFid(Integer fid) {
		Fid = fid;
	}
	public Integer getCharge() {
		return charge;
	}
	public void setCharge(Integer charge) {
		this.charge = charge;
	}
	public Integer getTid() {
		return Tid;
	}
	public void setTid(Integer tid) {
		Tid = tid;
	}

}
