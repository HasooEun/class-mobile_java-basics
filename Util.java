public class Util{
	public static double round(double dNumber, int position){
		double lBaseNumber = Math.pow(10, position);
		long lNumber = Math.round(dNumber * lBaseNumber);
		return lNumber / lBaseNumber;
	}
}