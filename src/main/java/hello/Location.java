package hello;

import java.util.Date;

import javax.xml.crypto.Data;

import org.springframework.data.annotation.Id;

public class Location {
	@Id
	private String id;
	
	private double latitude;
	private double longtitude;
	private Date timestamp;
	
	public Location() {
		this.timestamp = new Date();
	}
	
	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongtitude() {
		return longtitude;
	}

	public void setLongtitude(double longtitude) {
		this.longtitude = longtitude;
	}
	
	public Date getTimestamp() {
		return timestamp;
	}
	
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
}
