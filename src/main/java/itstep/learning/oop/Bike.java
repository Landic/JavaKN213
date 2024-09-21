package itstep.learning.oop;
import java.util.Locale;

public class Bike extends Vehicle implements Trailer {
    private String type;

    public Bike(String name, String type){
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
    public String trailerInfo() {
        return "Cradle trailer";
    }

    @Override
    public String getInfo() {
        return String.format(Locale.ROOT, "Bike '%s', type: %s", super.getName(), this.getType());
    }
}
