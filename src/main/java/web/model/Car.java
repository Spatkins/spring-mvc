package web.model;


public class Car {
    private String color;
    private String engineType;
    private int wheels;

    public Car() {
    }

    public Car(String color, String engineType, int wheels) {
        this.color = color;
        this.engineType = engineType;
        this.wheels = wheels;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", engineType='" + engineType + '\'' +
                ", wheels=" + wheels +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (wheels != car.wheels) return false;
        if (color != null ? !color.equals(car.color) : car.color != null) return false;
        return engineType != null ? engineType.equals(car.engineType) : car.engineType == null;
    }

    @Override
    public int hashCode() {
        int result = color != null ? color.hashCode() : 0;
        result = 31 * result + (engineType != null ? engineType.hashCode() : 0);
        result = 31 * result + wheels;
        return result;
    }
}
