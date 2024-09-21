package itstep.learning.oop;

import java.util.Locale;

public class Car extends Vehicle {
    private String type;

    public Car(String name, String type){
        super(name);
        this.setType(type);
    }

    public String getType() {
        return type;
    }

    public void setType( String type ) {
        this.type = type;
    }

    @Override
    public String getInfo() {
        return String.format(Locale.ROOT, "Car '%s', type: %s", super.getName(), this.getType());
    }
}
