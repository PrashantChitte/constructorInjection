/**
 * 
 */
package demo.injections;

/**
 * @author PrashantChitte
 *
 */
public class Employee {

	public Insurence insurence;
	public Address add;
	
	
	public Employee(Address add) {
		super();
		this.add = add;
	}

	public void setInsurence(Insurence insurence)
	{
		this.insurence=insurence;
	}
	
	public void display() {
		System.out.println("Insurence name :"+insurence.getName());
		System.out.println("Insurence  ID  :"+insurence.getInsuId());
		System.out.println("City           :"+add.getCity());
		System.out.println("name           :"+add.getLane());
	}

	@Override
	public String toString() {
		return "Employee [insurence=" + insurence + ", add=" + add + "]";
	}

	
	
}
