package com.lealpha.visualalpha.client.strava.response;

import com.google.gson.annotations.SerializedName;

public class PolylineMapJsonStrava {
	
	@SerializedName("id")
	private String id;

	@SerializedName("polyline")
	private String polyline;

	@SerializedName("summary_polyline")
	private String summaryPolyline;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPolyline() {
		return polyline;
	}

	public void setPolyline(String polyline) {
		this.polyline = polyline;
	}

	public String getSummaryPolyline() {
		return summaryPolyline;
	}

	public void setSummaryPolyline(String summaryPolyline) {
		this.summaryPolyline = summaryPolyline;
	}	
}
