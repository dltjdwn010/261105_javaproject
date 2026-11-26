package StudentList;

public class Subject {
	private int subjectCode;
	private String subjectName;
	private String subjectRoom;
	private String subjectTime;
	private String subjectWeek;
	
	public Subject() {}
	public Subject(int subjectCode,String subjectName,String subjectRoom,String subjbectTime,String subjectWeek) {
	this.subjectCode = subjectCode;
	this.subjectName = subjectName;
	this.subjectRoom = subjectRoom;
	this.subjectTime = subjbectTime;
	this.subjectWeek = subjectWeek;
	}
	
	
	//toString : 모든 멤버변수의 값을 확인하기 위한 용도
	// 과목정보 출력 메서드
	public void printSubject() {
		System.out.println(subjectCode+"."+subjectName+"("+subjectTime+" / "+subjectWeek+") =>"+subjectRoom);
	}
	public int getSubjectCode() {
		return subjectCode;
	}
	public void setSubjectCode(int subjectCode) {
		this.subjectCode = subjectCode;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public String getSubjectRoom() {
		return subjectRoom;
	}
	public void setSubjectRoom(String subjectRoom) {
		this.subjectRoom = subjectRoom;
	}
	public String getSubjectTime() {
		return subjectTime;
	}
	public void setSubjectTime(String subjectTime) {
		this.subjectTime = subjectTime;
	}
	public String getSubjectWeek() {
		return subjectWeek;
	}
	public void setSubjectWeek(String subjectWeek) {
		this.subjectWeek = subjectWeek;
	}
	@Override
	public String toString() {
		return "Subject [subjectCode=" + subjectCode + ", subjectName=" + subjectName + ", subjectRoom=" + subjectRoom
				+ ", subjectTime=" + subjectTime + ", subjectWeek=" + subjectWeek + "]";
	}
	
	
}
