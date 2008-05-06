/**
 * 
 */
package org.kofeina.stockdroid.datafetch;
import java.util.HashMap;
import java.util.Date;

/**
 * @author halish
 *
 */
abstract class DataFetcher {
	private HashMap<Date,Double> data;
	private String ticking;

	public DataFetcher() {}
	
	public DataFetcher(String ticking, Date startDate, Date endDate) {
		this.ticking = ticking;
		if (startDate.before(endDate)) {
			this.startDate = startDate;
			this.endDate = endDate;
		}
		else {
			throw new IllegalArgumentException("startDate must be earlier than endDate!");
		}
		this.fetch();
	}
	
	/*
	 * 
	 */
	private Date startDate;
	public Date getStartDate() { return this.startDate; }
	public void setStartDate(Date startDate) {
		if (startDate.after(this.endDate)) {
			throw new IllegalArgumentException("startDate must be earlier then endDate!");
		}
		else {
			this.startDate = startDate;
		}
	}
	
	/*
	 * 
	 */
	private Date endDate;
	public Date getEndDate() { return this.endDate; }
	public void setEndDate(Date endDate) { 
		if (endDate.before(this.startDate)) {
			throw new IllegalArgumentException("endDate must be later than startDate!");
		}
		else {
			this.endDate = endDate;
		}
	}
	
	public abstract void fetch();
}
