package itstep.learning.oop;

import itstep.learning.oop.annotations.Product;
import itstep.learning.oop.annotations.Required;

import java.util.Locale;

@Product
public class Crossover extends Vehicle implements OffRoad {
    @Required
    private int suspensionHeight;

    public Crossover(String name, int suspensionHeight){
        super(name);
        this.setSuspensionHeight(suspensionHeight);
    }

    public int getSuspensionHeight() {
        return suspensionHeight;
    }

    public void setSuspensionHeight( int suspensionHeight ) {
        this.suspensionHeight = suspensionHeight;
    }

    @Override
    public String getInfo() {
        return String.format(Locale.ROOT, "Crossover '%s', suspension height: %s mm", super.getName(), this.getSuspensionHeight());
    }
}
