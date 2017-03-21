package by.epam.lesson12.inner;

public class Smartphone {
	private String os;

	private String phoneModel;

	private Integer year;

	public Smartphone() {

	}

	public Smartphone(String os, String phoneModel, Integer year) {
		this.os = os;
		this.phoneModel = phoneModel;
		this.year = year;
	}

	private Battery battery; // ссылка на внутренний класс

	// объявление внутреннего класса
	private class Battery {
		private String code;

		private int capacity;
		private int charging;

		Battery(String code, int capacity, int charging) {
			this.code = code;
			this.capacity = capacity;
			this.charging = charging;

		}

		@Override
		public String toString() {
			return "Battery [code=" + code + ", capacity=" + capacity + ", charging=" + charging + "]";
		}

		public void launch() {
			System.out.println("The battery is inserted.");
		}

		double getChargingLevel()

		{
			double level = 0.0;
			level = charging * 100 / (double)capacity;
			return level;
		}

	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getPhoneModel() {
		return phoneModel;
	}

	public void setPhoneModel(String phoneModel) {
		this.phoneModel = phoneModel;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void init(String code, int capacity, int charging) {
		battery = new Battery(code, capacity, charging);

		battery.launch();

		System.out.println("Smartfone info:");
		System.out.println(this.toString());

		System.out.println("Battery info:");
		System.out.println(this.battery.toString());
		System.out.printf("The charging level is: %.2f %%\n" , battery.getChargingLevel());

	}

	@Override
	public String toString() {
		return "Smartphone [os=" + os + ", phoneModel=" + phoneModel + ", year=" + year + "]";
	}

}
