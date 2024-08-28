package docComments;

public class television {
private int ID;
private int count;
private int resolution;
private int refreshRate;
private int dimensions;



public television(int iD, int count, int resolution, int refreshRate, int dimensions) {
	
	this.ID = iD;
	this.resolution = resolution;
	this.refreshRate = refreshRate;
	this.dimensions = dimensions;
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
	return dimensions;
}
public void setDimensions(int dimensions) {
	this.dimensions = dimensions;
}

public int getCount() {
	return count;
}

public void setCount(int count) {
	this.count = count;
}
}
