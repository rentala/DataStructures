package practice;

public class TestDrive {

	public static void main(String[] args) {
		PredictPrice();
	}
	public static Hotel[] getData()
	{
		Hotel[] hotels = new Hotel[20];
		hotels[0] = new Hotel(1, 550, 40);
		hotels[1] = new Hotel(1, 570, 42);
		hotels[2] = new Hotel(1, 600, 42);
		hotels[3] = new Hotel(2, 700, 70);
		hotels[4] = new Hotel(2, 750, 80);
		hotels[5] = new Hotel(2, 830, 90);
		hotels[6] = new Hotel(2, 800, 90);
		hotels[7] = new Hotel(2, 870, 93);
		hotels[8] = new Hotel(2, 940, 98);
		hotels[9] = new Hotel(2, 1000, 100);
		hotels[10] = new Hotel(1, 550, 44);
		hotels[11] = new Hotel(1, 575, 42);
		hotels[12] = new Hotel(1, 700, 46);
		hotels[13] = new Hotel(1, 721, 50);
		hotels[14] = new Hotel(1, 780, 66);
		hotels[15] = new Hotel(2, 770, 78);
		hotels[16] = new Hotel(2, 862, 89);
		hotels[17] = new Hotel(2, 879, 93);
		hotels[18] = new Hotel(2, 940, 98);
		hotels[19] = new Hotel(2, 999, 110);
		return hotels;
	}
	
	public static void PredictPrice()
	{
		PriceGenerator pc = new PriceGenerator(getData());
		Hotel hotel = new Hotel(1, 550, 0);
		hotel = pc.KNNRegression(3, hotel);
		System.out.println("For a hotel with bedroom " + hotel.bedrooms +
				" sqft " + hotel.sqft + " - Predicted price is " + hotel.price );
	}
}
