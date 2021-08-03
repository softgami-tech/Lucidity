package com.lucidity;

/**
 * @doc
 * @author EHTESHAM MAZHAR
 * This is pojo class which holds state of Geo locations and the directly mapped Geo location
 */

public class GeoNode {
	double lat;
	double lon;
	GeoNode gn1;
	GeoNode gn2;
	
	GeoNode(double lat, double lon){
		this.lat=lat;
		this.lon=lon;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLon() {
		return lon;
	}

	public void setLon(double lon) {
		this.lon = lon;
	}

	public GeoNode getGn1() {
		return gn1;
	}

	public void setGn1(GeoNode gn1) {
		this.gn1 = gn1;
	}

	public GeoNode getGn2() {
		return gn2;
	}

	public void setGn2(GeoNode gn2) {
		this.gn2 = gn2;
	}
}
