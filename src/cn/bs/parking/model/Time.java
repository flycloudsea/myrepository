package cn.bs.parking.model;



public class Time {
	private Integer Tid;
	
	private String begin;
	private String end;
	private Integer Uid;
	public Integer getTid() {
		return Tid;
	}
	public void setTid(Integer tid) {
		Tid = tid;
	}
	public String getBegin() {
		return begin;
	}
	public void setBegin(String begin) {
		this.begin = begin;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	public Integer getUid() {
		return Uid;
	}
	public void setUid(Integer uid) {
		Uid = uid;
	}
	

}
