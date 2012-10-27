package car;

public class Car {
	
    private String make = " ", model = " ", year = " ", price =" ";
    
    public String getMake() {
    	return make;
    }
    
    public String getModel() {
    	return model;
    }
    
    public String getYear() {
    	return year;
    }
    
    public String getPrice() {
    	return price;
    }
    
    public void setMake(String newMake) {
    	make = newMake;
    }
    
    public void setModel(String newModel) {
    	model = newModel;
    }
    
    public void setYear(String newYear) {
    	year = newYear;
    }
    
    public void setPrice(String newPrice) {
    	price = newPrice;
    }
    
    Car(String newMake, String newModel, String newYear, String newPrice) {
    	make = newMake;
    	model = newModel;
    	year = newYear;
    	price = newPrice;
    }
	public @Override String toString() {
		return make + " " + model + " " + year + " " + price;
	}
}
