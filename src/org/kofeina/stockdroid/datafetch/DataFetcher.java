/**
 * 
 */
package org.kofeina.stockdroid.datafetch;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

/**
 * @author halish
 *
 */
abstract class DataFetcher {
	private HashMap<Date,StockQuotation> data;
	public HashMap<Date,StockQuotation> getDailyQuotations() { return this.data; } 

	private Date startDate;
	public Date getStartDate() { return this.startDate; }

	private Date endDate;
	public Date getEndDate() { return this.endDate; }
	
	private String ticking;
	/**
	 * @return the ticking
	 */
	public String getTicking() {
		return ticking;
	}

	protected DataFetcher() { super(); }
	
	public DataFetcher(String ticking, Date startDate, Date endDate) {
		this.ticking = ticking;
		this.fetch(startDate, endDate);
	}	
	
	public abstract void fetch();
	public void fetch(Date startDate, Date endDate) {
		if (startDate.before(endDate)) {
			this.startDate = startDate;
			this.endDate = endDate;
		}
		else {
			throw new IllegalArgumentException("startDate must be earlier than endDate!");
		}
		this.fetch();
	}
	
	ArrayList<Date> generateDatesList() {
		ArrayList<Date> output = new ArrayList<Date>();

		return output;
	}		
}

