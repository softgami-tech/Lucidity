package com.lucidity;

import java.util.LinkedList;
import java.util.Queue;

//Input : [[1->2,1->3],[3,4,5],[2,4,5],[4,3,5]]
/**
* @doc
* @author EHTESHAM MAZHAR
* Driver code which initiate the entire delivery management process at lowest cost
*
*/
public class OrderDelivery {
	
	public static void main(String[] args) {
		
		Queue<GeoNode> geoNodes = new LinkedList<>();
		double minTimeToDeliverOrder = DeliveryManager.getMinTimeToDeliverOrder(geoNodes);
		System.out.println("Minimum distance codevered by delivery boy : "+minTimeToDeliverOrder);
	}
	
}
