package practice;

import java.util.LinkedList;
import java.util.function.Consumer;

public class HotelList {

	private LinkedList<Hotel> hotels;
	private double maxPF;
	private double minPF;
	private int k;
	public HotelList(int capacity)
	{
		this.k = capacity;
		//System.out.println("HotelList capacity " + this.k);
		hotels = new LinkedList<Hotel>();
	}
	public void add(Hotel hotel)
	{
		int index = 0;
		boolean isInserted = false;
		for(Hotel elem: hotels)
		{
			if(elem.proximity < hotel.proximity)
			{
				index++;
				continue;
			}
			else
			{
				if(index < k)
				{
					//System.out.println("Inserting at index " + index);
					hotels.add(index, hotel);
					hotels.removeLast();
					isInserted = true;
					break;
				}
				else
					break;
				
			}
		}
		//first k
		if(hotels.size() <= k && index < k && !isInserted)
		{
			hotels.add(hotel);
		}
		//System.out.println("After add elements");
		for(Hotel elem: hotels)
		{
			//System.out.print(elem.proximity+ " ");
			//System.out.println();
		}
		
	}
	public double averagePrice()
	{
		System.out.println("Reccomended Price");
		System.out.println("K Nearest neighbours as below:");
		double sum = 0;
		for(Hotel hotel : hotels)
		{
			System.out.println("Hotel: " + hotel.bedrooms + " sqft "+ hotel.sqft + " price " + hotel.price);
			sum +=hotel.price;
		}
		return sum/hotels.size();
	}
}
