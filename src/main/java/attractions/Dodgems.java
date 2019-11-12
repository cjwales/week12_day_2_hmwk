package attractions;

import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    public double price;

    public Dodgems(String name, int rating, double price) {
        super(name, rating);
        this.price = price;
    }

    @Override
    public double defaultPrice() {
        return this.price;
    }

    public double priceForVisitor(Visitor visitor) {
        if (visitor.getAge() < 12) {
            return defaultPrice() / 2;
        } else {
            return defaultPrice();
        }
    }
}
