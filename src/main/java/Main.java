import java.util.Scanner;

class Car {
    private String name;
    private int speed;

    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }
}

class Race {
    private String currentLeader = "";
    private int maxDistance = 0;

    public void determineNewLeader(Car car) {
        int distance = car.getSpeed() * 24; // Дистанция за 24 часа
        if (distance > maxDistance) {
            maxDistance = distance;
            currentLeader = car.getName();
        }
    }

    public String getCurrentLeader() {
        return currentLeader;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Race race = new Race();

        for (int i = 1; i <= 3; i++) {
            System.out.println("Введите название машины №" + i + ":");
            String carName = scanner.next();

            int carSpeed;
            while (true) {
                System.out.println("Введите скорость машины №" + i + ":");
                carSpeed = scanner.nextInt();

                if (carSpeed > 0 && carSpeed <= 250) {
                    break; // корректная скорость, выходим из цикла
                } else {
                    System.out.println("Неправильная скорость. Введите значение от 1 до 250.");
                }
            }

            Car car = new Car(carName, carSpeed);
            race.determineNewLeader(car);
        }

        System.out.println("Самая быстрая машина: " + race.getCurrentLeader());
        scanner.close();
    }
}
