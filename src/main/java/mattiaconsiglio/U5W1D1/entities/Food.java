package mattiaconsiglio.U5W1D1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public abstract class Food {
    protected String name;
    protected int calories;
    protected double price;

    public Food(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.getName() + "\t" + this.getCalories() + "\t\t\t" + this.getPrice();
    }
}
