public class Project {

	private String name;
	private java.time.LocalDate startDate;
	private java.time.LocalDate endDate;

	public java.time.LocalDate getStartDate() {
		return this.startDate;
	}

	public void setStartDate(java.time.LocalDate startDate) {
		this.startDate = startDate;
	}

	public java.time.LocalDate getEndDate() {
		return this.endDate;
	}

	public void setEndDate(java.time.LocalDate endDate) {
		this.endDate = endDate;
	}

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

}