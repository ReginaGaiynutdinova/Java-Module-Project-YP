public class Car {
    private final String carName;
    private final int carSpeed;
    public Car(String carName, int carSpeed) {
        this.carName = carName;
        this.carSpeed = carSpeed;
    }
    public String getCarName() {
        return carName;
    }
    public int distanceDay() {
        return carSpeed * 24;
    }
}
