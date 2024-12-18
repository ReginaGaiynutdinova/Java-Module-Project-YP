public class Race {
    private final Car[] cars;

    public Race(Car[] cars) {
        this.cars = cars;
    }

    public Car findFavorite() {
        Car favorite = cars[0];
        int maxDistance = favorite.distanceDay();
        for (Car car : cars) {
            int distance = car.distanceDay();
            if (distance > maxDistance) {
                maxDistance = distance;
                favorite = car;
            }
        }
        return favorite;
    }
}