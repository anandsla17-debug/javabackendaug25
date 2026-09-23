package Collection;

import java.util.Objects;

public class Staff {
private int staffid;
private String staffsubject;
public int getStaffid() {
	return staffid;
}
public void setStaffid(int staffid) {
	this.staffid = staffid;
}
public String getStaffsubject() {
	return staffsubject;
}
public void setStaffsubject(String staffsubject) {
	this.staffsubject = staffsubject;
}
public Staff(int staffid, String staffsubject) {
	
	this.staffid = staffid;
	this.staffsubject = staffsubject;
}
@Override
public int hashCode() {
	return Objects.hash(Integer.valueOf(staffid), staffsubject);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Staff other = (Staff) obj;
	return staffid == other.staffid && Objects.equals(staffsubject, other.staffsubject);
}



}
