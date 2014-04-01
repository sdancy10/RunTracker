

/**
 * 
 */

/**
 * Data structure to hold the details of a run.
 * 
 * @author Style
 *
 */
public class Run {
	/**
	 * Field representing the name of the run
	 */
	private String title;
	
	/**
	 * Field representing the duration of the run in Hours:Minutes:Seconds
	 */
	private String time;
	
	/**
	 * Field representing the date of the run in MM/DD/YY
	 */
	private String date;
	
	/**
	 * Field representing the distance of the run in Miles
	 */
	private Double distance;
	
	/**
	 * Constructor to build a empty run when there is no data about run.
	 * @param title
	 * @param time
	 * @param date
	 * @param distance
	 */
	Run () {
		this.title = "";
		this.time = "--:--:--";
		this.date = "MM/DD/YY";
		this.distance = 0.00;
	}
	
	/**
	 * Constructor to build a new run from existing data.
	 * @param title
	 * @param time
	 * @param date
	 * @param distance
	 */
	Run (String title, String time, String date, Double distance) {
		this.title = title;
		this.time = time;
		this.date = date;
		this.distance = distance;
	}
	
	/**
	 * 
	 * @param None
	 * @return Title of run. 
	 */
	public String getTitle() { return this.title;}
	
	/**
	 * 
	 * @param None
	 * @return Time of run. 
	 */
	public String getTime() { return this.time;}
	
	/**
	 * 
	 * @param None
	 * @return Date of run. 
	 */
	public String getDate() { return this.date;}
	
	/**
	 * 
	 * @param None
	 * @return Distance of run. 
	 */
	public Double getDistance() { return this.distance;}
	
	/**
	 * 
	 * @param String representing the title of the run
	 * @return Title of run. 
	 */
	public void setTitle(String t) { this.title = t;}
	
	/**
	 * 
	 * @param string representing the time of run 00:00:00
	 * @return Time of run. 
	 */
	public void setTime(String t) { this.time = t;}
	
	/**
	 * 
	 * @param string representing the date of the run MM/DD/YY
	 * @return Date of run. 
	 */
	public void setDate(String d) { this.date = d;}
	
	/**
	 * 
	 * @param double representing the distance of run in miles
	 * @return Distance of run. 
	 */
	public void setDistance(Double d) { this.distance = d;}
	
	/**
	 * @return String representation of run details
	 */
	@Override 
	public String toString() {
		String result =
				"Run Title: " + this.title +
				"\nRun Date: " + this.date +
				"\nRun Time: " + this.time + 
				"\nRun Distance: " + this.distance;
		return result;
	}

}
