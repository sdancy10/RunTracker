

import java.util.ArrayList;
import java.util.List;
import java.io.*;

/**
 * 
 */

/**
 * @author Style
 *
 */
public class runInterpreter implements IrunInterpreter {

	private String fileName;
	/**
	 * @param Sets the name of the log file to "runLog.data" by default
	 */
	runInterpreter() { this.fileName = "runLog.data"; }
	
	/**
	 * @param String that contains the name of the run log file
	 */
	public runInterpreter(String fileName) { this.fileName = fileName; }
	
	@Override
	public List<Run> getRuns() {
		List<Run> runs = new ArrayList<Run>();
		try {
			BufferedReader data = new BufferedReader (new FileReader(fileName));
			
			String runData;
			while ((runData = data.readLine()) != null){
			String delimiter = " - ";
			//Line Tokens should contain 0 - Title, 1 - Date, 2 - distance, 3 - time
			String[] lineTokens = runData.split(delimiter);
			
			Run run = new Run();
			run.setTitle(lineTokens[0]);
			run.setDate(lineTokens[1]);
			run.setDistance(Double.parseDouble(lineTokens[2]));
			run.setTime(lineTokens[3]);
			
			runs.add(run);
			}
			data.close();
			
		} catch (IOException e) {
			System.out.print("Sorry but, '" + fileName + "' could not be found.");
			e.printStackTrace();
		}
		
		return runs;
	}

}
