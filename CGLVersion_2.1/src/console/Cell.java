package console;
/*
 * @Author: Saichandra Bussa 2020501006
 */
public class Cell {
	private boolean status; // Variable used to check the status of the cell
	
	/*
	 * constructor used intialize the status variable 
	 * */
	public Cell(boolean status) {
		this.status = status;
	}
	
	/*
	 * function used to check the status
	 * */
	public boolean isStatus() {
		return status;
	}
	
	/*
	 * function used to set the status
	 * */
	public void setStatus(boolean status) {
		this.status = status;
	}
//	public String toString() {
//		return ""+this.status;
//		
//	}
	
}
