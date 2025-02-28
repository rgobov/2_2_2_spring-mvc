package web.model;

public class Car {
    private String manufactured;
    private String model;
    private int year;


    public Car(String manufactured, String model, int year) {
        this.manufactured = manufactured;
        this.model = model;
        this.year = year;
    }

    public String getManufactured() {
        return manufactured;
    }

    public void setManufactured(String manufactured) {
        this.manufactured = manufactured;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufactured='" + manufactured + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
