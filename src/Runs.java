

import java.util.ArrayList;
import java.util.List;

/**
 * @author Style
 *
 */
public class Runs {
	private List<Run> runs;
	
	/**
	 * creates empty list of Runs
	 */
	Runs () { this.runs = new ArrayList<Run>();}
	
	/**
	 * Fills Runs data structure with information of the runs.
	 * @param List of <Run> with the running data.
	 */
	public Runs (List<Run> runs) { this.runs = runs ;}
	
	/**
	 * 
	 * @return Returns the list of runs with their details.
	 */
	public List<Run> getRuns() { return this.runs; }
	
	/**
	 * Search's the iterable list of all runs for desired date (MM/DD/YY) and returns the details of the run on provided date.
	 * @param Date
	 * @return The run on desired date.
	 */
	public Run getRun(String date) {
		Run dateRun = new Run();
		for (Run run: runs) {
			if (run.getDate().compareTo(date) == 0){ dateRun = run; }
		}
		return dateRun;
	}
	
	/**
	 * @param List of runs to search through.
	 * @return Fastest run.
	 */
	public Run getFastRun() {
		Run fastRun = new Run();
		int shortHour = 99;
		int shortMin = 99;
		int shortSec = 99;
		String delimiter = ":";
		
		for (Run run: runs) {
			String[] lineTokens = run.getTime().split(delimiter);
			
			int hour = Integer.parseInt(lineTokens[0]);
			int min = Integer.parseInt(lineTokens[1]);
			int seconds = Integer.parseInt(lineTokens[2]);
			
			if (hour <= shortHour && min <= shortMin && seconds <= shortSec) {
				fastRun = run;
				shortHour = hour;
				shortMin = min;
				shortSec = seconds;
			}
			
				
		}
		return fastRun;
	}
	
	/**
	 * @param List of runs to search through.
	 * @return Run with longest distance.
	 */
	public Run getLongRun() {
		Double longest = 0.00;
		Run longestRun = new Run();
		for (Run run : runs) {
			if (run.getDistance() > longest) {
				longest = run.getDistance();
				longestRun = run;				
			}			
		}
		return longestRun;
	}
	
	public Double getTotalDistance() {
		double totalDistance = 0;
		
		for (Run run: runs) {
			totalDistance += run.getDistance();
		}
		
		return (totalDistance*100)/100.00;
	}
	
	public String getTotalTime() {
		String totalTime = "00:00:00";
		Time timeAdder = new Time();
		for (Run run : runs) {
			if (run.getTime().compareTo("99:99:99") != 0)
			{
			totalTime = timeAdder.addTimes(run.getTime(),totalTime);
			}
		}
		
		return totalTime;
	}
	
	/**
	 * 
	 * @return returns number of runs in log file
	 */
	public int getRunCount() {
		return runs.size();
	}
}
