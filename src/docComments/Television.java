package docComments;


public class Television {
	
private int ID;
private String manufacturer;
private int resolution;
private int refreshRate;
private int size;

private static int count = 0;
private static final int SEED = 991; 


public Television( String manufacturer, int resolution, int refreshRate, int size ) {
	
	count++;  // Increment the static count
    this.setId(SEED + count);  // Generate a unique ID for the device
    this.manufacturer = manufacturer;
	this.resolution = resolution;
	this.refreshRate = refreshRate;
	this.size = size;
}

public int getId() {
	return ID;
}

public void setId(int ID) {
	this.ID = ID;
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
	return this.manufacturer + " | " + this.size + "\" | " + this.resolution + "p | " 
+ this.refreshRate + "hz | id: " + this.ID ;
}


}
