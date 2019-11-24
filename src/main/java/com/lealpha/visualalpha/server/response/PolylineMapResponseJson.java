package com.lealpha.visualalpha.server.response;

import com.google.gson.annotations.SerializedName;

public class PolylineMapResponseJson {
	
	@SerializedName("id")
	private String id;

	@SerializedName("polyline")
	private String polyline;

	@SerializedName("summary_polyline")
	private String summaryPolyline;
	
	public PolylineMapResponseJson(String id, String polyline, String summaryPolyline) {
		this.id = id;
		this.polyline = polyline;
		this.summaryPolyline = summaryPolyline;
	}

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
