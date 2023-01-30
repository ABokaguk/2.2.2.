package web.model;

public class Car {
    private int id;
    private String model;
    private int years;

    public Car(int id, String model, int years) {
        this.id = id;
        this.model = model;
        this.years = years;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }
}