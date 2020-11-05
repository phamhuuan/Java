package Student;

public class Student {
	private String studentId, studentName, birthday;
	private float cpa;

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public float getCpa() {
		return cpa;
	}

	public void setCpa(float cpa) throws IllegalCpaException {
		if(cpa < 0 || cpa > 4) {
			throw (new IllegalCpaException());
		}
		this.cpa = cpa;
	}
}
