/**
 * 
 */
package demo.injections;

/**
 * @author PrashantChitte
 *
 */
public class Insurence {

	private int insuId;
	private String name;
	
		
	
	public Insurence() {
		super();
	}
	
	public Insurence(int insuId, String name) {
		super();
		this.insuId = insuId;
		this.name = name;
	}
	public int getInsuId() {
		return insuId;
	}
	public void setInsuId(int insuId) {
		this.insuId = insuId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
				
}
