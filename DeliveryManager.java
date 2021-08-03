package com.lucidity;

import java.util.Queue;

/**
 * @docs
 * @author EHTESHAM MAZHAR
 * Class DeliveryManager manages the lowest cost of delivery.
 *   
 *
 */

public class DeliveryManager {
	
	/**
	 * 
	 * @param geoNodes
	 * @return minimum distance covered in the graph
	 */
	public static double getMinTimeToDeliverOrder(Queue<GeoNode> geoNodes) {
		double min_distance=0.0;
		
		for (GeoNode geoNode:geoNodes){
			min_distance=min_distance+Math.min(
					getHaversinDistance(geoNode,geoNode.getGn1()),getHaversinDistance(geoNode,geoNode.getGn2()));
		}
				
		return min_distance;
		
	}

	/**
	 * Utility method which return the distance between two geo location based on haversin formula
	 * @param GenNode gn1
	 * @param GeoNode gn2
	 * @return the distance between two geo location.
	 * 
	 */
	public static double  getHaversinDistance(GeoNode gn1,GeoNode gn2) {
		
		double lat1=gn1.getLat();
		double lon1=gn1.getLon();
		double lat2=gn2.getLat();
		double lon2=gn2.getLon();
	

		// distance between latitudes and longitudes
		double dLat = Math.toRadians(lat2 - lat1);
		double dLon = Math.toRadians(lon2 - lon1);

		//convert to radians
		lat1 = Math.toRadians(lat1);
		lat2 = Math.toRadians(lat2);

		//apply formula
		double a = Math.pow(Math.sin(dLat / 2), 2) +
               Math.pow(Math.sin(dLon / 2), 2) *
               Math.cos(lat1) *
               Math.cos(lat2);
		double rad = 6371;
		double c = 2 * Math.asin(Math.sqrt(a));
		return rad * c;
	}
}
