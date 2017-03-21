package by.epam.lesson12.inner;

public class SmartphoneAndCharger {

	private static String owner = "Mr X";
	private String phoneModel;

	public SmartphoneAndCharger(String phoneModel) {
		this.phoneModel = phoneModel;
	}

	public static class LifeCharger {
		private int  chargerId;
		
		LifeCharger ( int chargerId){
			this.chargerId = chargerId;
		}


		public static void use() {
			System.out.println();
			System.out.println("I have taken the charger device!");
		}

		public void chargingWhatYouWant() {
			System.out.println("I am charging any compatible device.");
		}

		public void chargingByDefault() {
			SmartphoneAndCharger smartphone = new SmartphoneAndCharger("iPhone 6 Plus");

			System.out.println("The device of " + owner + " is charging.");
			System.out.println("The smartphone " + smartphone.phoneModel + " is charging.");

		}
	}
}
