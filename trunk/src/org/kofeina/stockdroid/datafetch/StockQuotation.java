/**
 * 
 */
package org.kofeina.stockdroid.datafetch;

/**
 * @author halish
 * 
 */
public final class StockQuotation {
	private double close;
	private double max;
	private double min;
	private double open;
	private double rate;
	private int volume;
	
	public StockQuotation(double close, double max, double min, double open,
			double rate, int volume) {
		// TODO: Control the values!;
		this.close = close;
		this.max = max;
		this.min = min;
		this.open = open;
		this.rate = rate;
		this.volume = volume;
	}
	
	/**
	 * @return the close
	 */
	public double getClose() {
		return close;
	}
	/**
	 * @return the max
	 */
	public double getMax() {
		return max;
	}
	/**
	 * @return the min
	 */
	public double getMin() {
		return min;
	}
	/**
	 * @return the open
	 */
	public double getOpen() {
		return open;
	}
	/**
	 * @return the rate
	 */
	public double getRate() {
		return rate;
	}
	/**
	 * @return the volume
	 */
	public int getVolume() {
		return volume;
	}
}
