package practice;

import java.util.LinkedList;
import java.util.Queue;

public class PriceGenerator {

	private Hotel[] hotels;
	public PriceGenerator(Hotel[] hotels)
	{
		this.hotels = hotels;
	}
	public Hotel KNNRegression(int k, Hotel newHotel)
	{
		//Hotel[] kNearestHotels = new Hotel[k];
		HotelList kNearestHotels = new HotelList(k);
		int count = 1;
		for(Hotel hotel : hotels)
		{
			if(count ==10)
			{
				System.out.println();
			}
			hotel.proximity = calculateCloseness(hotel, newHotel);
			//System.out.println("Hotel " + count + " Proximity :" +hotel.proximity);
			kNearestHotels.add(hotel);
			count++;
		}
		newHotel.price = (int)kNearestHotels.averagePrice();
		return newHotel;
	}
	private double calculateCloseness(Hotel hotel, Hotel baseHotel)
	{
		//euclidean distance
		double x = Math.pow(Math.abs(hotel.bedrooms - baseHotel.bedrooms), 2);
		double y = Math.pow(Math.abs(hotel.sqft - baseHotel.sqft), 2);
		return Math.sqrt( x  + y)*100;
		 
	}

}
