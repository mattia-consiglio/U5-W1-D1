package mattiaconsiglio.U5W1D1.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
public class Pizza extends Food{
    private List<Topping> toppings = new ArrayList<>();


    public Pizza(String name, int calories, double price) {
        super(name, calories, price);
        this.toppings.add(new Topping("tomato"));
        this.toppings.add(new Topping("cheese"));
    }
    public Pizza(String name, int calories, double price, List<Topping> toppings) {
        this(name, calories, price);
        this.toppings.addAll(toppings);
    }

    @Override
    public String getName() {
        return this.name + " (" + this.toppings.toString() + ")";
    }
}
