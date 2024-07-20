package domain;

public class Car {
    final int MOVABLE_NUMBER = 4, START_POSITION = 0;
    private String carName;
    private int position;

    public Car(String carName) {
        this.carName = carName;
        this.position = START_POSITION;
    }

    public void move(int randomNumber) {
        if (randomNumber >= MOVABLE_NUMBER)
            ++position;
    }

    public String getCarName() {
        return carName;
    }

    public int getPosition() {
        return position;
    }
}
