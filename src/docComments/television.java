package docComments;


public class television {
	
private int dID;
private String manufacturer;
private int resolution;
private int refreshRate;
private int size;

private static int count = 0;
private static final int SEED = 001; 


public television( int manufacturer, int resolution, int refreshRate, int size ) {
	
	count++;  // Increment the static count
    this.dID = SEED + count;  // Generate a unique ID for the device
	this.resolution = resolution;
	this.refreshRate = refreshRate;
	this.size = size;
}

public int getResolution() {
	return resolution;
}
public void setResolution(int resolution) {
	this.resolution = resolution;
}

public int getRefreshRate() {
	return refreshRate;
}
public void setRefreshRate(int refreshRate) {
	this.refreshRate = refreshRate;
}

public int getDimensions() {
	return size;
}
public void setDimensions(int dimensions) {
	this.size = dimensions;
}

public String getManufacturer() {
	return manufacturer;
}

public void setManufacturer(String manufacturer) {
	this.manufacturer = manufacturer;
}


}
