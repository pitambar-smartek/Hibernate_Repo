import java.util.HashSet;


public class NewTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test(){
			public void methodTest(){
				System.out.println("pitambar mohanty is okay to do");
			}
		};
		t.methodTest();

	}
	

}
class student{
	String sName;
	String rollno;
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((rollno == null) ? 0 : rollno.hashCode());
		result = prime * result + ((sName == null) ? 0 : sName.hashCode());
		return result;
	}
	
	public boolean equals( Object obj) {
		System.out.println("it is not called");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		student other = (student) obj;
		if (rollno == null) {
			if (other.rollno != null)
				return false;
		} else if (!rollno.equals(other.rollno))
			return false;
		if (sName == null) {
			if (other.sName != null)
				return false;
		} else if (!sName.equals(other.sName))
			return false;
		return true;

	}
	public void m1(Integer i){
		System.out.println("Integer value");
	}
	public void m1(String st){
		System.out.println("String value");
	}
	public void m1(Object o){
		System.out.println("Object value ");
		
	}
	public static void main(String[] args) {
		NewTest test=new NewTest();
		Object ob=new String("ramiya");
		student st=new student();
		st.m1(null);
		
	}
	
}