
package docComments;

/**
 * The Television class represents a television with specific attributes like
 * manufacturer, resolution, refresh rate, size, and a unique ID.
 */
public class Television {

	private int ID;
	private String manufacturer;
	private int resolution;
	private int refreshRate;
	private int size;

	private static int count = 0;
	private static final int SEED = 9999991;

	/**
	 * Constructs a new Television object with the specified manufacturer,
	 * resolution, refresh rate, and size. The ID is automatically generated.
	 *
	 * @param manufacturer The manufacturer of the television.
	 * @param resolution   The resolution of the television in pixels.
	 * @param refreshRate  The refresh rate of the television in Hz.
	 * @param size         The size of the television screen in inches.
	 */
	public Television(String manufacturer, int resolution, int refreshRate, int size) {

		count++;
		this.setId(SEED + count);
		this.manufacturer = manufacturer;
		this.resolution = resolution;
		this.refreshRate = refreshRate;
		this.size = size;
	}

	/**
	 * Gets the ID of the television.
	 *
	 * @return The ID of the television.
	 */
	public int getId() {
		return ID;
	}

	/**
	 * Sets the ID of the television.
	 *
	 * @param ID The ID to be set.
	 */
	public void setId(int ID) {
		this.ID = ID;
	}

	/**
	 * Gets the resolution of the television.
	 *
	 * @return The resolution of the television in pixels.
	 */
	public int getResolution() {
		return resolution;
	}

	/**
	 * Sets the resolution of the television.
	 *
	 * @param resolution The resolution to be set in pixels.
	 */
	public void setResolution(int resolution) {
		this.resolution = resolution;
	}

	/**
	 * Gets the refresh rate of the television.
	 *
	 * @return The refresh rate of the television in Hz.
	 */
	public int getRefreshRate() {
		return refreshRate;
	}

	/**
	 * Sets the refresh rate of the television.
	 *
	 * @param refreshRate The refresh rate to be set in Hz.
	 */
	public void setRefreshRate(int refreshRate) {
		this.refreshRate = refreshRate;
	}

	/**
	 * Gets the size of the television screen.
	 *
	 * @return The size of the television screen in inches.
	 */
	public int getSize() {
		return size;
	}

	/**
	 * Sets the size of the television screen.
	 *
	 * @param size The size to be set in inches.
	 */
	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * Gets the manufacturer of the television.
	 *
	 * @return The manufacturer of the television.
	 */
	public String getManufacturer() {
		return manufacturer;
	}

	/**
	 * Sets the manufacturer of the television.
	 *
	 * @param manufacturer The manufacturer to be set.
	 */
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	/**
	 * Returns a string representation of the Television object.
	 *
	 * @return A string containing the manufacturer, size, resolution, refresh rate,
	 *         and ID of the television.
	 */
	@Override
	public String toString() {
		return this.manufacturer + " | " + this.size + "\" | " + this.resolution + "p | " + this.refreshRate
				+ "hz | id: " + this.ID;
	}

}
