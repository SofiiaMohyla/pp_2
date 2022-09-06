package Car;


/** Class Car */
public class Car {
    private int id;
    private String model;
    private long year, price, number;

    /** constructor  without parameters */
    public Car() {
    }

    /** constructor  with parameters */
    public Car(int id, String model, long year, long price, long number) {
        this.id = id;
        this.model = model;
        this.year = year;
        this.price = price;
        this.number = number;
    }

    /** getters and setters */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String surname) {
        this.model = model;
    }

    public long getYear() {
        return year;
    }

    public void setYear(long year) {
        this.year = year;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }


    @Override
    public String toString() {
        String text = String.format("id:  %d ,  model: %s,  year: %d,  price:  %5d $,  number:  %d", id, model, year, price, number);
        return text;
    }
}


