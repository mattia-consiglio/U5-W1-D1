package mattiaconsiglio.U5W1D1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@AllArgsConstructor
@Getter
@Setter
public class Menu {
    List<Pizza> pizzas;
    List<Topping> toppings;
    List<Drink> drinks;

    private void displayHeader() {
        System.out.println();
        System.out.println("Name\tCalories\tPrice");
    }


    public void displayMenu() {
        displayHeader();
        pizzas.forEach(System.out::println);
        displayHeader();
        toppings.forEach(System.out::println);
        displayHeader();
        drinks.forEach(System.out::println);
    }
}
