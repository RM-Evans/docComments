package docComments;


public class Television {
	
private int dID;
private String manufacturer;
private int resolution;
private int refreshRate;
private int size;

private static int count = 0;
private static final int SEED = 001; 


public Television( int manufacturer, int resolution, int refreshRate, int size ) {
	
	count++;  // Increment the static count
    this.setdID(SEED + count);  // Generate a unique ID for the device
	this.resolution = resolution;
	this.refreshRate = refreshRate;
	this.size = size;
}

public int getdID() {
	return dID;
}

public void setdID(int dID) {
	this.dID = dID;
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

public int getSize() {
	return size;
}
public void setSize(int size) {
	this.size = size;
}

public String getManufacturer() {
	return manufacturer;
}

public void setManufacturer(String manufacturer) {
	this.manufacturer = manufacturer;
}

public String toString(){
	return this.manufacturer + " " + this.size + "\" " + this.resolution + "p " + this.refreshRate + "hz";
}


}
