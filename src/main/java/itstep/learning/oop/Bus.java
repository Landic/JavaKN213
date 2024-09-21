package itstep.learning.oop;

import java.util.Locale;

public class Bus extends Vehicle implements LargeSized {
    private int capacity;

    public Bus( String name, int capacity ) {
        super( name );
        this.setCapacity( capacity );
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity( int capacity ) {
        this.capacity = capacity;
    }

    @Override
    public String getInfo() {
        return String.format(
                Locale.ROOT,
                "Bus '%s', capacity: %d",
                super.getName(),
                this.getCapacity()
        );
    }
}


