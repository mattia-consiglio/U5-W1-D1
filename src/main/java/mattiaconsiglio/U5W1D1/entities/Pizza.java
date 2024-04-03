package mattiaconsiglio.U5W1D1.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
public class Pizza extends Food {
    private List<Topping> toppings = new ArrayList<>();


    public Pizza(String name, List<Topping> basicToppings) {
        super(name);
        this.toppings.addAll(basicToppings);
    }

    public Pizza(String name, List<Topping> basicToppings, List<Topping> toppings) {
        this(name, basicToppings);
        this.toppings.addAll(basicToppings);
        this.toppings.addAll(toppings);
    }

    @Override
    public String getName() {
        return this.name + " (" + this.toppings.stream().map(Topping::getName).collect(Collectors.joining(", ")) + ")";
    }
}
