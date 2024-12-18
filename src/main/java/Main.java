import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car[] cars = new Car[3];

        for (int i = 0; i < cars.length; i++) {
            String carName;
            while (true) {
                System.out.println("Введите название машины №" + (i + 1) + ":");
                carName = scanner.nextLine();
                if (!carName.trim().isEmpty()) {
                    break;
                } else {
                    System.out.println("Название не должно быть пустым. Попробуйте еще раз.");
                }
            }
            int carSpeed = enterSpeed(scanner, i + 1);
            cars[i] = new Car(carName, carSpeed);
        }

        Race race = new Race(cars);
        Car favorite = race.findFavorite();

        System.out.println("Самая быстрая машина: " + favorite.getCarName());

        scanner.close();
    }

    private static int enterSpeed(Scanner scanner, int numberCar) {
        int carSpeed;
        while (true) {
            System.out.println("Введите скорость машины №" + numberCar + " (от 1 до 250):");
            try {
                carSpeed = Integer.parseInt(scanner.nextLine());
                if (carSpeed > 0 && carSpeed <= 250) {
                    break;
                } else {
                    System.out.println("Неправильная скорость. Попробуйте еще раз.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Пожалуйста, введите корректное целое число.");
            }
        }
        return carSpeed;
    }
}
