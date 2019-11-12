package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, ITicketed {

    private double price;

    public RollerCoaster(double price, String name, int rating) {
        super(name, rating);
        this.price = price;
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getHeight() >= 145 && visitor.getAge() >= 12) {
            return true;
        } else {
            return false;
        }
    }

    public double defaultPrice() {
        return this.price;
    }

    public double priceForVisitor(Visitor visitor) {
        if (visitor.getHeight() >= 200) {
            return defaultPrice() * 2;
        } else {
            return defaultPrice();
        }
    }
}
