public class Car {
    private String carName = " ";
    private double milesDriven = 0;
    private double gallonsUsed = 0;
    
    public Car() {
        
    }
    
    public Car(String newName, double newMiles, double newGallons) {
        carName = newName;
        milesDriven = newMiles;
        gallonsUsed = newGallons;
    }
    
    public String getName() {
        return carName;
    }
    
    public void setName(String newName1) {
        carName = newName1;
    }
    
    public double getMiles() {
        return milesDriven;
    }
    
    public void setMiles(double newMiles1) {
        milesDriven = newMiles1;
    }
    
    public double getGallons() {
        return gallonsUsed;
    }
    
    public void setGallons(double newGallons1) {
        gallonsUsed = newGallons1;
    }
    
    public double calculateAverage() {
        double average = (int) ((milesDriven/gallonsUsed) * 10);
        average = (double) average/10;
        return average;
    }
    
    public String toString() {
        String str = (carName + " averaged " + calculateAverage() + " m/g ");
        return str;
    }
}
