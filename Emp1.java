package collections;

public class Emp1 {
	private String name;
	private int salary;
	public Emp1(String n,int s){
		this.name=n;
		this.salary=s;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String toString(){
		return "Name:"+this.name+"--salary:"+this.salary;
		
	}
	
}
